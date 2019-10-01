import java.util.Scanner;



public class App {
    static Player player = new Player();

    public static void main(String args[]) {
        System.out.println("====THE SIMS BUT DFA====");
        
        Scanner sc = new Scanner(System.in);
        String command;
        boolean isDone = false;

        System.out.println("Now you're starting as a new person. A fresh person but with only :");
        player.PrintAtribut();
        System.out.println("The game will not stop until you reached all zero, or all 15, or you ragequit.");
        System.out.println("Choose your steps carefully, as invalid actions will not be counted.");
        while(!isDone) {
            System.out.println("Enter your command.");
            System.out.print(">> ");
            command = sc.nextLine();
            command.toLowerCase();
            // Command switch
            switch (command) {
                case "tidur" :
                    System.out.println("Tidur siang/malam?");
                    System.out.print(">> ");
                    String tipe = sc.nextLine();
                    tipe.toLowerCase();
                    if (tipe.equals("siang") || tipe.equals("tidur siang")) {
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Tidur("Siang");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Tidur("Siang");
                            player.PrintAtribut();
                        }
                    } else if (tipe.equals("malam") || tipe.equals("tidur malam")){
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;;
                        dummy.Tidur("Malam");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Tidur("Malam");
                            player.PrintAtribut();
                        }
                    } else {
                        System.out.println("Masukan anda tidak valid.");
                    }
                    break;

                case "tidur siang" :
                    Player dummy2210 = new Player();
                    dummy2210.energy = player.energy;
                    dummy2210.fun = player.fun;
                    dummy2210.hygiene = player.hygiene;
                    dummy2210.Tidur("Siang");
                    if ((dummy2210.energy > 15 || dummy2210.fun > 15 || dummy2210.hygiene > 15) || (dummy2210.energy < 0 || dummy2210.fun < 0 || dummy2210.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Tidur("Siang");
                        player.PrintAtribut();
                    }
                    break;

                case "tidur malam" :
                    Player dummy11 = new Player();
                    dummy11.energy = player.energy;
                    dummy11.fun = player.fun;
                    dummy11.hygiene = player.hygiene;;
                    dummy11.Tidur("Malam");
                    if ((dummy11.energy > 15 || dummy11.fun > 15 || dummy11.hygiene > 15) || (dummy11.energy < 0 || dummy11.fun < 0 || dummy11.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Tidur("Malam");
                        player.PrintAtribut();
                    }
                
                case "makan" :
                    System.out.println("Makan hamburger / pizza / steak and beans?");
                    System.out.print(">> ");
                    String tipe2 = sc.nextLine();
                    tipe2.toLowerCase();
                    if (tipe2.equals("hamburger") || tipe2.equals("makan hamburger")){
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Makan("Hamburger");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Makan("Hamburger");
                            player.PrintAtribut();
                        }
                    } else if (tipe2.equals("pizza") || tipe2.equals("makan pizza")) {
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Makan("Pizza");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Makan("Pizza");
                            player.PrintAtribut();
                        }
                    } else if (tipe2.equals("steak and beans")|| tipe2.equals("makan steak and beans")){
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Makan("Steak and Beans");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Makan("Steak and Beans");
                            player.PrintAtribut();
                        }
                    } else {
                        System.out.println("Masukan anda tidak valid.");
                    }
                    break;

                case "makan hamburger" :
                    Player dummy21 = new Player();
                    dummy21.energy = player.energy;
                    dummy21.fun = player.fun;
                    dummy21.hygiene = player.hygiene;
                    dummy21.Makan("Hamburger");
                    if ((dummy21.energy > 15 || dummy21.fun > 15 || dummy21.hygiene > 15) || (dummy21.energy < 0 || dummy21.fun < 0 || dummy21.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Makan("Hamburger");
                        player.PrintAtribut();
                    }
                    break;

                case "makan pizza" :
                    Player dummy22 = new Player();
                    dummy22.energy = player.energy;
                    dummy22.fun = player.fun;
                    dummy22.hygiene = player.hygiene;
                    dummy22.Makan("Pizza");
                    if ((dummy22.energy > 15 || dummy22.fun > 15 || dummy22.hygiene > 15) || (dummy22.energy < 0 || dummy22.fun < 0 || dummy22.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Makan("Pizza");
                        player.PrintAtribut();
                    }
                    break;

                case "makan steak and beans" :
                    Player dummy23 = new Player();
                    dummy23.energy = player.energy;
                    dummy23.fun = player.fun;
                    dummy23.hygiene = player.hygiene;
                    dummy23.Makan("Steak and Beans");
                    if ((dummy23.energy > 15 || dummy23.fun > 15 || dummy23.hygiene > 15) || (dummy23.energy < 0 || dummy23.fun < 0 || dummy23.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Makan("Steak and Beans");
                        player.PrintAtribut();
                    }
                    break;

                case "minum" :
                    System.out.println("Minum air / kopi / jus?");
                    System.out.print(">> ");
                    String tipe3 = sc.nextLine();
                    tipe3.toLowerCase();
                    if (tipe3.equals("air") || tipe3.equals("minum air")){
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Minum("Air");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Minum("Air");
                            player.PrintAtribut();
                        }
                    } else if (tipe3.equals("kopi") || tipe3.equals("minum kopi")) {
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Minum("Kopi");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Minum("Kopi");
                            player.PrintAtribut();
                        }
                    } else if (tipe3.equals("jus") || tipe3.equals("minum jus")) {
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.Minum("Jus");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Minum("Jus");
                            player.PrintAtribut();
                        }
                    } else {
                        System.out.println("Masukan anda tidak valid.");
                    }
                    break;

                case "minum air" :
                    Player dummy31 = new Player();
                    dummy31.energy = player.energy;
                    dummy31.fun = player.fun;
                    dummy31.hygiene = player.hygiene;
                    dummy31.Minum("Air");
                    if ((dummy31.energy > 15 || dummy31.fun > 15 || dummy31.hygiene > 15) || (dummy31.energy < 0 || dummy31.fun < 0 || dummy31.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Minum("Air");
                        player.PrintAtribut();
                    }
                    break;

                case "minum kopi" :
                    Player dummy32 = new Player();
                    dummy32.energy = player.energy;
                    dummy32.fun = player.fun;
                    dummy32.hygiene = player.hygiene;
                    dummy32.Minum("Kopi");
                    if ((dummy32.energy > 15 || dummy32.fun > 15 || dummy32.hygiene > 15) || (dummy32.energy < 0 || dummy32.fun < 0 || dummy32.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Minum("Kopi");
                        player.PrintAtribut();
                    }
                    break;
                case "minum jus" :
                    Player dummy33 = new Player();
                    dummy33.energy = player.energy;
                    dummy33.fun = player.fun;
                    dummy33.hygiene = player.hygiene;
                    dummy33.Minum("Jus");
                    if ((dummy33.energy > 15 || dummy33.fun > 15 || dummy33.hygiene > 15) || (dummy33.energy < 0 || dummy33.fun < 0 || dummy33.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Minum("Jus");
                        player.PrintAtribut();
                    }
                    break;

                case "buang air" :
                    System.out.println("Buang air besar/kecil?");
                    System.out.print(">> ");
                    String tipe4 = sc.nextLine();
                    tipe4.toLowerCase();
                    if (tipe4.equals("besar") || tipe4.equals("buang air besar")){
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.BuangAir("Besar");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.BuangAir("Besar");
                            player.PrintAtribut();
                        }
                    } else if (tipe4.equals("kecil") || tipe4.equals("buang air kecil")) {
                        Player dummy = new Player();
                        dummy.energy = player.energy;
                        dummy.fun = player.fun;
                        dummy.hygiene = player.hygiene;
                        dummy.BuangAir("Kecil");
                        if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.BuangAir("Kecil");
                            player.PrintAtribut();
                        }
                    } else {
                        System.out.println("Masukan anda tidak valid.");
                    }
                    break;
                
                case "buang air besar" :
                    Player dummy41 = new Player();
                    dummy41.energy = player.energy;
                    dummy41.fun = player.fun;
                    dummy41.hygiene = player.hygiene;
                    dummy41.BuangAir("Besar");
                    if ((dummy41.energy > 15 || dummy41.fun > 15 || dummy41.hygiene > 15) || (dummy41.energy < 0 || dummy41.fun < 0 || dummy41.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.BuangAir("Besar");
                        player.PrintAtribut();
                    }
                    break;
                case "buang air kecil" :
                    Player dummy42 = new Player();
                    dummy42.energy = player.energy;
                    dummy42.fun = player.fun;
                    dummy42.hygiene = player.hygiene;
                    dummy42.BuangAir("Kecil");
                    if ((dummy42.energy > 15 || dummy42.fun > 15 || dummy42.hygiene > 15) || (dummy42.energy < 0 || dummy42.fun < 0 || dummy42.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.BuangAir("Kecil");
                        player.PrintAtribut();
                    }
                    break;

                case "nongki" :
                    Player dummy = new Player();
                    dummy.energy = player.energy;
                    dummy.fun = player.fun;
                    dummy.hygiene = player.hygiene;
                    dummy.Nongki();
                    if ((dummy.energy > 15 || dummy.fun > 15 || dummy.hygiene > 15) || (dummy.energy < 0 || dummy.fun < 0 || dummy.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Nongki();
                        player.PrintAtribut();
                    }
                    break;

                case "medsos" :
                    Player dummy2 = new Player();
                    dummy2.energy = player.energy;
                    dummy2.fun = player.fun;
                    dummy2.hygiene = player.hygiene;
                    dummy2.Medsos();
                    if ((dummy2.energy > 15 || dummy2.fun > 15 || dummy2.hygiene > 15) || (dummy2.energy < 0 || dummy2.fun < 0 || dummy2.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Medsos();
                        player.PrintAtribut();
                    }
                    break;

                case "komputer" :
                    Player dummy3 = new Player();
                    dummy3.energy = player.energy;
                    dummy3.fun = player.fun;
                    dummy3.hygiene = player.hygiene;
                    dummy3.Komputer();
                    if ((dummy3.energy > 15 || dummy3.fun > 15 || dummy3.hygiene > 15) || (dummy3.energy < 0 || dummy3.fun < 0 || dummy3.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Komputer();
                        player.PrintAtribut();
                    }
                    break;

                case "mandi" :
                    Player dummy4 = new Player();
                    dummy4.energy = player.energy;
                    dummy4.fun = player.fun;
                    dummy4.hygiene = player.hygiene;
                    dummy4.Mandi();
                    if ((dummy4.energy > 15 || dummy4.fun > 15 || dummy4.hygiene > 15) || (dummy4.energy < 0 || dummy4.fun < 0 || dummy4.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Mandi();
                        System.out.println("EXECUTED FROM ELSE");
                        player.PrintAtribut();
                    }
                    break;

                case "cuci tangan" :
                    Player dummy5 = new Player();
                    dummy5.energy = player.energy;
                    dummy5.fun = player.fun;
                    dummy5.hygiene = player.hygiene;
                    dummy5.CuciTangan();
                    if ((dummy5.energy > 15 || dummy5.fun > 15 || dummy5.hygiene > 15) || (dummy5.energy < 0 || dummy5.fun < 0 || dummy5.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.CuciTangan();
                        player.PrintAtribut();
                    }
                    break;

                case "dengar radio" :
                    Player dummy6 = new Player();
                    dummy6.energy = player.energy;
                    dummy6.fun = player.fun;
                    dummy6.hygiene = player.hygiene;
                    dummy6.DengarRadio();;
                    if ((dummy6.energy > 15 || dummy6.fun > 15 || dummy6.hygiene > 15) || (dummy6.energy < 0 || dummy6.fun < 0 || dummy6.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.DengarRadio();;
                        player.PrintAtribut();
                    }
                    break;

                case "membaca" :
                    System.out.println("Membaca koran/novel?");
                    System.out.print(">> ");
                    String tipe5 = sc.nextLine();
                    tipe5.toLowerCase();
                    if (tipe5.equals("koran") || tipe5.equals("membaca koran")){
                        Player dummy7 = new Player();
                        dummy7.energy = player.energy;
                        dummy7.fun = player.fun;
                        dummy7.hygiene = player.hygiene;
                        dummy7.Membaca("Koran");
                        if ((dummy7.energy > 15 || dummy7.fun > 15 || dummy7.hygiene > 15) || (dummy7.energy < 0 || dummy7.fun < 0 || dummy7.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Membaca("Koran");
                            player.PrintAtribut();
                        }
                    } else if (tipe5.equals("novel") || tipe5.equals("membaca novel")) {
                        Player dummy8 = new Player();
                        dummy8.energy = player.energy;
                        dummy8.fun = player.fun;
                        dummy8.hygiene = player.hygiene;
                        dummy8.Membaca("Novel");
                        if ((dummy8.energy > 15 || dummy8.fun > 15 || dummy8.hygiene > 15) || (dummy8.energy < 0 || dummy8.fun < 0 || dummy8.hygiene < 0)) {
                            System.out.println("Aksi tidak valid");
                        } else {
                            player.Membaca("Novel");
                            player.PrintAtribut();
                        }
                    } else {
                        System.out.println("Masukan anda tidak valid.");
                    }
                    break;
                
                case "membaca koran" :
                    Player dummy7 = new Player();
                    dummy7.energy = player.energy;
                    dummy7.fun = player.fun;
                    dummy7.hygiene = player.hygiene;
                    dummy7.Membaca("Koran");
                    if ((dummy7.energy > 15 || dummy7.fun > 15 || dummy7.hygiene > 15) || (dummy7.energy < 0 || dummy7.fun < 0 || dummy7.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Membaca("Koran");
                        player.PrintAtribut();
                    }
                    break;

                case "membaca novel" :
                    Player dummy8 = new Player();
                    dummy8.energy = player.energy;
                    dummy8.fun = player.fun;
                    dummy8.hygiene = player.hygiene;
                    dummy8.Membaca("Novel");
                    if ((dummy8.energy > 15 || dummy8.fun > 15 || dummy8.hygiene > 15) || (dummy8.energy < 0 || dummy8.fun < 0 || dummy8.hygiene < 0)) {
                        System.out.println("Aksi tidak valid");
                    } else {
                        player.Membaca("Novel");
                        player.PrintAtribut();
                    }
                    break;

                default :
                    System.out.println("Command anda tidak valid. Silahkan coba lagi");
            }
            if ((player.energy == 15 && player.hygiene == 15 && player.fun == 15) || (player.energy == 0 && player.hygiene == 0 && player.fun == 0)) {
               isDone = true;
            }
        }
        if (isDone) {
            System.out.println("Permainan selesai!");
        }
        sc.close();
    }
}

public class Player {
    public float hygiene;
    public float energy;
    public float fun;
    public boolean isSleep;

    Player() {
        super();
        this.hygiene = 0;
        this.energy = 10;
        this.fun = 0;
        this.isSleep = false;
    }

    void Tidur(String tipe){
        if (tipe == "Siang") {
            this.energy += 10;
        } else if (tipe == "Malam") {
            this.energy += 15;
        } else {
            System.out.println("Tipe tidur anda tidak valid. Silahkan mengisi dengan \"Malam\" atau \"Siang\"");
        }
    }

    void Makan(String tipe){
        switch (tipe) {
            case "Hamburger" :
                this.energy += 5;
                break;
            
            case "Pizza" :
                this.energy += 10;
                break;
            
            case "Steak and Beans" :
                this.energy += 15;
                break;

            default:
                System.out.println("Tipe makanan anda tidak valid.");
                System.out.println("Silahkan mengisi dengan \"Hamburger\" atau \"Pizza\" atau \"Steak and Beans\"");
        }
    }

    void Minum(String tipe){
        switch (tipe) {
            case "Air" :
                this.hygiene -= 5;
                break;
            
            case "Kopi" :
                this.energy += 5;
                this.hygiene -= 10;
                break;
            
            case "Jus" :
                this.energy += 10;
                this.hygiene -= 5;
                break;

            default:
                System.out.println("Tipe makanan anda tidak valid.");
                System.out.println("Silahkan mengisi dengan \"Hamburger\" atau \"Pizza\" atau \"Steak and Beans\"");
        }
    }

    void BuangAir(String tipe){
        switch (tipe) {
            case "Kecil" :
                this.hygiene += 5;
                break;
            
            case "Besar" :
                this.energy -= 5;
                this.hygiene += 10;
                break;

            default:
                System.out.println("Tipe makanan anda tidak valid.");
                System.out.println("Silahkan mengisi dengan \"Hamburger\" atau \"Pizza\" atau \"Steak and Beans\"");
        }
    }

    void Nongki(){
        this.fun += 15;
        this.energy -= 10;
        this.hygiene -= 5;
    }

    void Medsos(){
        this.fun += 10;
        this.energy -= 10;
    }

    void Komputer(){
        this.fun += 15;
        this.energy -= 10;
    }

    void Mandi(){
        
        this.hygiene += 15;
        this.energy -= 5;
    }

    void CuciTangan(){
        this.hygiene += 5;
    }

    void DengarRadio(){
        this.fun += 10;
        this.energy -= 5;
    }

    void Membaca(String tipe){
        switch (tipe) {
            case "Koran" :
                this.fun += 5;
                this.energy -= 5;
                break;
            
            case "Novel" :
                this.energy -= 5;
                this.fun += 10;
                break;

            default:
                System.out.println("Tipe makanan anda tidak valid.");
                System.out.println("Silahkan mengisi dengan \"Hamburger\" atau \"Pizza\" atau \"Steak and Beans\"");
        }
    }

    void PrintAtribut() {
        System.out.println("Hygiene = " + (int)this.hygiene);
        System.out.println("Energy = " + (int)this.energy);
        System.out.println("Fun = " + (int)this.fun);
    }

}
