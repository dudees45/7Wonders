package cartes;

import java.util.Map;

public class Carte {

    private String nom;
    private String type;
    private Map<String, Integer> cout;

    private int age;
    Map<String,String> effet;
    Map<String,String> chainage;

    public Map<String, String> getChainage() {
        return chainage;
    }

    public void setChainage(Map<String, String> chainage) {
        this.chainage = chainage;
    }

    public Carte() {
        super();
    }

    public Carte(String nom, String type, Map<String, Integer> cout, int configurationNumber, int age, Map<String, String> effet, Map<String,String> chainage) {
        this.nom = nom;
        this.type = type;
        this.cout = cout;
        this.age = age;
        this.effet = effet;
        this.chainage = chainage;

    }

    // Getters & setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Integer> getCout() {
        return cout;
    }

    public void setCout(Map<String, Integer> cout) {
        this.cout = cout;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getEffet() {
        return effet;
    }

    public void setEffet(Map<String, String> effet) {
        this.effet = effet;
    }
}
