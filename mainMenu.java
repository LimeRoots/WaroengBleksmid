package WaroengBleksmid;
import java.util.Scanner;
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
                    break;
            }
        }

          
}


                    