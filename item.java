package WaroengBleksmid;
    public class item{
        private String nama,deskripsi;
        private int hargaJual,jumlah,statusLevel,exp;
        
        public item(String nama,int hargaJual,int jumlah,int exp,String deskripsi){
            this.nama =nama;
            this.hargaJual=hargaJual; 
            this.jumlah = jumlah;
            this.deskripsi = deskripsi;
            this.exp = exp;
        }
        
        public String ambilNamaItem(){
            return nama;
        }
        
        public int ambilHargaJualItem(){
            return hargaJual;
        }
        
        public String ambilDeskripsiItem(){
            return deskripsi;
        }
        
        public int ambilJumlahItem(){
            return jumlah;
        }
        
        public int ambilExp(){
            return exp;
        }
        
        public void tambahJumlahItem(int jumlah){
            this.jumlah += jumlah;

        }
        
        public void kurangJumlahItem(int jumlah){
            this.jumlah -= jumlah;
        }
        
        public void ubahHargaJualItem(int jumlah){
            this.hargaJual = jumlah;
        }
}



                    