package WaroengBleksmid;

    public class Inventory {
        public item [] daftarSenjata;
        public listMaterial listMaterial;
        public listItem listItem;
        
        public Inventory(){
            listMaterial = new listMaterial();
            listItem = new listItem();
        }
        
        public void tambahItemMaterial(String nama,int jumlah){
            Material tambah = new Material(nama,0,jumlah);
            for (Material a : listMaterial.daftarListMaterial){
                if (a.ambilNamaMaterial().equals(tambah.ambilNamaMaterial())){
                     a.tambahJumlahMaterial (tambah.ambilJumlahMaterial());
                }
            }
        }
        
        public void kurangItemMaterial(String nama, int jumlah){
            Material kurang = new Material(nama,0,jumlah);
            for (Material a : listMaterial.daftarListMaterial){
                if (a.ambilNamaMaterial().equals(kurang.ambilNamaMaterial())){
                     a.kurangJumlahMaterial (kurang.ambilJumlahMaterial());
                }
            } 
        }

        public void lihatInventoryMaterial(){
            System.out.println("Inventory Material Anda: ");
            for(Material b:listMaterial.daftarListMaterial){
                if (b.ambilJumlahMaterial() > 0){
                    System.out.println(b.ambilNamaMaterial() + " -Harga Awal: " + b.ambilHargaMaterial() + " Jumlah: "+b.ambilJumlahMaterial());
                }

            }
        }
        
        public void tambahItemSenjata(String tipe,int jumlah){
            item tambahSenjata = new item(tipe,0,jumlah,0,"");
            for (item a : listItem.daftarListItem){
                if (a.ambilNamaItem().equals(tambahSenjata.ambilNamaItem())){
                     a.tambahJumlahItem (tambahSenjata.ambilJumlahItem());
                }
            }
        }
        
        public void kurangItemSenjata(String tipe, int jumlah){
            item kurangSenjata = new item(tipe,0,jumlah,0,"");
            for (item a : listItem.daftarListItem){
                if (a.ambilNamaItem().equals(kurangSenjata.ambilNamaItem())){
                     a.kurangJumlahItem (kurangSenjata.ambilJumlahItem());
                }
            } 
        }
        
        public void lihatInventoryItem(){
            System.out.println("Inventory Senjata Anda: ");
            for(item b:listItem.daftarListItem){
                if (b.ambilJumlahItem() > 0){
                    System.out.println(b.ambilNamaItem() + " -Harga Awal: " + b.ambilHargaJualItem() + " Jumlah: "+b.ambilJumlahItem());
                }
            }
        }
        
        public void status(){
            lihatInventoryMaterial();
            lihatInventoryItem();
        }
        
        public boolean adaItem(String nama) {
            boolean ada = false; 
            for (int i = 0; i < this.listItem.daftarListItem.length; i++) {
                if (listItem.daftarListItem[i] != null && listItem.daftarListItem[i].ambilNamaItem().equalsIgnoreCase(nama)) {
                    ada= true; 
                    break; 
                }
            }
            if (ada){
                return true;
            }
            else {
                return false;
            }
        }
        
        public String ambilDeskripsiItemInventory(String nama){
            String deskripsi=null;
            for(int i =0 ;i< listItem.daftarListItem.length;i++){
                if(listItem.daftarListItem[i].ambilNamaItem().equalsIgnoreCase(nama)){
                    deskripsi = listItem.daftarListItem[i].ambilDeskripsiItem();
                    System.out.println(deskripsi);
                }
        } 
        return deskripsi;
    }
}

                    