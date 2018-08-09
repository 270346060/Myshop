package myshop.config;

import java.util.Arrays;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import myshop.model.User;


//点击登陆按钮跳转
public class UserDetailsImpl extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 1L;
	private User user;
    
    public UserDetailsImpl(User user) {
    	
        super(user.getUsername(), 
              user.getPassword(), 
              true, true, true, true, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
         
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }
}
