package pages.domain;

import lombok.Data;

@Data
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
