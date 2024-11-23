package WaroengBleksmid;
    public class recipe {
        private String nama;
        private String[] material;
        private int[] kuantitas;
        private int statusLevel;
        
        public recipe(String nama, String[] material, int[] kuantitas,int level){
            this.nama = nama;
            this.material =material;
            this.kuantitas = kuantitas;
            this.statusLevel =level;
        }
        
        public String ambilNamaResep(){
            return this.nama;
        }
        
        public String[] ambilMaterialResep(){
            return this.material;
        }
        
        public int[] ambilKuantitasMaterialResep(){
            return this.kuantitas;
        }
        
        public int ambilStatusLevelResep(){
            return this.statusLevel;
        }
}


                    