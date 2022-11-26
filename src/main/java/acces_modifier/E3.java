package acces_modifier;

public class E3 {
    public static void main(String[] args) {
        String str="fatma";   // 5
        getNumOfChar(str);

        String s="";         //0
        getNumOfChar(s);

        String t=null;   //There was a problem at lenght() method --->null

        getNumOfChar(t);


    }
    public static void getNumOfChar(String str){

        try {
            System.out.println(str.length());

        }catch (NullPointerException e){
            System.err.println("There was a problem at lenght() method --->"+e.getMessage());

        }




    }
}
