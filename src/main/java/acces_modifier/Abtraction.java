package acces_modifier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Abtraction {
    public static void main(String[] args) {
        readFileLineByLine();

    }

    public static void readFileLineByLine(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/main/java/acces_modifier/text"));
            try {

                String line=br.readLine();
                while(line!=null){

                    System.out.println(line);
                    line=br.readLine();
                }



        } catch (FileNotFoundException e) {
            System.out.println("either path is wrong or file is deleted");
        }
        } catch (IOException e) {
            System.out.println("there are unreadable character or characters");
        }
        //"throw" methodun icinde istedigimiz yerde Exception uretmek icin kullanilir
        //"throws" ise  var olan checked exception i atmak icin kullanilir
        //"throw" dan sonra bir tane exception olabilir
        //"throws" dan sonra 1 den fazla exception firlatilabilir


    }
}
