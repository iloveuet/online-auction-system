package org.example.model;

public abstract class User {
    private String userId;
    private String username;
    private String password;
    private String email;

    protected User(String userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }
    public void logout() {
        System.out.println(username + " logged out!");
    }

    public abstract String getRole();

    public String getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
