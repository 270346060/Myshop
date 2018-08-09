package myshop.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import myshop.model.User;

public interface UserMapper {

	void register(@Param("username") String username, 
				  @Param("password") String encodedPassword);

	User findOneByUsername(String username);

	void updateLastLoginTime(@Param("id")Long id, 
							@Param("date")Date date);

}
