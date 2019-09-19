import java.util.Scanner;

class iren{

    public static void main(String[] args) {
        long angkaYangdihasilkan = 123456;
    
        System.out.println(angkaYangdihasilkan);
        Scanner sc = new Scanner (System.in);
        double jari = sc.nextDouble();
        double luas = Math.PI*Math.pow(jari, 2);
        double keliling=2*Math.PI*jari;
        System.out.println("Luas adalah ;"+ luas);
        System.out.println("Luas adalah ;"+ keliling);
        System.out.printf("%.3f\n" ,luas);
        System.out.printf("%.3f\n" ,keliling);


    
        
    

        


    }
}