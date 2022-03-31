package com.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.placement.entities.User;
import com.placement.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository urepository;
	
	// get all user
		public List<User> getAllUser(){
			List<User> list=(List<User>)this.urepository.findAll();
			return list;
		}
		// get single user
		public User getUserById(long id) {
			User user=null;
			try {
				user=this.urepository.findById(id);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return user;
		}
		//add user
				public User addUser(User user) {
					User result=this.urepository.save(user);	
					return result;
					
				}
				//delete user
				public void deleteUser(long id) {
					urepository.deleteById(id);
				}
				//update the user
				public void updateUser(User user, long id) {
					user.setId(id);
					urepository.save(user);
				}
}
