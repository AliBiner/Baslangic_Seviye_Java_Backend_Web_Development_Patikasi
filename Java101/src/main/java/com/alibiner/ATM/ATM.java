package com.alibiner.ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte right = 3;
        String username = "alibiner";
        String password = "123456";
        boolean login = false;
        float balance = 5432.32f;
        String accountType = " TL";


        while (right>0){
            System.out.print("Kullanıcı adı giriniz: ");
            String inputUsername= scanner.nextLine();
            System.out.print("Parola giriniz: ");
            String inputPassword = scanner.nextLine();

            if (!inputUsername.equals(username) || !inputPassword.equals(password) ){
                if (right==1){
                    System.out.println("Çok fazla hatalı giriş yapıldı. Hesabınız blokelenmiştir.");
                    break;
                }
                right--;
                System.out.println("Kullanıcı adı ve ya şifre hatalı! Lütfen tekrar giriniz.");
            }
            else {
                System.out.println("Giriş Başarılı");
                login = true;
                break;
            }

        }

        if (login){
            System.out.println("Merhaba, BNR Bankasına Hoşgeldiniz!");
            byte choice=0;
            while (choice != 4){
                System.out.println("-------------------------------");
                System.out.print("1-Para yatırma \n2-Para Çekme \n3-Bakiye Sorgula \n4-Çıkış Yap");
                System.out.println();
                choice = scanner.nextByte();
                switch (choice){
                    case 4:
                        System.out.println("Çıkış Yapıldı.");
                        break;
                    case 3:
                        System.out.println("Bakiye: " + balance + accountType);
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Çekilecek para miktarını giriniz: ");
                        float withdraw = scanner.nextFloat();
                        if (withdraw<0){
                            System.out.println("Eksi tutar girilemez.");
                            break;
                        }
                        else {
                            if (withdraw>balance){
                                System.out.println("Mevcut bakiyeden fazla para çekilemez. Bakiye: " + balance);
                                break;
                            }else {
                                balance -= withdraw;
                                System.out.println("Para çekilmiştir. Bakiye: " + balance);
                                break;
                            }
                        }
                    case 1:
                        System.out.print("Yatırılacak para miktarını giriniz: ");
                        float deposited = scanner.nextFloat();
                        if (deposited < 0){
                            System.out.println("Eksi tutar girilemez.");
                            break;
                        }
                        else {
                            balance += deposited;
                            System.out.println("Para yatırılmıştır. Bakiye: " + balance);
                            break;
                        }


                }

            }

        }
    }
}
