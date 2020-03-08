import java.util.Scanner;

public class TvSimulation {
    static Scanner tara = new Scanner (System.in);
    static Televizyon tv;


    public static void main(String[] args) {



        menuGoster();

        boolean cikis = false;

        while (cikis == false){
            System.out.print("Seciminiz (Menuyu gormek icin 8'i tuslayin) : ");
            int secim = tara.nextInt();

            switch(secim){

                case 1:
                tvKurveKanallariOlustur();

                break;

                case 2:
                    tvAc();
                    break;

                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden cikiliyor...");
                    cikis =true;
                    break;
                default:
                    System.out.println("0 ile 8 arasinda bir deger giriniz...");
                    break;

            }
        }


    }

    private static void kanalBilgisiniGoster() {
        if(tv !=null){
            tv.aktifKanaliGoster();
        }else {
            System.out.println("Once TV'yi kurun ve kanallari olusturun...");
        }
    }

    private static void kanalDegistir() {
        if(tv !=null){
            System.out.print("Hangi kanali gormek istiyorsunuz ? \n");
            int acilmasiIstenenKanal = tara.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        }else {
            System.out.println("Once TV'yi kurun ve kanallari olusturun...");
        }
    }

    private static void sesArttir() {
        if (tv != null){
            tv.sesArttir();
        }else{
            System.out.println("Once TV'yi kurun ve kanallari olusturun...");
        }
    }
    private static void sesAzalt(){
        if(tv != null){
            tv.sesAzalt();
        }else {
            System.out.println("Once TV'yi kurun ve kanallari olusturun...");
        }
    }

    private static void tvKapat() {
        if(tv != null){
            tv.tvKapat();
        }else{
            System.out.println("Once TV'yi kurun ve kanallari olusturu...");
        }
    }

    private static void tvAc() {
        if(tv != null){
            tv.tvAc();
        }else{
            System.out.println("Once TV'yi kurun ve kanallari olusturu...");
        }
    }

    private static void tvKurveKanallariOlustur() {


        if (tv == null){
            tara.nextLine();
            System.out.println("Televizyonun Markasini giriniz : ");
            String marka = tara.nextLine();
            System.out.println("Televizyonun Boyutunu giriniz : ");
            String boyut = tara.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);

        }else {
            System.out.println(tv);
        }

    }

    private static void menuGoster(){

        System.out.println("************* MENU *************");
        System.out.println("0 -- Cikis\n"+
                "1 -- TV Kur\n"+
                "2 -- TV Ac\n"+
                "3 -- Sesi Artir\n"+
                "4 -- Ses Azalt\n"+
                "5 -- Kanal Degistir\n"+
                "6 -- Kanal Bilgisini Goster\n"+
                "7 -- TV Kapat\n"+
                "8 -- Menuyu Goster\n");
    }
}
