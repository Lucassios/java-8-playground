package com.lucasmarques.defaultmethods;

import com.lucasmarques.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucascmarques on 08/06/17.
 */
public class Chapter4 {

    public static void main(String[] args) {

        User user1 = new User("user1", 100, null);
        User user2 = new User("user2", 120, null);
        User user3 = new User("user3", 80, null);

        List<User> listUser = new ArrayList<User>();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);

        listUser.removeIf(u -> u.getPoints() > 100);
        System.out.println(listUser);

    }
}
