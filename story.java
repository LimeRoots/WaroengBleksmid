package WaroengBleksmid;
import java.util.Scanner;

public class story {
    Scanner input = new Scanner(System.in);
    public void gameStory(){
        printIntroduction();
        printMainStory();
    }

    public void skipStory(){
        System.out.println("Apakah anda mau lihat story? (y/t)");
        String konfirmasi = input.next();
        if (konfirmasi.equalsIgnoreCase("y")){
            gameStory();
        }
        else{
            System.out.println("Story di skip");
        }
    }
    public static void printIntroduction() {
        System.out.println("Di dunia Valdiria, para blacksmith adalah penjaga rahasia kuno yang diwariskan dari generasi ke generasi.");
        System.out.println("Salah satu keluarga paling terkenal adalah keluarga Valenforge, pemilik Forge of the Ancients,");
        System.out.println("sebuah bengkel legendaris yang dapat menempa senjata dengan kekuatan magis.");
        System.out.println();
        System.out.println("Ayahmu, Aldrin Valenforge, adalah seorang blacksmith hebat yang dihormati di seluruh penjuru negeri.");
        System.out.println("Namun, penyakit misterius mulai merenggut kekuatannya, dan Forge mulai kehilangan api abadi yang menjadi sumber kekuatannya.");
        System.out.println("Di penghujung hidupnya, Aldrin memberimu Firestone, sebuah batu sakral dengan kekuatan luar biasa.");
        System.out.println("\"Jaga Forge ini,\" katanya, dengan suara lemah. \"Wariskanlah dunia yang lebih baik.\"");
        System.out.println();
        System.out.println("Kini, beban warisan keluarga ada di pundakmu.");
        System.out.println("Sebagai Aric Valenforge, kamu harus menghidupkan kembali Forge of the Ancients,");
        System.out.println("menempa senjata-senjata legendaris, dan menghadapi ancaman gelap yang mengintai Valdiria.");
        System.out.println();
        System.out.println("Perjalananmu sebagai pewaris terakhir Forge of the Ancients baru saja dimulai...");
    }
    public static void printMainStory() {
        System.out.println("Babak Utama: Menghidupkan Forge dan Melawan Kegelapan");
        System.out.println();
        System.out.println("Setelah kepergian ayahmu, Forge of the Ancients mulai kehilangan kekuatannya.");
        System.out.println("Api abadi yang menjadi sumber tenaga Forge hampir padam, dan kamu tidak tahu cara untuk menghidupkannya kembali.");
        System.out.println("Namun, dalam catatan kuno ayahmu, terdapat petunjuk tentang tiga bahan legendaris yang dapat menghidupkan kembali api itu:");
        System.out.println("- Heart of a Fallen Star: Sebuah batu jatuh dari langit yang mengandung energi kosmik.");
        System.out.println("- Bloodsteel Ore: Logam merah tua yang ditemukan di reruntuhan kuno, dijaga oleh roh-roh penjaga.");
        System.out.println("- Dragonbone Ember: Sisa bara dari tulang naga yang pernah menghancurkan tanah ini.");
        System.out.println();
        System.out.println("Dengan bantuan Firestone, kamu memulai perjalananmu ke berbagai penjuru Valdiria.");
        System.out.println("Kamu menjelajah pegunungan, hutan magis, dan reruntuhan berbahaya untuk mengumpulkan bahan-bahan tersebut.");
        System.out.println();
        System.out.println("Namun, perjalananmu tidak mudah. Para prajurit dari Kerajaan Drakmor, yang dipimpin oleh Raja Zaroth,");
        System.out.println("juga menginginkan kekuatan Forge untuk tujuan jahat mereka. Kamu harus melawan mereka sambil mencari sekutu,");
        System.out.println("seperti para penyihir, petualang, dan penjaga kuno yang masih setia pada tradisi Forge.");
        System.out.println();
        System.out.println("Ketika semua bahan telah terkumpul, kamu harus menghadapi ujian terakhir di Forge of the Ancients.");
        System.out.println("Di sana, kamu akan menempa senjata legendaris, namun juga menghadapi kegelapan dalam dirimu sendiri,");
        System.out.println("sebuah kutukan yang tersembunyi dalam Firestone.");
        System.out.println();
        System.out.println("Akankah kamu berhasil menempa senjata terakhir dan menghentikan Raja Zaroth?");
        System.out.println("Atau, akankah Forge jatuh ke dalam kegelapan untuk selamanya?");
        System.out.println();
    }
}
