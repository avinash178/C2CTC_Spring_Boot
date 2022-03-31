package com.placement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.placement.entities.User;
import com.placement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/users")                            // getting all college
	public ResponseEntity<List<User>> getUser(){
		List<User>list= userservice.getAllUser();
		if (list.size()<= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/user/{id}")                             //getting College by id
	public ResponseEntity<User> getUser(@PathVariable("id") long id){
		User user=userservice.getUserById(id);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(user));
	}
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User u=null;
		try {
			u = this.userservice.addUser(user);
			System.out.println(user);
			return ResponseEntity.of(Optional.of(u));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable("userId") long userId){
		
		try {
			this.userservice.deleteUser(userId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		catch(Exception e)
		{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	@PutMapping("/user/{userId}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("userId") long userId){
		try {
			this.userservice.updateUser(user, userId);
			return ResponseEntity.ok().body(user);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	

	
}
