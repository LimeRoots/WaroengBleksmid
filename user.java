package WaroengBleksmid;
    public class user{
        private Supplier supplier;
        private Inventory inventory;
        public user(){
            this.supplier = new Supplier();
            this.inventory = new Inventory();
        }
        public void beliMaterial(){
            
        }
        public void lihatSupply(){
            supplier.lihatStok();
        }
        public void lihatInventoryUser(){
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Diamond", 10);
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Copper", 10);
            inventory.tambahItemMaterial("Iron", 10);
            inventory.lihatInventoryMaterial();
        }


        
            
}


                    