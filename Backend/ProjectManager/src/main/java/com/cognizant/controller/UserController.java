package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.User;
import com.cognizant.model.UserRecord;
import com.cognizant.service.UserService;

@RestController
@RequestMapping("/projectmanager/user")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping("/saveUsers")
	public User saveUser(@RequestBody UserRecord userRecord) {
		return userService.saveUser(userRecord);
	}

	@GetMapping("/getAllUsers")
	public List<User> getAll() {
		return userService.getAll();
	}

	@PutMapping("/upadateUsers")
	public User updateUser(@RequestBody UserRecord userRecord) {
		return userService.saveUser(userRecord);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable ("id") Long userId){
		userService.deleteUser(userId);
		return "user deleted successfully";
	}

}
