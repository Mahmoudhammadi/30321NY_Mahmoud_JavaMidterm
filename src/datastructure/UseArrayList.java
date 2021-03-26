package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        ArrayList<String> mahmoud = new ArrayList();
        //adding data into the arraylist
        mahmoud.add("Algeria");
        mahmoud.add("USA");
        mahmoud.add("Canada");
        mahmoud.add("togo");
        mahmoud.add("Italy");
        mahmoud.add("Brazil");
        mahmoud.remove(0);
        System.out.println("Get the element at index 2:" + " " + mahmoud.get(2));
        System.out.println(" Remove the element at index 1: " + " " + mahmoud.remove(1));
        System.out.println(" Set a value  at index 0: " + " " + mahmoud.set(0, "UK"));
        //using for each loop
        System.out.println(" Use for each loop to print all the elements of an ArrayList");
        for (String s : mahmoud) {
            System.out.println(s);
        }

        //using Iterator
        System.out.println("Use White loop With Iterator print all the elements of an ArrayList");
        Iterator iterator = mahmoud.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "Jska1234";
        Statement statement=null;
        Connection connection=null;

//        try {
//            connection = DriverManager.getConnection(url, user, password);
//            statement = connection.createStatement();
//
//            String query = "insert into arraylist (id,name) values (2,'france');";
//            statement.execute(query);
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            System.out.println(" something went wrong with connection");
//        }
//
//    }

    }}


