package calisanProje;

public class Calisan {


    private String ad;
    private String soyad;
    private String meslek;
    private int id;


    public Calisan(String ad, String soyad, String meslek, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.meslek =meslek;
        this.id = id;

    }



    public void bilgileriGoster()
    {
        System.out.println("Bilgileri Goster..");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Meslek :" + meslek);
        System.out.println("Id : " + id );
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


