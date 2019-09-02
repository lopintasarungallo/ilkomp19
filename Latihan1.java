import java.util.Scanner;
public class Latihan1{

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    //double phi = 3.14;
    System.out.println("jari-jari");
    double r = sc.nextDouble();

    double hasil = Math.PI*Math.pow(r, 2); 
    double hasil2 = 2*Math.PI*r;

    System.out.printtf("Luas lingkaran= %.2f" , hasil);
    System.out.printtf(" ");
    System.out.printtf("Keliling lingkaran %.2f" , hasil2);
}
