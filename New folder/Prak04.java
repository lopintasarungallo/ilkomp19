import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
class Prak04{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = sc.nextInt();

        if (bilangan %2==0){
            System.out.println("genap");
        }else{ 
            System.out.println("ganjil");
        }
        if (bilangan >= 10){
            System.out.println("lebih dari satu sama dengan 10");
        }else {
            System.out.println("kurang dari 10");
        }
        if (bilangan < 100){
            System.out.println("kurang dari 100");
        }
    }
}
        