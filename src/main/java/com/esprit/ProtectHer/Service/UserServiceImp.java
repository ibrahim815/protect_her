package com.esprit.ProtectHer.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.esprit.ProtectHer.Repository.UserRepository;
import com.esprit.ProtectHer.entity.User;





@Service

public class UserServiceImp implements UserServiceIm{
	@Autowired
	UserRepository userReposository;
	



	@Override
	public User addUser(User user) {
		userReposository.save(user);
		return user;
	}
	
}
