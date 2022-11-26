package acces_modifier;

public class Cat extends CMamal {
    /*
    Bir method parent clasda abstract method ise
    child clas o methodu override edip kullnmak zorundadir
    bu yuzden her hangi bir fonksiyonu  child class icin mecburi yapmak istiyorsak
    pranr clasinindaki o methodu abstract yapmaliyiz
    parent   child
    math(math()) ..abstract                   >   6Th
        music(){listening}..concreate         >   7th
                                              >    8th

                                              6,7,8 ler math methodunu override etmek zorundadir
     */


    @Override
    public void eat() {
        System.out.println("cats eat");

    }

    @Override
    public void move() {
        System.out.println("cats move");

    }
}
