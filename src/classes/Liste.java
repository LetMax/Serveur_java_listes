package classes;

import DAOs.Base;
import DAOs.DAO_Liste;

public class Liste {

    private int id;
    private String titre;
    private String description;
    private int User_id;


    public Liste(){}

    public Liste(String titre, String description, int User_id){
        this.titre = titre;
        this.description = description;
        this.User_id = User_id;

        DAO_Liste dao = new DAO_Liste();
        //dao.create(this);

        //this.id = dao.getIdFromTitre(titre);


    }
}
