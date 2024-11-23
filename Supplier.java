package WaroengBleksmid;

public class Supplier {
    private Material[] stokMaterial;
    private listMaterial listMaterial;
    
    public Supplier() {
            listMaterial = new listMaterial();
            stokMaterial = new Material[7];
        }
    
    public void stokUlang() {
        for (int i = 0; i < stokMaterial.length; i++) {
            stokMaterial[i] = null;
        }
        int banyakJenisStok = (int)(Math.random() * (listMaterial.daftarListMaterial.length - 2) + 2);
        int jumlahStok = 0;
    
        while (jumlahStok < banyakJenisStok) {
            Material materialRandom = listMaterial.daftarListMaterial[(int)(Math.random() * (listMaterial.daftarListMaterial.length))];
            boolean adaDuplikat = false;
            materialRandom.jumlahStokRandom();
            for (Material a : stokMaterial) {
                if (a != null && a.ambilNamaMaterial().equals(materialRandom.ambilNamaMaterial())) {
                    adaDuplikat = true;
                    break;
                }
            }
    
            if (!adaDuplikat) {
                stokMaterial[jumlahStok] = materialRandom;
                jumlahStok++;
            }
    
        }
    }
    
    public void lihatStok() {
        System.out.println("Stok Supplier Saat Ini:");
        for (Material material : stokMaterial) {
            if (material != null) {
                System.out.println(material.ambilNamaMaterial() + " - Harga: " + material.ambilHargaMaterial() + " - Banyak Stok: " + material.ambilJumlahMaterial());
            }
        }
    }
        
    public void beliStok(String nama, int jumlah, Inventory inventory, user user) {
        for (Material material : stokMaterial) {
            if (material != null && material.ambilNamaMaterial().equals(nama)) {
                int totalHarga = material.ambilHargaMaterial() * jumlah; 
                if (material.ambilJumlahMaterial() >= jumlah) {
                    if (user.punyaCukupDuit(totalHarga)) { 
                        material.kurangJumlahMaterial(jumlah);
                        inventory.tambahItemMaterial(nama, jumlah);
                        user.kurangUang(totalHarga); 
                        System.out.println("Berhasil membeli " + jumlah + " dari " + nama);
                        System.out.println("Sisa uang Anda: " + user.lihatUang());
                    }
                    
                    else {
                        System.out.println("Uang Anda tidak cukup untuk membeli " + jumlah + " dari " + nama + ". Sisa uang: " + user.lihatUang());
                    }
                } 
                    
                else {
                    System.out.println("Stok tidak cukup untuk " + nama + ". Hanya ada " + material.ambilJumlahMaterial() + " tersisa.");
                }
                return;
            }
        }
        System.out.println("Material " + nama + " tidak ditemukan.");
    }
}