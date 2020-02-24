package com.in28minutes.learning.jpa.jpain10steps;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// If you want to insert some values when the application starts up
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        log.info("New User is created: " + user);
    }
}
