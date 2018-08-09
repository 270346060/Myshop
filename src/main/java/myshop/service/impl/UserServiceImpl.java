package myshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import myshop.mapper.UserMapper;
import myshop.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImpl(UserMapper userMapper, PasswordEncoder passwordEncoder) {
		this.userMapper = userMapper;
		this.passwordEncoder = passwordEncoder;
	}
	

	@Override
	public void register(String username, String password) {
		String encodedPassword = passwordEncoder.encode(password);
		userMapper.register(username,encodedPassword);
	}


}
