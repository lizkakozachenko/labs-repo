package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();

        System.out.println(" Регистрация ");
        try {
            User alice = new User("alice", "alice@mail.com", "secret123", 25);
            users.put(alice.getUsername(), alice);
            System.out.println("OK: " + alice);
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            User bob = new User("bob", "bob@mail.com", "qwerty1", 30);
            users.put(bob.getUsername(), bob);
            System.out.println("OK: " + bob);
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Плохая регистрация ");
        try {
            new User("charlie", "charlie@mail", "123", 20);
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
//гуд
        System.out.println("\n Вход ");
        try {
            String name = "alice";
            String pass = "secret123";

            User u = users.get(name);
            if (u == null) {
                throw new UserNotFoundException("Нет пользователя: " + name);
            }
            u.authenticate(pass);
            System.out.println("Вошёл: " + u);
        } catch (UserNotFoundException | AuthenticationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
//пароль
        try {
            String name = "alice";
            String pass = "wrong";

            User u = users.get(name);
            if (u == null) {
                throw new UserNotFoundException("Нет пользователя: " + name);
            }
            u.authenticate(pass);
        } catch (UserNotFoundException | AuthenticationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
//не найден
        try {
            String name = "ghost";
            User u = users.get(name);
            if (u == null) {
                throw new UserNotFoundException("Нет пользователя: " + name);
            }
        } catch (UserNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\nОбновление email ");
        try {
            User alice = users.get("alice");
            alice.updateEmail("alice.new@mail.com");
            System.out.println("Новый email: " + alice.getEmail());
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}