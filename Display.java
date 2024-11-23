package WaroengBleksmid;

    public class Display {
        private item[] itemDisplay;
        private listItem listItem;
        private int angka;
        private int Level;
        private int kolom;
        private int hargaUpgrade;
        
    public Display(){
        this.Level = 1;
        itemDisplay = new item[12];
        listItem = new listItem();
    }
    
    public void tambahDisplay(String nama,int harga) {
        for (int i = 0; i < itemDisplay.length; i++) {
            if (itemDisplay[i] == null) { 
                if(i >= Level * 3){
                    System.out.println("Rak toko tidak cukup");
                    return;
                }
                item tambah = listItem.cariItem(nama);
                if (tambah != null) { 
                    itemDisplay[i] = tambah; 
                    itemDisplay[i].ubahHargaJualItem(harga);
                }
                break; 
            }
        }
    }

    public void kurangiDisplay(String nama) {
        for (int i = 0; i < itemDisplay.length; i++) {
            if (itemDisplay[i] != null && itemDisplay[i].ambilNamaItem().equalsIgnoreCase(nama)) {
                itemDisplay[i] = null;
                break;
            }
        }
    }
    
    public int tambahLevel(int tambah){
        return Level += tambah;
    }
    
    public int ambilLevelDisplay(){
        return Level;
    }
    
    public void lihatDisplay() {
        this.angka = 0;
        this.kolom = 3;
        String[][] displayGrid = new String[Level][kolom]; 
        
        for (int i = 0; i < itemDisplay.length && angka < Level*kolom; i++) {
            if (itemDisplay[i] != null) {
                String namaItem = itemDisplay[i].ambilNamaItem();
                int hargaItem = itemDisplay[i].ambilHargaJualItem(); 
                displayGrid[angka / kolom][angka % kolom] = namaItem + " (Harga: " + hargaItem + ")";
                angka++;
            } else {
                displayGrid[angka / kolom][angka % kolom] = "Kosong";
                angka++;
            }
        }
    
        for (int r = 0; r < Level; r++) {
            for (int c = 0; c < kolom; c++) {
                System.out.print("[" + displayGrid[r][c] + "] "); 
            }
            System.out.println(); 
        }
    }
    
    public int upgradeDisplay(int qwer){
        if(Level == 1){
            this.hargaUpgrade = 50;
                if (qwer >= hargaUpgrade){
                    tambahLevel(1);
                }
    
                else{
                    System.out.println("Qwer tidak cukup!");
                }
        }
        
        else if(Level == 2){
            this.hargaUpgrade = 100;
                if (qwer >= hargaUpgrade){
                    tambahLevel(1);
                }
    
                else{
                    System.out.println("Qwer tidak cukup!");
                }
        }
        
        else if(Level == 3){
            this.hargaUpgrade = 150;
                if (qwer >= hargaUpgrade){
                    tambahLevel(1);
                }
    
                else{
                    System.out.println("Qwer tidak cukup!");
                }
        }
        
        else if(Level == 4){
            this.hargaUpgrade = 200;
                if (qwer >= hargaUpgrade){
                    tambahLevel(1);
                }
    
                else{
                    System.out.println("Qwer tidak cukup!");
                }
        }
        
        return (hargaUpgrade);
    }
    
    public int hargaUpgrade(){
        return this.hargaUpgrade;
    }
}