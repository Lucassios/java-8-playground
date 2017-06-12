package com.lucasmarques.sorting;

import com.lucasmarques.lambda.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * Created by lucascmarques on 08/06/17.
 */
public class Chapter5 {

    public static void main(String[] args) {

        User user1 = new User("user1", 100, null);
        User user2 = new User("user2", 120, null);
        User user3 = new User("user3", 80, null);

        List<User> listUser = new ArrayList<User>();
        listUser.add(user3);
        listUser.add(user1);
        listUser.add(user2);

        listUser.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println(listUser);

        listUser.sort(Comparator.comparing(u -> u.getPoints()));
        System.out.println(listUser);

        List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
        palavras.sort(Comparator.naturalOrder());

        Function<User, Integer> extraiPontos = u -> u.getPoints();
        Comparator<User> comparator = Comparator.comparing(extraiPontos);
        listUser.sort(comparator);

        // avoid auto-boxing int to Integer
        ToIntFunction<User> extraiPontosToInt = u -> u.getPoints();
        comparator = Comparator.comparingInt(extraiPontosToInt);
        listUser.sort(comparator);

    }

}
