import java.util.ArrayList;

public class Televizyon {

    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;



    public Televizyon(String marka, String boyut){
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>();
        ses = 10;
        aktifKanal=1;
        kanallariOlustur();
        this.acik = false;
    }

    private void kanallariOlustur(){
        HaberKanali cnn = new HaberKanali("CNN", 1, "Genel Haber");
        kanallar.add(cnn);
        HaberKanali bein = new HaberKanali("BeinSport", 2, "Spor Haber");
        kanallar.add(bein);
        MuzikKanali dreamTurk = new MuzikKanali("Dream Turk", 3, "Yerli Muzik");
        kanallar.add(dreamTurk);
        MuzikKanali NumberOne = new MuzikKanali("Number One", 4, "Yabanci Muzik");
        kanallar.add(NumberOne);

    }

    public void aktifKanaliGoster(){
        if(acik)
        System.out.println("Aktif Kanal : " + kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        else System.out.println("Once TV'yi aciniz...");
    }

    public void kanalDegistir(int acilmasiIstenenKanal){
        if(acik==true){
            if(acilmasiIstenenKanal != aktifKanal){
                if(acilmasiIstenenKanal<=kanallar.size() && acilmasiIstenenKanal>=0){
                    aktifKanal = acilmasiIstenenKanal;
                    System.out.println("Kanal : "+ acilmasiIstenenKanal+ " Bilgi : "+ kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
                }
                else{
                    System.out.println("Gecerli bir kanal numarasi giriniz.");
                }

            }else {
                System.out.println("Zaten " + aktifKanal + ". kanaldasiniz. Degistirme yapilmadi.");
            }

        }
        else{
            System.out.println("Once TV'yi aciniz...");
        }
    }



    public void sesArttir(){
        if(ses < 20 && acik == true){
            ses++;
            System.out.println("Ses Seviyesi : "+ ses);

        }else {
            System.out.println("Ses Maksimumda, daha fazla artiramazsin. Veya TV kapali...");
        }
    }
    public void sesAzalt(){
        if(ses>0 && acik){
            ses--;
            System.out.println("Ses Seviyesi : " + ses);
        }else {
            System.out.println("Ses minimumda daha fazla azaltamazsin. Veya TV kapali...");
        }
    }


    public void tvAc(){
        if(acik == false){
            acik = true;
            System.out.println("TV Acildi ");
        }else{
            System.out.println("TV zaten acik");
        }
        }


    public String getMarka(){
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka : "+marka +
                " Boyut : " + boyut + " inc olan TV olusturuldu";
    }


    public void tvKapat() {
        if(acik == true){
            acik = false;
            System.out.println("TV Kapandi");
        }else{
            System.out.println("TV zaten kapali");
        }
    }
    }
