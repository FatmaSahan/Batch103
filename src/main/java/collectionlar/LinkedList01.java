package collectionlar;

public class LinkedList01<S> {
    /*
    List ---> Coklu ve tekrarli data depolamk istersek list kulllanmaliyiz(Bir okuldaki ogrnci isimleri gibi)
    Queue--->FIFO-LIFO  gerektiginde kul.Yani ilk gelen ilk cikar
    Set  --->Coklu fakat tekrarsiz depolamkistersek(unic).Id numarasi gigi datalar icin

   ======== ArrayList=======                                  =======LInkedList====
    -ArrayList index kul.                                    -Linklist dee index yok
    ==dezavantaji==                                           -Eleman bulmada basarisiz(searchde)
    eleman ekleme ve cikarmada                               -Elemen ekleme ve silmede basarilidir(halay gibi)
    zaman kaybettirir cunku elemanlarin indexi degisir        -TAIL--en sondaki node
    -Array list eleman bulma isleminde basarilidir            -HEAD--en bastaki node
                                                              -NODE--
                                                              -Her bir node iki bolumden olusur. Pointer kisim
                                                               ve Data Bolumu
     */
    public static void main(String[] args) {
        java.util.LinkedList<String> visitors=new java.util.LinkedList<>();
        visitors.add("fatma");
        visitors.add("betul");
        visitors.add("senih");
        visitors.add("melih");
        visitors.add("fatih");
        visitors.add("sahan");
        visitors.add(3,"komurcu");
        System.out.println(visitors);
        visitors.addFirst("lale");
        visitors.addLast("cimen");
        visitors.add("2,fatma");
        visitors.add(5,"sahan");


        System.out.println(visitors);
        //[lale, fatma, betul, senih, komurcu, sahan, melih, fatih, sahan, cimen, 2,fatma]
        visitors.removeFirst();
        System.out.println(visitors);
        //[fatma, betul, senih, komurcu, sahan, melih, fatih, sahan, cimen, 2,fatma]

        visitors.removeLast();
        System.out.println(visitors);
       // [fatma, betul, senih, komurcu, sahan, melih, fatih, sahan, cimen]

        visitors.removeFirstOccurrence("fatma");//ilk gorunen fatmayi sil
        System.out.println(visitors);
      //[betul, senih, komurcu, sahan, melih, fatih, sahan, cimen]
        visitors.removeLastOccurrence("fatih");//son gorunen ftihi sil
        System.out.println(visitors);
       // [betul, senih, komurcu, sahan, melih, sahan, cimen]

        visitors.pop();  //ilk elemani cut-paste yapar
        String firstEl=visitors.pop();
        System.out.println(firstEl);
        System.out.println(visitors);
        //senih
        /*
        add   -->ekler
        remove--> siler
        set   -->elemani degistirir
         */

        visitors.peek();//ilk elemani silmeden size verir
        String first=visitors.peek();
        System.out.println(first);

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:
        the head of this list, or null if this list is empty

         */
        String firstElement=visitors.poll();
        System.out.println(firstElement);
        System.out.println(visitors);


        visitors.element();//ilk elemnai verir silmez.Bos list tede exception atar
        /*but does not remove, the head (first element) of this list.
                Returns:
        the head of this list
        Throws:
        NoSuchElementException – if this list is empty


        //SORU:"A" ile baslayan tum isimleri "******" ceviriniz
        java.util.LinkedList01<String> name=new java.util.LinkedList01<>();
        name.add("AHMET");
        name.add("betul");
        name.add("Ayse");
        name.add("melih");
        name.add("Ali");
        name.add("sahan");
        name.add(3,"komurcu");
        name.addFirst("lale");
        name.addLast("cimen");
        System.out.println(name);

        for (String w:name
             ) {
            if (w.startsWith("A")){

                name.set(name.indexOf(w),"****");

            }

        }
        System.out.println(name);


        /*
        SORU2;Listedeki 4 harften cok harf iceren isimleri siliniz

         */




    }
}
