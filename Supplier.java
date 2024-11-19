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
    }