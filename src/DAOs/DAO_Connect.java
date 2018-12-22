package DAOs;

import org.sql2o.*;

public class DAO_Connect {
    private Sql2o sql2o = new Sql2o("jdbc:h2:tcp://localhost/~/test", "sa", "");

    private static Connection connect;

    public Connection testSql2o() {

        if(connect == null) {
            try{
                connect = sql2o.open();

            } catch(Sql2oException e){
                e.printStackTrace();
            }
        }
        return connect;
    }
}
