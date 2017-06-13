package com.lucasmarques.entities;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lucascmarques on 12/06/17.
 */
@Data
public class Group {

    private Set<User> users = new HashSet<User>();

    public void add(User user) {
        this.users.add(user);
    }

}
