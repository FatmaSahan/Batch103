package acces_modifier;

import java.util.Arrays;

public class ArrayCalisma {
    public static void main(String[] args) {
        int arr[]=new int[7];
        arr[1]=11;
        arr[2]=12;
        arr[4]=21;
        arr[6]=30;
        arr[0]=600;
        arr[3]=3;
        arr[5]=35;

        System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ilk=arr[0];
        int son=arr[arr.length-1];
        System.out.println(ilk+son);

int sum=0;
        for (int i = 0; i < arr.length ; i++) {

           sum+=arr[i] ;
        }
        System.out.println(sum);

        //while ile yapalim
        int i=0;
        int toplam=0;

        while (i<arr.length){
            toplam+=arr[i];
            i++;

        }
        System.out.println(toplam);


        int k=0;
        int s=0;

        //do while ile yapalim
        do {
            s+=arr[k];
            k++;

        }while (k<arr.length);  //sarti buraya yazariz
        System.out.println(s);

        int top=0;
        //for each ile yapalim
        for (int w:arr
             ) {
            top+=w;

        }
        System.out.println(top);

        int summ=0;
        String arrr[]={"fatma","melih","senih","betul"};
        for (String w:arrr
             ) {
            summ+=w.length();
        }
        System.out.println(summ);

        //sorubuyuk harfleri yazdir
        char chr[]={'F','a','T','m'};
        for (char w:chr
             ) {
            if (w>'A'&& w<'Z'){
                System.out.print(w);
            }
            int a=5;

        }

    }




}
