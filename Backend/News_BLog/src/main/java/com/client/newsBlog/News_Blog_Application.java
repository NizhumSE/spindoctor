package com.client.newsBlog;

//import com.attrabit.wellax_.config.TwilioOTPConfig;
//import com.attrabit.wellax_.model.MerchantType;
//import com.attrabit.wellax_.model.Role;
//import com.attrabit.wellax_.model.User;
//import com.attrabit.wellax_.repository.MerchantTypeRepository;
//import com.attrabit.wellax_.repository.RoleRepository;
//import com.attrabit.wellax_.repository.UserRepository;
//import com.twilio.Twilio;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import com.client.newsBlog.model.Role;
import com.client.newsBlog.model.User;
import com.client.newsBlog.repository.RoleRepository;
import com.client.newsBlog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties
public class News_Blog_Application {

	public static void main(String[] args) {
		SpringApplication.run(News_Blog_Application.class, args);
	}

	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			Role adminRole = roleRepository.findByRoleName("ADMIN");
			if(adminRole != null){
				System.out.println("*** Admin already exists ***");
				return;
			}
			System.out.println("*** Added admin with Email: 'admin@admin.com' and password 'admin' ***");
			adminRole = new Role("ADMIN");
			roleRepository.save(adminRole);

			String password = passwordEncoder.encode("admin");
			User adminUser = new User("Admin", "admin@admin.com", password, "ADMIN");
			userRepository.save(adminUser);
		};
	}

}
