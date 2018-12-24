package DAOs;

import classes.Item;
import classes.Liste;
import org.sql2o.*;

import java.util.*;

public class DAO_Item {
    DAO_Connect co = new DAO_Connect();

    public Item create(Item i){
        try{
            String query = "INSERT INTO item(id_liste, date_crea, date_modif, description, titre) VALUES(:a, :b, :c, :d, :e)";
            co.createConnection().createQuery(query)
                    .addParameter("a", i.getIdListe())
                    .addParameter("b", i.getDateCrea())
                    .addParameter("c", i.getDateModif())
                    .addParameter("d", i.getDescription())
                    .addParameter("e", i.getTitre())
                    .executeUpdate();

        } catch (Sql2oException e){
            e.printStackTrace();
        }

        return i;
    }

    public void delete(Item i){
        try{
            String query = "DELETE FROM item WHERE id = :i";
            co.createConnection().createQuery(query)
                    .addParameter("i", i.getId())
                    .executeUpdate();

        } catch (Sql2oException e){
            e.printStackTrace();
        }
    }

    public void update(Item i){
        try{
            String query = "UPDATE item SET description = :d, titre = :t, date_modif = :da WHERE id = :i";
            co.createConnection().createQuery(query)
                    .addParameter("d", i.getDescription())
                    .addParameter("t", i.getTitre())
                    .addParameter("da", i.getDateModif())
                    .addParameter("i", i.getId())
                    .executeUpdate();

        } catch (Sql2oException e){
            e.printStackTrace();
        }
    }

    public Item getItemFromId(int id){
        Item i = new Item();

        try{
            String query = "SELECT * FROM item WHERE id = :i LIMIT 1";
            i = co.createConnection().createQuery(query)
                    .addParameter("i", id)
                    .executeAndFetch(Item.class).get(0);

        } catch (Sql2oException e){
            e.printStackTrace();
        }

        return i;
    }

    public List<Item> getItemsFromListe(Liste l){
        List<Item> listeItems = new ArrayList<Item>();

        try {
            String query = "SELECT * FROM item WHERE id_list = :i ORDER BY ID ASC";
            listeItems = co.createConnection().createQuery(query)
                    .addParameter("i", l.getId())
                    .executeAndFetch(Item.class);

        } catch (Sql2oException e){
            e.printStackTrace();
        }

        return listeItems;
    }
}