package WaroengBleksmid;
import java.util.Random;

public class gathering {
    public daftarMaterial[] semuaBarang;
    private daftarMaterial[] stokMaterial;
    private Random random;
    private listMaterial listMaterial;
    public gathering(){
        stokMaterial = new daftarMaterial[7];
        random = new Random();
        listMaterial = new listMaterial();
        stokUlang();;

    }

    public void stokUlang() {
        for (int i = 0; i < stokMaterial.length; i++) {
            stokMaterial[i] = null;
        }
        int banyakJenisStok = random.nextInt(listMaterial.daftarListMaterial.length-1) + 1;
        int jumlahStok = 0;

        while (jumlahStok < banyakJenisStok) {
            daftarMaterial materialRandom = listMaterial.daftarListMaterial[random.nextInt(listMaterial.daftarListMaterial.length)];
            boolean duplikat = false;
            materialRandom.ambilNamaMaterial();
            for(daftarMaterial a: stokMaterial){
                if(a != null && a.ambilNamaMaterial().equals(materialRandom.ambilNamaMaterial())){
                    duplikat = true;
                    break;
                }
        }
            if(!duplikat){
                stokMaterial[jumlahStok] = materialRandom;
                jumlahStok++;
            }

        }
    }
        public void lihatStok(){
            System.out.println("Hasil eksplorasi anda menemukan setidaknya ada:");
            for (daftarMaterial material : stokMaterial) {
                if (material != null) {
                    System.out.println(material.ambilNamaMaterial() + " - Harga: " + material.ambilHargaMaterial() + " - Banyak Stok: " + material.ambilJumlahMaterial());
                }
            }
        }


    }

