package WaroengBleksmid;
    public class main{
        public static void main(String[] args) {
            story story = new story();
            mainMenu mainMenu = new mainMenu();
            System.out.println("Blacksmith: The last forge");
            story.skipStory();
            mainMenu.tampilanAwal();
            mainMenu.masukan();
        }
          
}


                    