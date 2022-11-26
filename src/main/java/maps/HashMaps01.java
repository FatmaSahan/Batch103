package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    public static void main(String[] args) {
        /*
        -ilk ki "Key" ikincisi "Value" dir
        -key ve value vardir
        -keyler Unic tir
         */


    HashMap<String,Integer> studentAges=new HashMap<>();


        studentAges.put("Ali",13);
        studentAges.put("Melih",14);
        studentAges.put("Senih",14);
        studentAges.put("Betul",12);
        studentAges.put("Fatma",39);
        System.out.println(studentAges);
        studentAges.put(null,55);
        System.out.println(studentAges);
        studentAges.put("Ayhan",null);
        System.out.println(studentAges);
        studentAges.put("Fatma",25);
        System.out.println(studentAges);
        //{null=55, Fatma=25, Betul=12, Senih=14, Ahan=null, Ali=13, Melih=14}

       /*
       ====Mapten sadece "Key" leri alalim====
        */
        // studentAges.keySet()
        Set<String> keys=studentAges.keySet();//Key ler Unic oldugu icin sete attiik
        System.out.println(keys);
        //[null, Ayhan, Fatma, Betul, Senih, Ali, Melih]

        /*
        ===Mapten sadece "Value" lari alalim==
         */
        studentAges.values();
        Collection<Integer> values=studentAges.values();//value lar unic olmadigi icin collectiona attik
        System.out.println(values);
        //[55, null, 25, 12, 14, 13, 14]

        /*
        ===Belli bir Keye ait value nasil alinir===
         */
        //studentAges.get("Fatma");
        Integer fatmatAge=studentAges.get("Fatma");
        System.out.println(fatmatAge);

        /*
        ===Tum integer yaslarin ortalamsini hesaplayan kodu yaziniz===
         */
        Collection<Integer> ages=studentAges.values();
        int sum=0;
        int counter=0;

        for (Integer w:ages
             ) {
            if(w!=null)
            sum+=w;
            counter++;
        }
        System.out.println("Ortalama Yas="+sum/counter);


        System.out.println(studentAges.entrySet());

        /*
        A ile baslayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz
       */
        //{null=55, Fatma=25, Betul=12, Senih=14, Ahan=null, Ali=13, Melih=14}
        Set<String> keyss= studentAges.keySet();
        for (String w:keyss
             ) {
            if(w!=null&&!w.startsWith("A")){
                System.out.println(w+"="+w.length());
            }

        }

        /*
        ==Remove()===
         */
       boolean result= studentAges.remove("Fatma",25);
        System.out.println(result);

        /*
        Mapteki herbir "Entry" yi ekrana farkli bir satirda yazdiran kodu yaziniz
        entrySet();  metodu Maphteki herbir elemani bir setin icine koyarak size verir
         */
        Set<Map.Entry<String,Integer>> entries =studentAges.entrySet();
        System.out.println(entries);
        for (Map.Entry<String,Integer> w:entries
             ) {
            System.out.println(w);

        }

    }}

