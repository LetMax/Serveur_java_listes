package classes;

import DAOs.DAO_Connect;
import DAOs.DAO_Liste;

import java.util.*;
import java.io.*;

public class Main {

    public static void main (String[] args){

        User u1 = new User("user1", "mdp");

        Liste l = new Liste("titre depuis java", "description depuis java", 4);


        /*DAO_Connect test = new DAO_Connect();

        test.createConnection().createQuery("INSERT INTO liste(id_user, titre, description)" + "values (:val2, :val3, :val4)")
                .addParameter("val2", 1)
                .addParameter("val3", "depuis java")
                .addParameter("val4", "c'est fou !!!").executeUpdate();

        test.createConnection().createQuery("SELECT * from liste").executeAndFetchTable()
                .rows()                  // List<org.sql2o.data.Row>
                .forEach(row ->          // print what you want
                        System.out.println(row.getString("id") +
                                ", " + row.getObject("id_user") +
                                ", " + row.getObject("titre") +
                                ", " + row.getObject("description")));

        String query = "SELECT * FROM liste WHERE id_user = :n";
        List<Liste> u2 = test.createConnection().createQuery(query)
                .addParameter("n", 1)
                .executeAndFetch(Liste.class);

        System.out.println(u2.get(0).getId() + u2.get(0).getTitre() + u2.get(0).getDescription());

        //test.createConnection().createQuery("DELETE FROM liste WHERE titre = :x")
                //.addParameter("x", "depuis java").executeUpdate();

        test.createConnection().createQuery("SELECT * from liste").executeAndFetchTable()
                .rows()                  // List<org.sql2o.data.Row>
                .forEach(row ->          // print what you want
                        System.out.println(row.getString("id") +
                                ", " + row.getObject("id_user") +
                                ", " + row.getObject("titre") +
                                ", " + row.getObject("description")));*/
    }
}
