package classes;

import DAOs.DAO_Connect;

public class Main {

    public static void main (String[] args){
        DAO_Connect test = new DAO_Connect();
        test.testSql2o().createQuery("SELECT * from liste").executeAndFetchTable()
                .rows()                  // List<org.sql2o.data.Row>
                .forEach(row ->          // print what you want
                        System.out.println(row.getString("id") +
                                ", " + row.getObject("id_user") +
                                ", " + row.getObject("titre") +
                                ", " + row.getObject("description")));

    }
}
