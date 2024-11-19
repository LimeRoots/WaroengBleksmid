package WaroengBleksmid;
import java.util.Scanner;
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
                    break;
            }
        }
    }
}


                    