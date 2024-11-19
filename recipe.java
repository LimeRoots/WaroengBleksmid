package WaroengBleksmid;
    public class recipe {
        private String nama;
        private String[] material;
        private int[] kuantitas;
        public recipe(String nama, String[] material, int[] kuantitas){
            this.nama = nama;
            this.material =material;
            this.kuantitas = kuantitas;
    }
        public String ambilNamaResep(){
            return nama;
        }
        public String[] ambilMaterialResep(){
            return material;
        }
        public int[] ambilKuantitasMaterialResep(){
            return kuantitas;
        }
}


                    