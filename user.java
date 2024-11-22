package WaroengBleksmid;

    public class user{
        private Supplier supplier;
        private Inventory inventory;
        private blacksmith blacksmith;
        private toko toko;

        private daftarMaterial[] daftarMaterial;
        private static int qwer;
        private static int energi;
        public user(){
            this.supplier = new Supplier();
            this.inventory = new Inventory();
            this.blacksmith = new blacksmith();
            this.daftarMaterial = new daftarMaterial[7];
            this.qwer = 20;
            this.toko = new toko();
            this.energi = 5;
        System.out.println("User  level: " + this.toko.ambilLevelToko());
        }
        public void lihatSupply(){
            supplier.lihatStok();
        }

        public void lihatInventoryMaterialUser(){
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Diamond", 10);
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Copper", 10);
            inventory.tambahItemMaterial("Iron", 10);
            inventory.lihatInventoryMaterial();
        }
        public void lihatInventoryItemUser(){
            inventory.tambahItemSenjata("Copper Dagger", 3);
            inventory.tambahItemSenjata("Copper Mace", 3);
            inventory.tambahItemSenjata("Diamond Crossbow", 3);
            inventory.tambahItemSenjata("Bow", 6);
            inventory.lihatInventoryItem();
        }
        public void buatItem(String nama,int jumlah){
            blacksmith.membuatItem(nama,jumlah,this.inventory);
        }
        public void beliStok(String nama,int jumlah){
            supplier.beliStok(nama,jumlah,this.inventory,this);
        }
        public void kurangUang(int jumlah){
            qwer -= jumlah;
        }
        public void tambahUang (int jumlah){
            qwer += jumlah;
        }
        public void kurangEnergi(int jumlah){
            energi -= jumlah;
        }
        public void tambahEnergi(int jumlah){
            energi += jumlah;
        }
        public  boolean punyaCukupDuit(int Jumlah){
            return this.qwer >= Jumlah;
        }
        public boolean punyaCukupEnergi(int jumlah){
            return this.energi >= jumlah;
        }
        public int lihatUang(){
            return this.qwer;
        }
        public int lihatEnergi(){
            return this.energi;
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
        public void ambilStatusToko(){
            toko.status();
        }
        public void tampilkanVarianResepUser (String jenis) {
            String[] dataVarian = blacksmith.tampilkanJenisVarianResep(toko.ambilLevelToko(), jenis);
            
            System.out.println("Resep yang tersedia untuk jenis " + jenis + ": ");
            if (dataVarian == null || dataVarian.length == 0) {
                System.out.println("Tidak ada resep yang tersedia untuk jenis ini.");
                return;
            }
            
            for (int i = 0; i < dataVarian.length; i++) {
                if (dataVarian[i] != null) {
                    System.out.println((i + 1) + ". " + dataVarian[i]);
                }
            }
        }
        public void menuSupply(){
            lihatSupply();
        }
        public int ambilEnergi(){
            return energi;
        }
        public void userAmbilNamaMaterial(){
            for (daftarMaterial material : daftarMaterial) {
                if (material != null) {
                    System.out.println(material.ambilNamaMaterial() +  " - Banyak Stok: " + material.ambilJumlahMaterial());
                }
            }
        }


    }

        


                    