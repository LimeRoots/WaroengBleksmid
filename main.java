package WaroengBleksmid;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        String title = """
        ================================================================================
                                   Blacksmith: The Last Forge
        ================================================================================
        """;

        String story = """
        ================================================================================
                                       Pendahuluan
        ================================================================================
        Di dunia Valdiria, para blacksmith memiliki peran penting dalam sejarah 
        peradaban. Tidak hanya sebagai pengrajin senjata dan alat, mereka adalah 
        pelindung tradisi dan rahasia kuno yang diwariskan dari generasi ke 
        generasi. Salah satu keluarga yang terkenal dalam tradisi blacksmith 
        adalah keluarga Valenforge, yang telah memegang kendali atas Forge of 
        the Ancients, sebuah bengkel legendaris yang terletak di kaki gunung 
        Ironcrest.

        Ayahmu, Aldrin Valenforge, adalah salah satu blacksmith terbesar di 
        tanah Valdiria. Karya-karya besinya tidak hanya terkenal karena 
        kualitasnya, tetapi juga karena kemampuannya untuk menyalurkan kekuatan 
        magis yang ada dalam logam. Selama bertahun-tahun, ia telah menempa 
        senjata-senjata legendaris untuk para pejuang dan pelindung dunia. 
        Namun, seiring berjalannya waktu, penyakit misterius mulai merenggut 
        kekuatannya. Ketika saatnya tiba, ayahmu tak mampu lagi melanjutkan 
        warisan yang telah diwariskan kepadamu.

        ================================================================================
                                       Cerita Utama
        ================================================================================
        Kamu, Aric Valenforge, adalah putra tunggal Aldrin yang dipersiapkan 
        untuk melanjutkan tradisi keluarga. Sejak kecil, kamu telah dilatih di 
        Forge of the Ancients untuk menempa senjata dan mempelajari rahasia 
        kuno ayahmu. Namun, setelah penyakit menggerogoti tubuh ayahmu, ia 
        merasa dirinya tidak lagi mampu untuk menjaga api abadi yang memberi 
        kekuatan pada Forge.

        Di penghujung hidupnya, ia memberikan kepada kamu Firestone, sebuah 
        batu sakral yang mengandung kekuatan legendaris, dan berpesan,
        "Jaga Forge ini, dan wariskanlah kepadamu dunia yang lebih baik."

        Aldrin meninggal tanpa sempat mengajarkan segalanya yang ia ketahui. 
        Sekarang, di usia yang muda, kamu harus mengambil alih Forge of the 
        Ancients yang terancam kehilangan kekuatannya. Dunia sedang menghadapi 
        kerusakan besar, dan kamu harus menempa senjata-senjata yang akan 
        melawan ancaman yang datang.
        ================================================================================
        """;

        System.out.println(title);
        System.out.println(story);

        
        mainMenu mainMenu = new mainMenu();
        
        System.out.println("");
        System.out.println("Blacksmith: The Last Forge ");
        System.out.println("Selamat datang Aric Valenforge");
        mainMenu.menuAwal();
    }
}



                    