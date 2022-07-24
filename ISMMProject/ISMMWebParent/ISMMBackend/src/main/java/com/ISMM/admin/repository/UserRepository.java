package com.ISMM.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ISMM.common.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u "
			+ "WHERE u.email = :email")
	public User getUserByEmail(@Param("email") String email);
	
	public User getUserById (@Param("id") Integer id);
	
	
	public Long countById(Integer id) ;
	
}
