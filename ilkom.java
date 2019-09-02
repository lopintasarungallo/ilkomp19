public class ilkom 
{
    public static void main(String[] args)
    {
        int tahunSekarang = 2019*12;
        int tahunLahir = 2001*12;
        int bulanLahir = 7;
        int bulanSekarang = 8;
        int umur = (tahunSekarang+bulanSekarang)-(tahunLahir+bulanLahir);
        int umurTahun = umur/12;

        System.out.println("umur = " + umurTahun +" lebih bulan = "umur%12);

    }
}