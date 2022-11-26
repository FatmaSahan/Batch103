package abstraction1;

public class Accord implements Engine,Ac,Hood{

    @Override
    public void digital() {
        System.out.println("was used digital screen");

    }

    @Override
    public void climate() {
        System.out.println("has a climate");

    }

    @Override
    public void eco() {
        System.out.println("it is aconomic");

    }

    @Override
    public void gas() {
        System.out.println("gas is used");

    }

    @Override
    public void tsi() {
        System.out.println("it is tsi");

    }

    @Override
    public void steel() {
        System.out.println("was used steel");

    }
}
