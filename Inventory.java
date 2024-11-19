package WaroengBleksmid;
    public class Inventory {
        public item [] daftarSenjata;
        public listMaterial listMaterial;
        public listTipeItem listTipeItem;
        public Inventory(){
            listMaterial = new listMaterial();
            listTipeItem = new listTipeItem();
        }
        public void tambahItemMaterial(String nama,int jumlah){
            daftarMaterial tambah = new daftarMaterial(nama,0,jumlah);
            for (daftarMaterial a : listMaterial.daftarListMaterial){
                if (a.ambilNamaMaterial().equals(tambah.ambilNamaMaterial())){
                     a.tambahJumlahMaterial (tambah.ambilJumlahMaterial());
                }
            }
        }
        public void kurangItemMaterial(String nama, int jumlah){
            daftarMaterial kurang = new daftarMaterial(nama,0,jumlah);
            for (daftarMaterial a : listMaterial.daftarListMaterial){
                if (a.ambilNamaMaterial().equals(kurang.ambilNamaMaterial())){
                     a.kurangJumlahMaterial (kurang.ambilJumlahMaterial());
                }
            } 
        }

        public void lihatInventoryMaterial(){
            System.out.println("Inventory Material Anda: ");
            for(daftarMaterial b:listMaterial.daftarListMaterial){
                if (b.ambilJumlahMaterial() > 0){
                    System.out.println(b.ambilNamaMaterial() + " -Harga Awal: " + b.ambilHargaMaterial() + " Jumlah: "+b.ambilJumlahMaterial());
                }

            }
        }
        public void tambahItemSenjata(String tipe,int jumlah){
            item tambahSenjata = new item(tipe,0,jumlah,"");
            for (item a : listTipeItem.daftarListItem){
                if (a.ambilNamaItem().equals(tambahSenjata.ambilNamaItem())){
                     a.tambahJumlahItem (tambahSenjata.ambilJumlahItem());
                }
            }
        }
        public void kurangItemSenjata(String tipe, int jumlah){
            item kurangSenjata = new item(tipe,0,jumlah,"");
            for (item a : listTipeItem.daftarListItem){
                if (a.ambilNamaItem().equals(kurangSenjata.ambilNamaItem())){
                     a.kurangJumlahItem (kurangSenjata.ambilJumlahItem());
                }
            } 
        }
        public void lihatInventoryItem(){
        System.out.println("Inventory Senjata Anda: ");
        for(item b:listTipeItem.daftarListItem){
            if (b.ambilJumlahItem() > 0){
                System.out.println(b.ambilNamaItem() + " -Harga Awal: " + b.ambilHargaJualItem() + " Jumlah: "+b.ambilJumlahItem());
            }

        }
        }
        public void status(){
            lihatInventoryMaterial();
            lihatInventoryItem();
    }
    
}

                    