package com.lucasmarques.methodreference;

import com.lucasmarques.entities.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by lucascmarques on 12/06/17.
 */
public class Chapter6 {

    public static void main(String[] args) {

        User user1 = new User("user1", 100, null);
        User user2 = new User("user2", 120, null);
        User user3 = new User("user3", 80, null);

        List<User> listUser = new ArrayList<User>();
        listUser.add(user3);
        listUser.add(user1);
        listUser.add(user2);

        Function<User, String> functionGetName = User::getName;
        listUser.sort(Comparator.comparing(functionGetName));
        listUser.sort(Comparator.comparing(User::getName));

        Comparator.comparingInt(User::getPoints).thenComparing(User::getName);

        User lucas = new User("lucas", 100, null);
        Runnable getPointsRunnable = lucas::getPoints;
        getPointsRunnable.run();

        Consumer<User> consumerUser = User::getModerator;
        consumerUser.accept(lucas);

        listUser.forEach(System.out::println);

        Supplier<User> userFactory = User::new;
        User user4 = userFactory.get();

        Function<String, User> userContructorName = User::new;
        User user5 = userContructorName.apply("user5");


    }

}
