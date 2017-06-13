package com.lucasmarques.lambda;

import com.lucasmarques.entities.User;

import java.util.function.Consumer;

/**
 * Created by lucascmarques on 04/06/17.
 */
public class Counter implements Consumer<User> {

    public void accept(User user) {
        System.out.println(user.getName());
    }

}
