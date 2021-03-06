package com.haike.web.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.haike.web.entity.UserInfo;

/**
 * @author xiaoming
 *
 */
@Repository
public interface UserDao {
	public int addUser(UserInfo userInfo);

	public int updateUser(UserInfo userInfo);

	public int deleteUser(@Param("id") String id);

	public UserInfo queryUserById(@Param("id") String id);
	
	public UserInfo queryUserByEmail(@Param("email") String email);
	
	public UserInfo queryUserByUserName(@Param("userName") String userName);
	
	public UserInfo queryUserByUserNameAndEmail(@Param("userName") String userName, @Param("email") String email);
	
	public List<UserInfo> queryUsers();
}
