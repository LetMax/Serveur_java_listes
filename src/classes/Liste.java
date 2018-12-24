package classes;

import DAOs.DAO_Liste;

public class Liste {

    private int id;
    private String titre;
    private String description;
    private int id_User;


    public Liste(){}

    public Liste(String titrep, String descriptionp, int id_Userp){
        this.titre = titrep;
        this.description = descriptionp;
        this.id_User = id_Userp;

        DAO_Liste dao = new DAO_Liste();
        dao.create(this);
        this.id = dao.getIdFromTitre(titrep);
    }

    public int getId(){ return this.id; }
    public String getTitre(){ return this.titre; }
    public String getDescription(){ return this.description; }
    public int getIdUser(){ return this.id_User; }


    public void setId(int id_to_set){ this.id = id_to_set; }
    public void setTitre(String titre_to_set){ this.titre = titre_to_set; }
    public void setDescription(String description_to_set){ this.description = description_to_set; }
    public void setIdUser(int id_User_to_set){ this.id_User = id_User_to_set; }

}
