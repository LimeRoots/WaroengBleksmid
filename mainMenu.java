package WaroengBleksmid;
import java.util.Scanner;
<<<<<<< HEAD
public class mainMenu {
    Scanner input = new Scanner(System.in);
    toko toko = new toko();
    Inventory inventory = new Inventory();
    boolean s = true;
    int pilihan;
    public void tampilanAwal(){
        System.out.println("Valenvorg Blacksmith");
        System.out.println("1. Buka toko");
        System.out.println("2. Display barang");
        System.out.println("3. Crafting");
        System.out.println("4. Beli ore");
        System.out.println("5. Inventory");
        System.out.println("6. Status");
        System.out.print("\nMasukan anda: ");
    }
    public void statusToko(){
        toko.status();
        inventory.status();
    }
    public void masukan(){
        pilihan = input.nextInt();
        while (s) {
            switch (pilihan) {
                case 6:
                    statusToko();
                    tampilanAwal();
                    masukan();
=======
    public class mainMenu{
        toko toko = new toko();
        Inventory Inventory = new Inventory();
        boolean s = true;
        Scanner input = new Scanner(System.in);
        int p;
        public void menuAwal(){
            System.out.println("1. Buka toko");
            System.out.println("2. Atur rak toko");
            System.out.println("3. Crafting");
            System.out.println("4. Beli ore");
            System.out.println("5. Inventory");
            System.out.println("6. Status");
            System.out.println("7. Archive");
            System.out.print("Pilihan anda: ");
        }

        public void pilihan(){
            p = input.nextInt();
            while (s){
                switch (p){

                    case 5:
                        inventory();
                        break;
                    case 6:
                    status();
                    menuAwal();
                    pilihan();
                    break;

                    default:
                        s = false;
                        break;
                }
            }
        }

        public void status(){
            toko.printStatus();
        }

        public void inventory(){
            System.out.println("Anda mau melihat inventori apa? ");
            System.out.println("1. Lihat inventory material");
            System.out.println("2. Lihat inventory senjata");
            System.out.println("3. Lihat semua");
            System.out.print("Pilihan anda: ");
            int varianInventory = input.nextInt();
            switch (varianInventory){
                case 1:
                    Inventory.lihatInventoryMaterial();
                    menuAwal();
                    pilihan();
                    break;
                case 2:
                    Inventory.lihatInventoryItem();
                    menuAwal();
                    pilihan();
                    break;
                case 3:
                    Inventory.lihatInventoryItem();
                    Inventory.lihatInventoryMaterial();
                    menuAwal();
                    pilihan();
>>>>>>> 9eff20428c82c8c93379858023c303cdf15c62b8
                    break;
            }
        }
    }
}


                    