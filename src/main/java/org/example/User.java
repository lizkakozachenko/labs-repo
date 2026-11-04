package org.example;

public class User {
    private String username;
    private String email;
    private String password;
    private int age;

    public User(String username, String email, String password, int age)
            throws InvalidUserDataException {

        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new InvalidUserDataException("Неверный email: " + email);
        }

        if (password == null || password.length() < 6) {
            throw new InvalidUserDataException("Пароль слишком короткий");
        }

        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    public void authenticate(String password) throws AuthenticationException {
        if (!this.password.equals(password)) {
            throw new AuthenticationException("Неверный пароль");
        }
    }

    public void updateEmail(String newEmail) throws InvalidUserDataException {
        if (newEmail == null || !newEmail.contains("@") || !newEmail.contains(".")) {
            throw new InvalidUserDataException("Неверный email: " + newEmail);
        }
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "User{" + username + ", " + email + ", age=" + age + "}";
    }
}