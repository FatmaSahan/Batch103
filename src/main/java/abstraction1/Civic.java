package abstraction1;

public class Civic implements Engine,Ac,Hood{

    @Override
    public void eco() {
        System.out.println("uses eco");

    }

    @Override
    public void gas() {
        System.out.println("is use gas");

    }

    @Override
    public void tsi() {
        System.out.println("uses tsi");

    }

    @Override
    public void digital() {
        System.out.println("is used digital screen");

    }

    @Override
    public void climate() {
        System.out.println("has a climate");

    }

    @Override
    public void steel() {
        System.out.println("was made steel");

    }
    /*
    OVERRIDE etmek demek parenttaki metodu aynen alip
    bodysini kendi isine yaraycak sekilde update etmek demektir
     */
}
