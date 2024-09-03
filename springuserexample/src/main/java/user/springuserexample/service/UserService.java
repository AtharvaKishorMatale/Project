package user.springuserexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.springuserexample.entity.User;
import user.springuserexample.repository.UserRepo;

import java.util.List;
@Service
public class UserService {
	//curd operation services this class is performing
		@Autowired   //to have an interco
		//cnnection between classes we use autowired
		private UserRepo urepo;
		
		//adding employee details
		 public User addUser(User user) {
		        return urepo.save(user);
		    }

		    public List<User> getUser() {
		        return urepo.findAll();
		}


}
