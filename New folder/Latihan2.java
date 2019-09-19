import java.util.Scanner;
public class Latihan2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int bilangan = scan.nextInt();

        if (bilangan<5){
            System.out.println("kurang dari 5");
        }else if (bilangan==5){
            System.out.println("sama dengan 5");
        }else{
            System.out.println("lebih dari 5");
        }
    }
}
