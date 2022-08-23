package calisanProje;

import java.util.Scanner;

public class Main {


    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgeldiniz..");

        String islemler = "Islemler... \n"
                + "1. Yazilimci islemleri\n"
                + "2. Yonetici islemleri\n"
                + "Cikis icin 0'a basin";

        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");

        while (true)
        {
            System.out.println("Islemi Seciniz : ");
            String islem = input.nextLine();
            if (islem.equals("0"))
            {
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                Yazilimci yazilimci = new Yazilimci("Zeliha ", "Oznuk" ,"QA",123,"Java");



                String yazilimci_islem ="1. Format At\n"
                        +"2. Bilgileri Goster\n"
                        +"Cikis icin 0'a basin";

                System.out.println(yazilimci_islem);
                while (true)
                {
                    System.out.println("Islemi Seciniz : ");

                    String y_islem = input.nextLine();

                    if (y_islem.equals("0"))
                    {
                        System.out.println("Yazilimci Islemlerinden Cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.println("Isletim Sistemi : ");
                        String isletim_sistemi = input.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz Yazilimci Islem..");
                    }
                }
            }
            else if (islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("Yasin","Anil", "JDev",150,15);
                String yonetici_islem = "Yonetici Islemleri\n"
                        +"1. Zam Yap\n"
                        +"2. Bilgileri Goster\n"
                        +"Cikis icin 0'a basin";
                System.out.println(yonetici_islem);

                while (true)
                {
                    System.out.println("Islem Seciniz: " );
                    String y_islem = input.nextLine();

                    if (y_islem.equals("0"))
                    {
                        System.out.println("Yonetici Islemlerinden Cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.println(" Yoneticinin ne kadar zam yapmasini istiyorsunuz :  ");
                        int zamMiktari = input.nextInt();
                        input.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz Yonetici Islem..");
                    }
                }
            }
            else
            {
                System.out.println("Gecersiz Islem...");
            }
        }

    }
}


