package WaroengBleksmid;
    public class toko{
        private int level ;
        private int expSekarang;
        private int expNaikLevel;
        private int qwer;

        public toko(){
            this.level = 3;
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
        
        public void status(){
            System.out.println("Uang toko\t:\t"+ this.qwer);
            System.out.println("Level toko\t:\t"+ this.level);
        }
        
        public int ambilLevelToko(){
            return this.level;
        }
}



                    