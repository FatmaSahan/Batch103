package collectionlar;

import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        /*
        HASSET
        -unic datalar depolamak icin
        -ogrenci id si gibi
        -Cok izlidir indexle ilgilenmez
        -Tekrarasiz elemanlarda
        -siralam onemli degilse
        -
         */
        //Elemanlari hem hizli hemde sirali eklemek istersek ve elemnalarin unic oldugunu biliyoruz
        //Unic dedigiicin --Set ,Hizli olmasi icin -->Hash yani HashSet kullnadik
        //Sirali yapmsini istedigi icin bunu tekrar TreeSette aticaz
        java.util.HashSet<String> myEmails=new java.util.HashSet<>();

        myEmails.add("agmail.com");
        myEmails.add("fgmail.com");
        myEmails.add("hgmail.com");
        myEmails.add("jgmail.com");
        myEmails.add("kgmail.com");
        myEmails.add("rgmail.com");
        myEmails.add("tgmail.com");
        myEmails.add("ygmail.com");
        System.out.println(myEmails);
        //[rgmail.com, jgmail.com, fgmail.com, ygmail.com, hgmail.com, kgmail.com, tgmail.com, agmail.com]

        TreeSet myEmailsSorted=new TreeSet(myEmails);
        System.out.println(myEmailsSorted);
        //[agmail.com, fgmail.com, hgmail.com, jgmail.com, kgmail.com, rgmail.com, tgmail.com, ygmail.com]

/*
            ===TreeSet===
            -nature siralar
            -yani kucukten buyuge
            -alfabetik siralar
            -fakat cok yavastir
            -o yuzden yukarda hizli olmak icin once HasSet kullandik

            -Sonra TreeSet e attik elemanlari siralamasi icin
 */
    }
}
