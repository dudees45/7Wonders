package user;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String pseudo;
    private List<User> amis;

    public User(String pseudo) {
        this.pseudo = pseudo;
        this.amis = new ArrayList<>();
    }
}
