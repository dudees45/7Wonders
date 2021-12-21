package programme;

import cartes.Carte;
import com.fasterxml.jackson.databind.ObjectMapper;
import partie.Partie;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Programme {
    public static void main(String[] args) {

        Partie p = new Partie();
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();


            // convert JSON array to list of books
            List<Carte> cartes = Arrays.asList(mapper.readValue(Paths.get("model/src/main/resources/json/cartes.json").toFile(), Carte[].class));

            // print books
            cartes.forEach(c -> System.out.println(c.getChainage()));

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}
