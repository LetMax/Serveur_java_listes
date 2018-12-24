package classes;

import DAOs.DAO_User;

public class User {

    private int id;
    private String nom;
    private String password;

    public User(){}

    public User(String nomp, String passwordp){
        this.nom = nomp;
        this.password = passwordp;
        DAO_User dao = new DAO_User();
        dao.create(this);
        this.id = dao.getUserFromNom(nomp).getID();
    }

    public User(String nomp, String passwordp, int idp){
        this.id = idp;
        this.password = passwordp;
        this.nom = nomp;
        DAO_User dao = new DAO_User();
        dao.create(this);
    }

    public int getID(){ return this.id; }
    public String getNom(){ return this.nom; }
    public String getPassword(){ return this.password; }

    public void setID(int id_to_set){ this.id = id_to_set; }
    public void setID(String nom_to_set){ this.nom = nom_to_set; }
    public void setPassword(String password_to_set){ this.nom = password_to_set; }
}
