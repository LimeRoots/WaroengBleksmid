package WaroengBleksmid;
public class blacksmith {
    private listTipeItem listItem;
    private recipe[] daftarResep;
    private item[] item;
    private listMaterial listMaterial;
    public blacksmith() {
        daftarResep = new recipe[]{
            new recipe("Copper Dagger",new String []{"Copper","Wood"},new int[]{1,1}),
            new recipe("Iron Dagger", new String[]{"Iron", "Wood"}, new int[]{1, 1}),
            new recipe("Silver Dagger", new String[]{"Silver", "Wood"}, new int[]{1, 1}),
            new recipe("Diamond Dagger", new String[]{"DIamond", "Wood"}, new int[]{1, 1}),
            
            new recipe("Copper Sword", new String[]{"Copper","Wood"}, new int[]{2,1}),
            new recipe("Iron Sword", new String[]{"Iron", "Wood"}, new int[]{2,1}),
            new recipe("Silver Sword", new String[]{"Silver", "Wood"}, new int[]{2,1}),
            new recipe("Diamond Sword", new String[]{"DIamond", "Wood"}, new int[]{2,1}),
    
            new recipe("Copper Spear", new String[]{"Copper","Wood"}, new int[]{1,3}),
            new recipe("Iron Spear", new String[]{"Iron","Wood"}, new int[]{1,3}),
            new recipe("Silver Spear", new String[]{"Silver","Wood"}, new int[]{1,3}),
            new recipe("Diamond Spear", new String[]{"Diamond","Wood"}, new int[]{1,3}),
    
            new recipe("Copper Axe", new String[]{"Copper","Wood"}, new int[]{3,2}),
            new recipe("Iron Axe", new String[]{"Iron","Wood"}, new int[]{3,2}),
            new recipe("Silver Axe", new String[]{"Silver","Wood"}, new int[]{3,2}),
            new recipe("Diamond Axe", new String[]{"Diamond","Wood"}, new int[]{3,2}),
    
            new recipe("Copper Mace", new String[]{"Copper","Wood"}, new int[]{4,2}),
            new recipe("Iron Mace", new String[]{"Iron","Wood"}, new int[]{4,2}),
            new recipe("Silver Mace", new String[]{"Silver","Wood"}, new int[]{4,2}),
            new recipe("Diamond Mace", new String[]{"Diamond","Wood"}, new int[]{4,2}),
            
            new recipe("Bow", new String[]{"Kayu","String"}, new int[]{3,2}),
            new recipe("Arrow", new String[]{"Kayu","Iron"}, new int[]{1,2}),
    
            new recipe("Copper Crossbow", new String[]{"Copper","String","Kayu"}, new int[]{2,3,4}),
            new recipe("Iron Crossbow", new String[]{"Iron","String","Kayu"}, new int[]{2,3,4}),
            new recipe("Silver Crossbow", new String[]{"Silver","String","Kayu"}, new int[]{2,3,4}),
            new recipe("Diamond Crossbow", new String[]{"Diamond","String","Kayu"}, new int[]{2,3,4}),
    
            new recipe("Staff", new String[]{"Kayu","Crystal"}, new int[]{6,1}),
        };
    }
    public void membuatItem(String namaResep, int jumlah, Inventory inventory) {
        for (recipe resep : daftarResep) {
            if (resep != null && resep.ambilNamaResep().equals(namaResep)) {
                String[] material = resep.ambilMaterialResep();
                int[] kuantitas = resep.ambilKuantitasMaterialResep();
    
                boolean bisaMembuat = true;
                for (int i = 0; i < material.length; i++) {
                    daftarMaterial mat = inventory.listMaterial.cariMaterial(material[i]);
                    if (mat == null || mat.ambilJumlahMaterial() < kuantitas[i] * jumlah) {
                        bisaMembuat = false;
                        break;
                    }
                }
                if (bisaMembuat) {
                    for (int i = 0; i < material.length; i++) {
                        daftarMaterial mat = inventory.listMaterial.cariMaterial(material[i]);
                        if (mat != null) {
                            System.out.println("Reducing " + material[i] + " by " + (kuantitas[i] * jumlah));
                            inventory.kurangItemMaterial(material[i], kuantitas[i] * jumlah);
                        }
                    }
                    System.out.println("Adding " + jumlah + " of " + namaResep + " to inventory.");
                    inventory.tambahItemSenjata(namaResep, jumlah);
                    System.out.println(namaResep + " Berhasil dibuat");
                } else {
                    System.out.println("Material Anda Tidak Cukup Untuk Membuat " + namaResep);
                }
                return; 
            }
        }
        System.out.println("Resep " + namaResep + " Tidak Ditemukan");
    }
}

                    