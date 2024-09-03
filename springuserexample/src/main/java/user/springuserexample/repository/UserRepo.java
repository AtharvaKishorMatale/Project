package user.springuserexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user.springuserexample.entity.User;
 
public interface UserRepo extends JpaRepository<User,Long> //Integer data type is the primary key data type i.e we need to give
//telling to jpa repository that to take my class Employee  
 {
	

}
