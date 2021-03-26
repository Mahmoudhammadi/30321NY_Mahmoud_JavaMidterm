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
        Queue<String> mahmoud = new LinkedList<>();
        //add data into the queue
        mahmoud.add("Mahmoud");
        mahmoud.add("john");
        mahmoud.add("jason");
        mahmoud.add("Erick");
        mahmoud.add("jeff");
        mahmoud.peek();
        mahmoud.poll();

        //Peek Data From the queue

        System.out.println("peek: " + " " + mahmoud.peek());

        //remove data from the queue
        System.out.println("Remove:" + " " + mahmoud.remove());
        // pool
        System.out.println("pool:" + " " + mahmoud.poll());

        // Using for each loop

        for (String s : mahmoud) {
            System.out.print(s + " ");
        }
        //using Iterator
        System.out.println("\n"+"using Iterator:");
        Iterator iterator = mahmoud.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }

}
