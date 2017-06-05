package com.lucasmarques.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by lucascmarques on 04/06/17.
 */
public class Chapter2 {

    public static void main(String[] args) {

        User user1 = new User("Paulo Silveira", 150, null);
        User user2 = new User("Rodrigo Turini", 120, null);
        User user3 = new User("Guilherme Silveira", 190, null);
        List<User> users = Arrays.asList(user1, user2, user3);
        for(User u : users) {
            System.out.println(u.getName());
        }

        Counter mostrador = new Counter();
        users.forEach(mostrador);

        users.forEach(new Consumer<User>() {
            public void accept(User u) {
                System.out.println(u.getName());
            }
        });

        Consumer<User> counter = u -> System.out.println(u.getName());

        users.forEach(u -> System.out.println(u.getName()));
        
    }

}
