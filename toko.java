package WaroengBleksmid;
    public class toko{
        private int level;
        private int expSekarang;
        private int expNaikLevel;

        public void toko(){
            this.level = 1;
            this.expSekarang = 0;
            this.expNaikLevel = 100;
        }

        private void naikLevel(){
            level++;
            expSekarang -= expNaikLevel;
            expNaikLevel *= level;
            System.out.println("Selamat Anda Naik Level!!!!!!!!!!!!!!");
        }

        private int expPerNaikLevel(){
            return (int) (expNaikLevel * 2);
        }

        private void daftarJualan(){
            
        }
}


                    