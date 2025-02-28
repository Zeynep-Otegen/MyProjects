package Diziler;
import java.util.Scanner;
public class TKM_dizi {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
       String [] nesneler={"Tas","Kagit","Makas"};
       int machine=(int) (Math.random()*3);
       System.out.print("Tas=0,Kagit=1,Makas=2'dir.Hnagisi?");
       int gamer=input.nextInt();

       System.out.println("Makine:"+nesneler[machine]);
       System.out.println("Oyuncu:"+nesneler[gamer]);
       if(machine==0 && gamer==2||machine==1 && gamer==0 || machine==2 && gamer==1){
           System.out.println("Kaybettiniz :(");
       }
else if(machine==0 && gamer==1 || machine==1 && gamer==2 || machine==2 && gamer==0){
    System.out.println("Tebrikler kazandınızz!");
}
else{
    System.out.println("Beraberee");
       }


    }
}
