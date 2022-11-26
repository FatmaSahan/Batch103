package collectionlar;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
         /*
    FIFI/LIFO
    -Yani ilk giren ilk cikar
    -market reyonuna sutlerin dizilmesi gibi
    -Yani elemanlar gelis sirasina gore yerlesir
    -insertion order a gore dizilirler
     */
        java.util.Queue<String> wareHouse=new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Cake");
        wareHouse.add("Water");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        System.out.println(wareHouse);
        //[Milk, Cake, Water, Bread, Honey]

        //offer()-->kapasite uyguunsa ekleme yapar
        //True yda false doner
        wareHouse.offer("Patatoes");
        System.out.println(wareHouse);
        //[Milk, Cake, Water, Bread, Honey, Patatoes]
    }

    }



