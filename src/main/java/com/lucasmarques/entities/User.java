package com.lucasmarques.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lucascmarques on 04/06/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int points;
    private String moderator;

    public User(String name) {
        this.name = name;
    }

}
