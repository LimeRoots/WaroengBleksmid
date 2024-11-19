package WaroengBleksmid;
import java.util.Random;

public class Supplier {
    public daftarMaterial[] semuaMaterial;
    private daftarMaterial[] stokMaterial;
    private listMaterial listMaterial;
    private Random random;
        public Supplier() {
            listMaterial = new listMaterial();
            stokMaterial = new daftarMaterial[7];
            random = new Random();
            stokUlang();
        }
    
        public void stokUlang() {
            for (int i = 0; i < stokMaterial.length; i++) {
                stokMaterial[i] = null;
            }
            int banyakJenisStok = random.nextInt(listMaterial.daftarListMaterial.length - 1) + 2;
            int jumlahStok = 0;
    
            while (jumlahStok < banyakJenisStok) {
                daftarMaterial materialRandom = listMaterial.daftarListMaterial[random.nextInt(listMaterial.daftarListMaterial.length)];
                boolean adaDuplikat = false;
                materialRandom.jumlahStokRandom();
                for (daftarMaterial a : stokMaterial) {
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
            for (daftarMaterial material : stokMaterial) {
                if (material != null) {
                    System.out.println(material.ambilNamaMaterial() + " - Harga: " + material.ambilHargaMaterial() + " - Banyak Stok: " + material.ambilJumlahMaterial());
                }
            }
        }
        public void beliStok(String nama, int jumlah, Inventory inventory, user user) {
            for (daftarMaterial material : stokMaterial) {
                if (material != null && material.ambilNamaMaterial().equals(nama)) {
                    int totalHarga = material.ambilHargaMaterial() * jumlah; 
                    if (material.ambilJumlahMaterial() >= jumlah) {
                        if (user.punyaCukupDuit(totalHarga)) { 
                            material.kurangJumlahMaterial(jumlah);
                            inventory.tambahItemMaterial(nama, jumlah);
                            user.kurangUang(totalHarga); 
                            System.out.println("Berhasil membeli " + jumlah + " dari " + nama);
                            System.out.println("Sisa uang Anda: " + user.lihatUang());
                        } else {
                            System.out.println("Uang Anda tidak cukup untuk membeli " + jumlah + " dari " + nama + ". Sisa uang: " + user.lihatUang());
                        }
                    } else {
                        System.out.println("Stok tidak cukup untuk " + nama + ". Hanya ada " + material.ambilJumlahMaterial() + " tersisa.");
                    }
                    return;
                }
            }
            System.out.println("Material " + nama + " tidak ditemukan.");
        }
    }