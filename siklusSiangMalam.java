package WaroengBleksmid;

    public class siklusSiangMalam{
            private int Hari; 
            private int Jam; 
            private int Menit; 
        
            public siklusSiangMalam() {
                this.Hari = 1; 
                this.Jam = 0; 
                this.Menit= 0; 
            }
        
            public void majukanWaktu(int menit) {
                this.Menit += menit;
                while (this.Menit >= 60) {
                    this.Menit -= 60;
                    this.Jam++;
                    if (this.Jam >= 24) {
                        this.Jam = 0;
                        this.Hari++;
                    }
                }
            }
        
            public String lihatWaktuSekarang() {
                String siangMalam;
                if (Jam>=18){
                    siangMalam = "Malam";
                }
                else if (Jam >= 12){
                    siangMalam = "Siang";
                }
                else {
                    siangMalam = "Pagi";
                }
                return String.format("%s: %d, Time: %02d:%02d",siangMalam,Hari, Jam, Menit);
            }
    }
    

        


                    