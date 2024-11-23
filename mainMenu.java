package WaroengBleksmid;

import java.util.Scanner;

public class mainMenu{
    int Pilihan;
    private String jenis;
    user user = new user();
    Scanner input = new Scanner(System.in);
    blacksmith blacksmith = new blacksmith();
    
    public void menuAwal(){
        System.out.println("1. Skip Hari");
        System.out.println("2. Atur rak toko");
        System.out.println("3. Crafting");
        System.out.println("4. Beli Material");
        System.out.println("5. Inventory");
        System.out.println("6. Status");
        System.out.println("7. Keluar");
        System.out.print("Pilihan anda: ");
        Pilihan = input.nextInt();
        
        switch (Pilihan) {
            case 1 :

            break;
             
            case 2 :
                aturRakToko();
            break;
            
            case 3 :
                user.tampilkanJenisResepUser();
                System.out.print("Pilihan anda : ");
                int pilihanResep = input.nextInt();
                pilihanJenisResep(pilihanResep);
                user.tampilkanVarianResepUser(jenis);
                pilihanResep();
            break;
                    
            case 4 :
                user.supplyUlang();
                user.lihatSupply();
                System.out.print("Material yang ingin anda beli      : ");
                String Nama = input.next();
                System.out.print("Masukkan jumlah yang ini anda beli : ");
                int Jumlah = input.nextInt();
                user.beliStok(Nama, Jumlah);
                menuAwal();
            break;
               
            case 5 :
                inventory();
            break;
                
            case 6 :
                status();
            break;
                
            case 7 :
                System.out.println("Terima kasih telah bermain!");
            break;
                
            default :
                System.out.println("Input tidak valid!");
                menuAwal();
            break;
        }
    }
    
    private void aturRakToko(){

        System.out.println("Level toko anda sekarang level " + user.ambilLevelTokoUser());
        System.out.println("\nApakah yang ingin anda lakukan? ");
        System.out.println("1. Tambah item rak toko");
        System.out.println("2. Upgrade toko");
        System.out.println("3. Kembali");
        System.out.print("Pilihan anda :");
        Pilihan = input.nextInt();
            if(Pilihan == 3){
                System.out.println("Kembali ke Menu Utama");
                menuAwal();
            }
            
            else if(Pilihan == 2){
                if(user.ambilLevelTokoUser() < 4){
                    System.out.println("Rak toko anda saat ini");
                    user.lihatDisplayUser();
                    System.out.println("Apakah anda ingin upgrade?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Pilihan anda : ");
                    Pilihan = input.nextInt();
                    if (Pilihan == 1){
                        user.upgradeDisplayUser(user.lihatUang());
                        System.out.println("Sisa uang anda : " + user.lihatUang());
                        menuAwal();
                    }
                    else{
                        menuAwal();
                    }
                }
                                
                else{
                    System.out.println("Toko anda sudah mencapai level maks!");
                    menuAwal();
                }
            }
            
            else if (Pilihan != 1){
                System.out.println("Input Tidak Valid");
                menuAwal();
            }
            
            else {
                System.out.println("Membuka inventory anda ");
                user.lihatInventoryItemUser();
                System.out.print("\nItem mana yang ingin anda jual (Tulis nama item) : ");
                input.nextLine();
                String pilihanDisplay = input.nextLine();
                    if(!user.cariItem(pilihanDisplay)){
                        System.out.println("Item tidak ada di inventory.... kembali ke menu utama");
                        menuAwal();
                    }
                
                else {
                    System.out.print("Masukkan harga jual : ");
                    int hargajual = input.nextInt();
                    user.tambahDisplayUser(pilihanDisplay, hargajual);
                    user.lihatDisplayUser();
                    menuAwal();
            }
        }
    }
    
    private void pilihanJenisResep(int pilihan){
        switch (pilihan){
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
    }
    
    private void pilihanResep(){
        int pilihanvarianResep = input.nextInt();
        String[] daftar = user.ambilDataVarian();
        String pilihanResep = daftar[pilihanvarianResep-1];
        System.out.print("Masukkan jumlah yang ingin anda buat : ");
        int jumlahMembuat = input.nextInt();
        user.ambilDeskripsiItem(pilihanResep);
        user.buatItem(pilihanResep,jumlahMembuat);
        menuAwal();
    }
    
    private void inventory(){
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
                break;
                
            case 2:
                user.lihatInventoryItemUser();
                menuAwal();
                break;
                
            case 3:
                user.lihatInventoryMaterialUser();
                user.lihatInventoryItemUser();
                menuAwal();
                break;
        }
    }
    
    private void status(){
        user.ambilStatusToko();
    }
}
                    