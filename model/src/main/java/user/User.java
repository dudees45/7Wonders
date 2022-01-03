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

    public void addFriend(String pseudo){
        this.amis.add(this.getUserByPseudo(pseudo));
    }


    public User getUserByPseudo(String pseudo){
        return this;//requete mongodb

    }

    public String getPseudo() {
        return pseudo;
    }

    public List<User> getAmis() {
        return amis;
    }
}
