package collectionlar;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        /*
        -(Oncelik) PriorityQueu da Java kendine gore
        bir oncelik belirleyerek siralama yapar
        -istersek kendimizde bir oncelik belirleyebiliriz
         */
        PriorityQueue<String> myQueue=new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("G");
        myQueue.add("H");
        myQueue.add("P");
        System.out.println(myQueue);
       // [A, E, G, H, P]


    }
}
