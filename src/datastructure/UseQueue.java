package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        Queue<String> iceCreamLine = new LinkedList<>();
        //add data into the queue
        iceCreamLine.add("Mahmoud");
        iceCreamLine.add("john");
        iceCreamLine.add("jason");
        iceCreamLine.add("Erick");
        iceCreamLine.add("jeff");

        //Peek Data From the queue

        System.out.println("peek: " + " " + iceCreamLine.peek());

        //remove data from the queue
        System.out.println("Remove:" + " " + iceCreamLine.remove());
        // pool
        System.out.println("pool:" + " " + iceCreamLine.poll());

        // Using for each loop

        for (String s : iceCreamLine) {
            System.out.print(s + " ");
        }
        //using Iterator
        System.out.println("\n"+"using Iterator:");
        Iterator iterator = iceCreamLine.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }

}
