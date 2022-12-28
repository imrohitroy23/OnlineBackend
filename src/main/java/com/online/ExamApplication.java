package com.online;

// import java.util.HashSet;
// import java.util.Set;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.online.model.Role;
// import com.online.model.User;
// import com.online.model.UserRole;


@SpringBootApplication
public class ExamApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("STarting code");

	// 	User user=new User();
	// 	user.setFirstName("Ananth");
	// 	user.setEmail("rohit@mail.com");
	// 	user.setPassword("hello");
	// 	user.setLastName("Roy");
	// 	user.setUsername("ananthroy23");
	// 	user.setProfile("44.png");

	// 	Role role1=new Role();
	// 	role1.setRoleId(44);
	// 	role1.setRoleName("Admin");

	// 	Set<UserRole> userRoleSet=new HashSet<>();
	// 	UserRole userRole=new UserRole();
	// 	userRole.setRole(role1);
	// 	userRole.setUser(user);
	// 	userRoleSet.add(userRole);
	// 	User user1=this.userService.createUser(user, userRoleSet);
	// 	System.out.println(user1.getUsername());
	// 
}

}
