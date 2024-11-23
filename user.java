package WaroengBleksmid;

    public class user{
        private Supplier supplier;
        private Inventory inventory;
        private blacksmith blacksmith;
        private toko toko;
        private static int qwer;
        private siklusSiangMalam siklusSiangMalam;
        private Display display;
        private String[] dataVarian;
        
        public user(){
            this.supplier = new Supplier();
            this.inventory = new Inventory();
            this.blacksmith = new blacksmith();
            this.qwer = 1000;
            this.toko = new toko();
            this.siklusSiangMalam = new siklusSiangMalam();
            this.display = new Display();
            
        System.out.println("User  level: " + this.toko.ambilLevelToko());
        }

        public void lihatSupply(){
            supplier.lihatStok();
        }
        
        public void lihatInventoryMaterialUser(){
            inventory.lihatInventoryMaterial();
        }
        
        public void lihatInventoryItemUser(){
            inventory.lihatInventoryItem();
        }
        
        public void beliStok(String nama,int jumlah){
            supplier.beliStok(nama,jumlah,this.inventory,this);
        }
        
        public boolean cariItem(String nama){
            return inventory.adaItem(nama);
        }
        
        public void tambahInventory(){
            inventory.tambahItemSenjata("Copper Dagger",10);
        }
        
        public String ambilDeskripsiItem(String nama){
            return inventory.ambilDeskripsiItemInventory(nama);
        }

        public void kurangUang(int jumlah){
            qwer -= jumlah;
        }
        
        public void tambahUang (int jumlah){
            qwer += jumlah;
        }
        
        public  boolean punyaCukupDuit(int Jumlah){
            return this.qwer >= Jumlah;
        }
        
        public int lihatUang(){
            return this.qwer;
        }

        public void ambilStatusToko(){
            toko.status();
        }
        
        public void buatItem(String nama,int jumlah){
            blacksmith.membuatItem(nama,jumlah,this.inventory);
        }
        
        public void tampilkanVarianResepUser (String jenis) {
            this.dataVarian = blacksmith.tampilkanJenisVarianResep(toko.ambilLevelToko(), jenis);
            
            System.out.println("Resep yang tersedia untuk jenis " + jenis + ": ");
            if (this.dataVarian == null || this.dataVarian.length == 0) {
                System.out.println("Tidak ada resep yang tersedia untuk jenis ini.");
                return;
            }
            
            for (int i = 0; i < this.dataVarian.length; i++) {
                if (this.dataVarian[i] != null) {
                    System.out.println((i + 1) + ". " + this.dataVarian[i]);
                }
            }
            System.out.print("Masukkan Pilihan Anda : ");
        }
        
        public void tampilkanJenisResepUser () {
            String[] dataJenis= blacksmith.tampilkanJenisResep(toko.ambilLevelToko());
            System.out.println("Resep yang tersedia: ");
            
        
            for (int i = 0; i < dataJenis.length; i++) {
                if(dataJenis[i] != null){
                System.out.println((i + 1) + ". " + dataJenis[i]);
                }
            }
        }

        public String[] ambilDataVarian(){
            return dataVarian;
        }
        
        public void melakukanKegiatan(){
            if(siklusSiangMalam.lihatWaktuSekarang().contains("Malam")){
                System.out.println("Tidur Gblog");
            }
        }
        
        public void majukanWaktuUser(int menit){
            siklusSiangMalam.majukanWaktu(menit);
        }
        
        public void lihatWaktuUserSekarang(){
            siklusSiangMalam.lihatWaktuSekarang();
        }
        
        public void supplyUlang(){
            supplier.stokUlang();
        }
        
        public void lihatDisplayUser(){
            display.lihatDisplay();
        }
        
        public void tambahDisplayUser(String nama,int harga){
            display.tambahDisplay(nama,harga);
        }
        
        public void upgradeDisplayUser(int qwer){
            display.upgradeDisplay(qwer);
            
            kurangUang(display.hargaUpgrade());
        }
        
        public int ambilLevelTokoUser(){
            return display.ambilLevelDisplay();
        }
    }

        


                    