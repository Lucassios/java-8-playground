package com.lucasmarques.streamsandcollections;

import com.lucasmarques.entities.Group;
import com.lucasmarques.entities.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by lucascmarques on 12/06/17.
 */
public class Chapter8 {

    public static void main(String[] args) {

        User user1 = new User("Paulo Silveira", 150, null);
        User user2 = new User("Rodrigo Turini", 120, null);
        User user3 = new User("Guilherme Silveira", 190, null);
        List<User> users = Arrays.asList(user1, user2, user3);

        Optional<User> optionalUser = users.stream().filter(u -> u.getPoints() > 100).findAny();

        // peek executes a function every time a element is processed by the stream
        users.stream().filter(u -> u.getPoints() > 120).peek(System.out::println).findAny();

        int total1 = users.stream().mapToInt(User::getPoints).sum();
        int total2 = users.stream().mapToInt(User::getPoints).reduce(0, Integer::sum);

        IntStream.range(0, 25).forEach(System.out::println);

        Group englishSpeakers = new Group();
        englishSpeakers.add(user1);
        englishSpeakers.add(user2);

        Group spanishSpeakers = new Group();
        spanishSpeakers.add(user2);
        spanishSpeakers.add(user3);

        List<Group> groups = Arrays.asList(englishSpeakers, spanishSpeakers);

        groups.stream().flatMap(g -> g.getUsers().stream()).distinct().forEach(System.out::println);

    }

}
