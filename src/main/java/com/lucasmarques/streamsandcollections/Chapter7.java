package com.lucasmarques.streamsandcollections;

import com.lucasmarques.lambda.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lucascmarques on 12/06/17.
 */
public class Chapter7 {

    public static void main(String[] args) {

        User user1 = new User("Paulo Silveira", 150, null);
        User user2 = new User("Rodrigo Turini", 120, null);
        User user3 = new User("Guilherme Silveira", 190, null);
        List<User> users = Arrays.asList(user1, user2, user3);
        users.sort(Comparator.comparing(User::getPoints).reversed());

        users.stream().filter(u -> u.getPoints() > 120).forEach(System.out::println);

        List<User> users2 = new ArrayList<User>();
        users.stream().filter(u -> u.getPoints() > 120).forEach(users2::add);

        List<User> users3 = users.stream().filter(u -> u.getPoints() > 120).collect(Collectors.toList());

        Set<User> set = users.stream().collect(Collectors.toCollection(HashSet::new));

        List<Integer> points = users.stream().map(u -> u.getPoints()).collect(Collectors.toList());
        List<Integer> points2 = users.stream().map(User::getPoints).collect(Collectors.toList());

        Double averagePoints = users.stream().mapToInt(User::getPoints).average().getAsDouble();

        OptionalDouble averagePointsOptional = users.stream().mapToInt(User::getPoints).average();
        Double averagePoints2 = averagePointsOptional.orElse(0.00);

        users.stream().mapToInt(User::getPoints).average().orElseThrow(IllegalAccessError::new);

        users.stream().mapToInt(User::getPoints).average().ifPresent(System.out::println);

        Optional<User> max = users.stream().max(Comparator.comparingInt(User::getPoints));
        Optional<String> maxString = users.stream().max(Comparator.comparingInt(User::getPoints)).map(User::getName);

    }

}
