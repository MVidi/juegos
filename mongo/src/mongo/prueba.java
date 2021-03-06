package mongo;
import java.net.UnknownHostException;
import java.util.List;
 


import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongoClient;
 
/**
 * Prueba para realizar conexi�n con MongoDB.
 * @author j
 *
 */
public class prueba {
    /**
     * Main del proyecto.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Prueba conexi�n MongoDB");
        MongoClient mongo = crearConexion();
 
        if (mongo != null) {
            System.out.println("Lista de bases de datos: ");
            printDatabases(mongo);
 
        } else {
            System.out.println("Error: Conexi�n no establecida");
        }
    }
 
    /**
     * Clase para crear una conexi�n a MongoDB.
     * @return MongoClient conexi�n
     */
    private static MongoClient crearConexion() {
        MongoClient mongo = null;
        try {
            mongo = new MongoClient("ds061199.mongolab.com", 61199);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
 
        return mongo;
    }
 
    /**
     * Clase que imprime por pantalla todas las bases de datos MongoDB.
     * @param mongo conexi�n a MongoDB
     */
    private static void printDatabases(MongoClient mongo) {
   	DB db = mongo.getDB("sermo");
    	boolean auth = db.authenticate("mvidi", "quejigal".toCharArray());
   
       Set<String> dbs = db.getCollectionNames();
        for (String dbR : dbs) {
            System.out.println(" - " + dbR);
        }
    }
}