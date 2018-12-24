package classes;

import java.util.Date;
//import DAOs.DAO_Item;

public class Item {

    private int id;
    private int id_Liste;
    private Date date_Crea;
    private Date date_Modif;
    private String description;
    private String titre;


    public Item(){}

    public Item(String titrep, String descriptionp, int idListep){
        this.titre = titrep;
        this.description = descriptionp;
        this.id_Liste = idListep;
        this.date_Crea = new Date();
        this.date_Modif = this.date_Crea;

        //DAO_Item dao = new DAO_Item();
        //dao.create(this);
        //this.id = ...
    }

    public int getId(){ return this.id; }
    public int getIdListe(){ return this.id_Liste; }
    public String getTitre(){ return this.titre; }
    public String getDescription(){ return this.description; }
    public Date getDateCrea(){ return this.date_Crea; }
    public Date getDateModif(){ return this.date_Modif; }

    public void setId(int idp){ this.id = idp; }
    public void setIdListe(int idListep){ this.id_Liste = idListep; }
    public void setTitre(String titre_to_set){ this.titre = titre_to_set; this.date_Modif = new Date(); }
    public void setDescription(String description_to_set){ this.description = description_to_set; this.date_Modif = new Date(); }
    public void setDateCrea(Date date_to_set){ this.date_Crea = date_to_set; }
    public void setDateModif(Date date_to_set){ this.date_Modif = date_to_set; }
}
