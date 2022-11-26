package acces_modifier;

public class E02 {
    public static void main(String[] args) {
        String arr[]={"Ali","Can","Veli","Han"};
        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//Ali

    }
    public static void getElementFromArray(String arr[],int indx){


        try{
            System.out.println(arr[indx]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index te bir problem olustu"+e.getMessage());
        e.printStackTrace();//...Wxceptionla ilgili detaylica teknik mesaj verir
            System.err.println("Array indexte bir problrm yasandi");//..hatamesajini digermesajlardan ayirmkicin kullanirriz
            //..hatayi renkli yazar
        }

        }
}
