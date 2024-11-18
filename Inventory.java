package WaroengBleksmid;
public class Inventory {
    private item [] daftarSenjata;
    private listMaterial listMaterial;
    private listTipeItem listTipeItem;
    public Inventory(){
        listMaterial = new listMaterial();
        listTipeItem = new listTipeItem();
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
    public void tambahItemSenjata(String tipe,String material,int jumlah){
        item tambahSenjata = new item((material +" "+ tipe),0,jumlah,"");
        if(material.equals("")){
            tambahSenjata = new item(tipe,0,jumlah,"");
        }
        for (item a : listTipeItem.daftarListItem){
            if (a.ambilNamaItem().equals(tambahSenjata.ambilNamaItem())){
                a.tambahJumlahItem (a.ambilJumlahItem()+tambahSenjata.ambilJumlahItem());
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
}