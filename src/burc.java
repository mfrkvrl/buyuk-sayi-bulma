import  java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        int ay,gun;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Kaçıncı ayda doğdunuz? ");
            ay = scanner.nextInt();
            System.out.println("Ayın kaçıncı günü doğdunuz? ");
            gun = scanner.nextInt();
            switch (ay) {
                case 1:
                    if (gun >= 22) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                    break;
                case 2:
                    if (gun >= 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                    break;
                case 3:
                    if (gun >= 21) {
                        System.out.println("Koç Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }

                    break;
                case 4:
                    if (gun >= 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                    break;
                case 5:
                    if (gun >= 22) {
                        System.out.println("İkizler Burcu");

                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                    break;
                case 6:
                    if (gun >= 23) {
                        System.out.println("Boğa Burcu");

                    }
                    break;
                case 7:
                    if (gun >= 23) {
                        System.out.println("Aslan Burcu");

                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                    break;
                case 8:
                    if (gun >= 21) {
                        System.out.println("Başak Burcu");

                    } else {
                        System.out.println("Aslan Burcu");
                    }
                    break;
                case 9:
                    if (gun >= 23) {
                        System.out.println("Terazi Burcu");

                    } else {
                        System.out.println("Başak Burcu");
                    }
                    break;
                case 10:
                    if (gun >= 21) {
                        System.out.println("Akrep Burcu");

                    } else {
                        System.out.println("Terazi Burcu");
                    }
                    break;
                case 11:
                    if (gun >= 22) {
                        System.out.println("Yay Burcu");

                    } else {
                        System.out.println("Akrep Burcu");
                    }
                    break;
                case 12:
                    if (gun >= 22) {
                        System.out.println("Oğlak Burcu");

                    } else {
                        System.out.println("Yay Burcu");
                    }
                    break;
            }
        }
    }
}
