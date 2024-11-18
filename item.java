package WaroengBleksmid;
    public class item{
        private String nama,deskripsi;
        private int hargaJual,jumlah;
        public item(String nama,int hargaJual,String deskripsi,int jumlah){
            this.nama =nama;
            this.hargaJual=hargaJual; 
            this.deskripsi = deskripsi;
            this.jumlah = jumlah;
        }
        public String ambilNama(){
            return nama;
        }
        public int ambilHargaJual(){
            return hargaJual;
        }
        public String ambilDeskripsi(){
            return deskripsi;
        }
        public int ambilJumlah(){
            return jumlah;
        }
        public void tambahJumlahItem(int jumlah){
            this.jumlah = jumlah;

        }
}



                    