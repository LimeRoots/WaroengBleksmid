package WaroengBleksmid;
    public class Inventory {
        private item [] daftarSenjata;
        private listMaterial listMaterial;
        private listItem listItem;
        public Inventory(){
            listMaterial = new listMaterial();
            listItem = new listItem();
        }
        public void tambahItemMaterial(String nama,int jumlah){
            daftarMaterial tambah = new daftarMaterial(nama,0,jumlah);
            for (daftarMaterial a : listMaterial.daftarListMaterial){
                if (a.ambilNamaMaterial().equals(tambah.ambilNamaMaterial())){
                     a.tambahJumlahMaterial (a.ambilJumlahMaterial()+tambah.ambilJumlahMaterial());
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
        public void tambahItemSenjata(){

        }

        public void lihatInventorySenjata(){

        }
}


                    