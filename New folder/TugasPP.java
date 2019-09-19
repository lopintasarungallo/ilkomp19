import java.util.Scanner;
class TugasPP{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kehadiran = false;
        boolean ikutPraktikum = false;
        boolean nilai = false;

        int jumlahKehadiran = scan.nextInt();
        String ikutPraktik = scan.next();
        int nilaiTugas = scan.nextInt();
        int nilaiKuiz = scan.nextInt();
        int nilaiMID = scan.nextInt();
        int nilaiFinal = scan.nextInt();

        int kehadiranAnda = (jumlahKehadiran/16)*100;
        String ikutPraktikumAnda = null;
        double nilaiAnda = nilaiTugas*0.2+nilaiKuiz*0.25+nilaiMID*0.25+nilaiFinal*0.30;

        if(kehadiranAnda>80){
            kehadiran = true;
        }

        if(ikutPraktik.equals("True")){
            ikutPraktikum = true;
            ikutPraktikumAnda = "Anda mengikuti praktikum";
        }else if(ikutPraktik.equals("True")){
            ikutPraktikum = false;
            ikutPraktikumAnda = "Anda tidak mengikuti praktikum";
        }else{
            System.out.println("Inputan salah");
        }
        
        if(nilaiAnda>=45){
            nilai = true;
        }

        if(kehadiran==true && ikutPraktikum==true && nilai==true){
            System.out.println("Persen kehadiran anda = "+kehadiranAnda+"%");
            System.out.println(ikutPraktikumAnda);
            System.out.printf("Total nilai anda = %.0f\n", nilaiAnda);
            System.out.println("Selamat anda lulus mata kuliah ini");
        }else{
            System.out.println("Persen kehadiran anda = "+kehadiranAnda+"%");
            System.out.println(ikutPraktikumAnda);
            System.out.printf("Total nilai anda = %.0f\n", nilaiAnda);
            System.out.println("Maaf anda belum lulus");
        }

        scan.close();
    }
}
