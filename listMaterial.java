package WaroengBleksmid;

    public class listMaterial {
        public Material[] daftarListMaterial;
        
        public listMaterial(){
            this.daftarListMaterial = new Material[]{
                new Material("Wood", 1,0),
                new Material("Copper", 3,0),
                new Material("Iron", 5,0),
                new Material("Silver", 6,0),
                new Material("Diamond", 8,0),
                new Material("String",1,0),
                new Material("Crystal",15,0)
            };
        }
        
        public Material cariMaterial(String materialName) {
            for (Material material : daftarListMaterial) {
                if (material.ambilNamaMaterial().equalsIgnoreCase(materialName)) {
                    return material; 
                }
            }
            
            return null; 
        }
    }


                    