package com.example.day84mysqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Day84MysqlDemoApplication {

//    private static final Logger log = LoggerFactory.getLogger(Day84MysqlDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Day84MysqlDemoApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(UserRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new User("Jack", "jack123@mail.com"));
//            repository.save(new User("Miguel", "miguel_l@mail.com"));
//            repository.save(new User("Kimmy", "gardenqueen45@mail.com"));
//            repository.save(new User("Saj", "Saj_Padu@mail.com"));
//            repository.save(new User("Lusia", "Lusia89@mail.com"));
//
//            // fetch all customers
//            log.info("Users found with findAll():");
//            log.info("-------------------------------");
//            for (User user : repository.findAll()) {
//                log.info(user.toString());
//            }
//            log.info("");
//
//            // fetch an individual user by ID
//            User user = repository.findById(1L);
//            log.info("User found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(user.toString());
//            log.info("");
//
//            // fetch user by last name
//            log.info("user found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByName("Saj").forEach(saj -> {
//                log.info(saj.toString());
//            });
//            // for (Customer bauer : repository.findByLastName("Bauer")) {
//            // 	log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//
//    }
}
