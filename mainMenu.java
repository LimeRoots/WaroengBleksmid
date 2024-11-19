package WaroengBleksmid;
import java.util.Scanner;
public class mainMenu{
    private String jenis;
    user user = new user();
    boolean s = true;
    Scanner input = new Scanner(System.in);
    blacksmith blacksmith = new blacksmith();
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
                case 3:
                    user.tampilkanJenisResepUser();
                    int pilihanjenisResep=input.nextInt();
                    switch (pilihanjenisResep){
                        case 1:
                        this.jenis = "Dagger";
                        break;
                        case  2:
                        this.jenis = "Spear";
                        break;
                        case 3:
                        this.jenis = "Sword";
                        break;
                        case 4:
                        this.jenis = "Axe";
                        break;
                        case 5:
                        this.jenis = "Bow";
                        break;
                        case 6:
                        this.jenis = "Arrow";
                        break;
                        case 7:
                        this.jenis = "Mace";
                        break;
                        case 8:
                        this.jenis = "Crossbow";
                        break;
                        case 9:
                        this.jenis = "Staff";
                        break;
                    }
                    user.tampilkanVarianResepUser(jenis);
                    break;
                case 5:
                    inventory();
                    menuAwal();
                    pilihan();
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
        user.ambilStatusToko();
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
                user.lihatInventoryMaterialUser();
                menuAwal();
                pilihan();
                break;
            case 2:
                user.lihatInventoryItemUser();
                menuAwal();
                pilihan();
                break;
            case 3:
                user.lihatInventoryMaterialUser();
                user.lihatInventoryItemUser();
                menuAwal();
                pilihan();
                break;
        }
    }
}



                    