package dev.que;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Paul", "Otto", "Frank", "Jamie", "Rixa", "Aya"};
        List<String> namesList = Arrays.asList(names);
        namesList.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));

        namesList.replaceAll(s -> s.toUpperCase());
        namesList.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));

        namesList.replaceAll(s -> s + " " + (char) new Random().nextInt('A', 'Z' + 1) +".");
        namesList.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));

        UnaryOperator<String> reverseName = s -> new StringBuilder(s.split(" ")[0]).reverse()
                .insert(0, " ").insert(0, s.split(" ")[1]).insert(0, " ")
                .insert(0, s.split(" ")[0]).toString();
        namesList.replaceAll(reverseName);
        namesList.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));

        List<String> notPalindromeNames = new ArrayList<>(namesList);
        notPalindromeNames.removeIf(s -> s.split(" ")[0].equals(s.split(" ")[2]));
        notPalindromeNames.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));
    }
}