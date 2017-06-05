package com.lucasmarques.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by lucascmarques on 04/06/17.
 */
@Data
@AllArgsConstructor
public class User {

    private String name;
    private int points;
    private String moderator;

}
