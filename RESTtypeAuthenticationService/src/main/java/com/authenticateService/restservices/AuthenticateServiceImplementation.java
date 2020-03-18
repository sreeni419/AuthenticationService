package com.authenticateService.restservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.authenticateService.dao.HibernateUtil;
import com.authenticationService.domain.UserDo;



@Path("/authenticatationservice")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class AuthenticateServiceImplementation implements AuthenticationService {

	
	
	@GET
	@Path("/{Userid}/{password}/authenticateuser")
	@Override
	public ResponseClass authenticateSkyTraveler(@PathParam("Userid")String useraId,@PathParam("password")String password) {
		ResponseClass response= new ResponseClass();
		Session session = HibernateUtil.openSession();

		session.beginTransaction();

		@SuppressWarnings("unchecked")
		// for hql query lanuguage,need to use entity names (UserDo) rather than names
		//  which defined in the db tables(user_table)
		Query<UserDo> createdQuery = session.createQuery("from UserDo   ");
		System.out.println("*******entering main");
		List<UserDo> userDo = createdQuery.getResultList();
		for (UserDo userDO : userDo) {
			
	/*		System.out.println(userDO.getPassword());*/
			if (userDO.getUserID().equals(useraId)) {
				if(userDO.getPassword().equals(password)) {
				response.setStatus(true);
				response.setMessage("valid user");
			} else {
				System.out.println();
				response.setStatus(false);
			response.setMessage("invalid user");
			}
				}else {
				System.out.println();
				response.setStatus(false);
			response.setMessage("invalid user");
			}
		}
			

		return response;
	}

	

}
