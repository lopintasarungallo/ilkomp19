import java.util.Scanner;

class LatihanMod{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hasil = a%b;
        int sum = 2;
        sum += 1; // sum = sum +1
        sum/=sum;

        System.out.println("Hasil" +hasil);
        System.out.println(a);
        System.out.println(sum);
    
    }
}