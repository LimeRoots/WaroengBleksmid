package WaroengBleksmid;
    public class daftarMaterial {
        private String nama;
        private int hargaBeli,jumlahMaterial;
        
        public daftarMaterial(String nama,int hargaBeli,int jumlahMaterial){
            this.nama = nama;
            this.hargaBeli = hargaBeli;
            this.jumlahMaterial =jumlahMaterial;
        }
        public String ambilNamaMaterial(){
            return nama;
        }
        public int ambilHargaMaterial(){
            return hargaBeli;
        }
        public int ambilJumlahMaterial(){
            return jumlahMaterial;
        }
        public void jumlahStokRandom(){
            this.jumlahMaterial = (int)(Math.random() * 7) + 2;
        }
        public void tambahJumlahMaterial(int jumlah){
            this.jumlahMaterial = jumlah;

        }
}

                    