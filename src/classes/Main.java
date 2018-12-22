package classes;

import DAOs.DAO_Connect;

public class Main {

    public static void main (String[] args){
        DAO_Connect test = new DAO_Connect();

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

        test.createConnection().createQuery("DELETE FROM liste WHERE titre = :x")
                .addParameter("x", "depuis java").executeUpdate();

        test.createConnection().createQuery("SELECT * from liste").executeAndFetchTable()
                .rows()                  // List<org.sql2o.data.Row>
                .forEach(row ->          // print what you want
                        System.out.println(row.getString("id") +
                                ", " + row.getObject("id_user") +
                                ", " + row.getObject("titre") +
                                ", " + row.getObject("description")));
    }
}
