package abstraction2;

public class Abstraction_Notlar {
    /*
    --interfacelerde methodlarin ayniisimde olmasi problemolmaz
    --fakat returntiplari da ayniolmalidir.yoksa child hangisini alacagini bilemez
    --Tum variabllar static oldugu icin clas ismiyle cagirabiliriz
    ---Variablarda farkli return tipe kullanilabilir

    --hata verrir
    ---abstract method ne yapilacagini soyler(What to do)
    ---concerete method nasil yapilacagini soyler(how to do)
    --Interfaceler yapilacaklar listesidir(To Do List)

    INTERFACEDE VARIABLAR
    --interfacede tum variablllar publictir(default)--heryerden ulasiir
    --interfacede tum variablllar final dir(default)--degistirilemez
    --interfacede tum variablllar statictir dir(default)--gokteki yildiz gibi olmasi

----CONSTRACTUR----
--interfacede constractur olmadigi icin obje olusturulamaz
--"Abstracct class larda class olduklari icin consructur vardir.Ama constructur
lar abstract class larda obje olusturmazlar

              ---UYARI---
Class    ---->  implements  ---->Interface
Class    ---->  extends     ---->Class
Interface---->  extends     ---->Interface
Interface---->  Mumkun degil    ---->Class===Class interfacenin parente olamaz

      =====ABSTRACT CLASS===                                ====INTERFACE ====
  -hem abstract hemde concrete method vardir                -sadece abstract method vardir
  -Herturlu variable olusturulabilir                       -Variabllar public,static,finalldir
  -Abstract class bir class oldugu icin                     -Multiple inheritince destekler
   multiple inheritince musade etmez                        -Constructur yoktur dolayisiylada object olusturulmaz
   -Abstract claslarda constractur vardir ama
   objeckt olusturmak icin kullanilmazlar

SORU==Object ORIENTED PROGRAMING LANGUAG (OOP) prensipleri nelerdir??
i)Inheritince
ii)POLymorphise
iii)Encapsulation
iv)Abstraction
     */
}
