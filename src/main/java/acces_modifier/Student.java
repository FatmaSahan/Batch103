package acces_modifier;

public class Student {
    //1>public......>her clasdan kullanir
    //2>protected....>farkli packagerden kullanilmaz..Ancak baska pakgeda "child class" da icinden kulanilir
    //3>default.....>...farkli pakegdan kullanilmaz..Ayni pakegdan kullanilir..
    // default access modifier yazilmaz..hicbirsey yazilmamissa default olur
    //4>private.....>ehliyet gibi..sadece olusturulduklari clasdan ulasilir

//public olanlar her classdan ulasilabilir
    public String stName="fatma";

    //protected olanlar baska package lardan kullanilamzlar ancak baska packgeda child clas icinden kullanilir
    protected String address="leicester";

    //default olanlar baska packge dan kullanilamazlar
    String email="ffsbm@gmail.com";

    //private olanlar sadece olusturulduklariclass icinden kullanilabilir
    private String stId="234567";

    //NOTT...claslar icin public ve default acces modifier kullanilabilir

    //NOT!! --objectlerle variabla bakarken datatipine bakar---method iise constractirana bakar
}
