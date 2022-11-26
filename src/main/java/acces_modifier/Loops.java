package acces_modifier;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 4; i <17 ; i++) {
            System.err.print(i+" ");



        }
        System.out.println();



        for (int i = 14; i >=5 ; i--) {
            System.err.print(i+" ");

        }

        System.out.println();
        for (int i = 14; i >=5 ; i--) {
            if(i%2==0){
                System.out.println(i);
            }


        }
        int count=0;
        System.out.println();
        for (int i = 28; i <=157 ; i++) {
            if(i%2!=0){
                System.out.println(i+" ");


            }
            count++;

        }
        System.err.println("there are "+count+ "odd numbers in totall");


        String str="Senih";
        for (int i = 0; i <=str.length()-1 ; i++) {
            System.out.print(str.charAt(i)+"*");

        }
        System.out.println();

       /* String s="hellooo";//....he  tekrarrsiz olan gharfleri yazdir
        for (int i = 0; i <s.length() ; i++) {


           char c=s.charAt(i);
           if(s.indexOf(c))==s.lastIndexOf(c){
                System.out.println(c);//He
            }*/
        int sum=0;
        for (int i = 3; i <=6 ; i++) {
            sum+=i;
        }
        System.out.println(sum);



int multp=1;
        for (int i = 10; i >=1 ; i--) {
            multp*=i;

        }
        System.out.println(multp);


int  num=2345;
int rakamTop=0;
for (int i = num; i >0 ; i/=10) {

            rakamTop+=i%10;

        }
        System.out.println(rakamTop);


String word="recep tayyip";
String ters="";
        for (int i = word.length()-1; i >=0; i--) {
            ters+=word.charAt(i);


        }
        System.out.println(ters);



        String str1="Semih";
        String  str2="";

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!='m'&&str1.charAt(i)!='M'){
                str2+=str1.charAt(i);
            }
        }
        System.out.println(str2);




        //1 den 100 e kadr 6 ile bolunebilenler haric yazdir

        for (int i = 1; i <101 ; i++) {
            if(i%6==0){
                continue;
            }

            System.out.print(i+" ");

        }
        System.out.println("");



        String f="gumushane";
        for (int i = 0; i < f.length(); i++) {
            char k=f.charAt(i);
            if(f.charAt(i)=='h'){
                break;
            }
            System.out.print(k);

        }


        //nested for loop

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Week:"+ i);
            for (int j = 1; j <=3 ; j++) {
                System.out.println("Day:"+ j);

            }

        }
        //Arrayler











            }


        }








