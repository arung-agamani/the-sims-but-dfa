public class Player {
    public int hygiene;
    public int energy;
    public int fun;
    public boolean isSleep;

    public Player() {
        this.hygiene = 0;
        this.energy = 10;
        this.fun = 0;
        this.isSleep = false;
    }

    public void Tidur(String tipe){
        if (tipe == "Siang") {
            this.energy += 10;
        } else if (tipe == "Malam") {
            this.energy += 15;
        } else {
            System.out.println("Tipe tidur anda tidak valid. Silahkan mengisi dengan \"Malam\" atau \"Siang\"");
        }
    }

    public void Makan(String tipe){
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

    public void Minum(String tipe){
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

    public void BuangAir(String tipe){
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

    public void Nongki(){
        this.fun += 15;
        this.energy -= 10;
        this.hygiene -= 5;
    }

    public void Medsos(){
        this.fun += 10;
        this.energy -= 10;
    }

    public void Komputer(){
        this.fun += 15;
        this.energy -= 10;
    }

    public void Mandi(){
        this.hygiene += 15;
        this.energy -= 5;
    }

    public void CuciTangan(){
        this.hygiene += 5;
    }

    public void DengarRadio(){
        this.fun += 10;
        this.energy -= 5;
    }

    public void Membaca(){
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

    public void PrintAtribut() {
        System.out.println("Hygiene = " + this.hygiene);
        System.out.println("Energy = " + this.energy);
        System.out.println("Fun = " + this.fun);
    }

}