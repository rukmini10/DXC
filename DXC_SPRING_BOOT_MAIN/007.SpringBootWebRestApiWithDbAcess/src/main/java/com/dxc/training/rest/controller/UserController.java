package com.dxc.training.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.rest.dao.UserRepository;
import com.dxc.training.rest.model.User;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	//1.add new user
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}

	//2.remove existing user
		@RequestMapping(value="/users/{userid}",method=RequestMethod.DELETE)
		public String delUser(@PathVariable Integer userid) {
			userRepo.deleteById(userid);
			return "Record with userid:"+userid+" has been deleted..";
		}
		
	//3. To check user by userid
		@RequestMapping(value="/users/{userid}",method=RequestMethod.GET)
		public String checkUser(@PathVariable Integer userid) {
			if(userRepo.existsById(userid)) {
				return "Record with user id:"+userid+" is existing.."; 
			}else {
				return "Record with user id:"+userid+" does not exist..";
			}
		}
	//4. Count number of users
		@RequestMapping(value="/users/count",method=RequestMethod.GET)
		public String countUser() {
			long count=userRepo.count();
			if(count>0) {
				return "Number of records found:"+count;
			}else {
				return "No record found..";
			}
			
		}
		
		//5.to get user details by user id
		@RequestMapping(value="/user/{userid}", method=RequestMethod.GET)
		public Optional <User> getUser(@PathVariable Integer userid){
			Optional<User> user=userRepo.findById(userid);
			return user;
		}
		
			//6get all user details
		@RequestMapping(value="/users",method=RequestMethod.GET)
		public List<User> getAllUsers(){
			List<User> list=(List<User>) userRepo.findAll();
			return list;
		}

}
