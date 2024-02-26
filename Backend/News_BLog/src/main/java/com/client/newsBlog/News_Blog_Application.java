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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties
public class News_Blog_Application {



	public static void main(String[] args) {
		SpringApplication.run(News_Blog_Application.class, args);
	}

//	@Bean
//	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository,
//						  MerchantTypeRepository merchantTypeRepository){
//		return args -> {
//			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;
//			System.out.println("*** Added admin with Phonenumber: 'admin' and password '123' ***");
//			roleRepository.save(new Role("ADMIN"));
//			roleRepository.save(new Role("SUB ADMIN"));
//			roleRepository.save(new Role("USER"));
//			roleRepository.save(new Role("NURSE"));
//			roleRepository.save(new Role("PHYSIO"));
//			roleRepository.save(new Role("PATIENT"));
//			roleRepository.save(new Role("MERCHANT"));
////			roleRepository.save(new Role("ASSIGNED PERSON"));
//
//			merchantTypeRepository.save(new MerchantType("Ambulance","Service"));
//			merchantTypeRepository.save(new MerchantType("HOSPITAL","Service"));
//			merchantTypeRepository.save(new MerchantType("FOOD","Service"));
//			merchantTypeRepository.save(new MerchantType("BLOOD BANK","Service"));
//			merchantTypeRepository.save(new MerchantType("TRANSLATOR","Merchant"));
//			merchantTypeRepository.save(new MerchantType("ATTENDANT","Merchant"));
//			merchantTypeRepository.save(new MerchantType("ACCOMMODATION","Merchant"));
//			merchantTypeRepository.save(new MerchantType("TRANSPORTATION","Merchant"));
//
//
//			User admin = new User("admin", "123", "ADMIN"); //Password not hashed. Need to add hashed password.
//			userRepository.save(admin);
//		};
//	}

}
