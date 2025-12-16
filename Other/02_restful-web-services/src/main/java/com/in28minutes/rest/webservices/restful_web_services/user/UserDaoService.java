package com.in28minutes.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static int userId = 0;
    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User(++userId, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userId, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++userId, "Jim", LocalDate.now().minusYears(15)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User SaveUser(User user) {
        user.setId(++userId);
        users.add(user);
        return user;
    }
}
