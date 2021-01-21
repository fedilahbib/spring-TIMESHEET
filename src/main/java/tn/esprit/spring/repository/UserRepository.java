package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	List<User> retrieveAllUsers(); 
	User addUser(User u);
	//void deleteUser(Long id);
		//void deleteUser(String id);
	User updateUser(User u);
	List<User> findByIdGreaterThan(int id);
	User retrieveUser(Long id);
	User retrieveUser(String id);
	List<User> findByFirstName(String fname);
	List<User> findByLastName(String lname);
}
