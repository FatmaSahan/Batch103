package abstraction2;

public class Runner {
    public static void main(String[] args) {
        /*
        Static olan variabllara class ismiyle farkli claslardan ulasabiliriz
        Dolayisiyla interfacelerde variablarin ayni olmasi hata vermez
        Ayri ayri her iki parent interfacedeki variabllara ulasabiliriz
         */
        System.out.println(Engine.price);
        System.out.println(Ac.price);
    }

}
