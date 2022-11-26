package collectionlar;

import java.util.LinkedList;

public class Deque<S> {
    public static void main(String[] args) {


    /*
    -Merrmer ornegindeoldugu gibi
    -sirali bi mermeri hem onden hemsondancekebilirim
    -iki ucuclu diyebiliriz
    -yada mobilya kamyonunun on ve
    araka kapisinin acilip
    iki uctan da mobilya albilmemiz gibi

     */
        java.util.Deque<String> furnitureTruck=new LinkedList<>();
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Chair");


        furnitureTruck.push("table");//Elemani ilk siraya ekler
        System.out.println(furnitureTruck);
}}
