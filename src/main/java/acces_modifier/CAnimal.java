package acces_modifier;

public abstract class CAnimal {

    //Parent abstract class da abstract methodlar varsa
    //i)Child clasi abstract yapmalisiniz yda
    //ii)parent clasdaki tum Abstaract methodlari override etmelisiniz
    public abstract void eat();


    public void drink(){
        System.out.println("Animlas drink");//..concreate(non-ubstract) method

    }
    public abstract void move();
}
