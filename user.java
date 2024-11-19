package WaroengBleksmid;
    public class user{
        private Supplier supplier;
        private Inventory inventory;
        private blacksmith blacksmith;
        public user(){
            this.supplier = new Supplier();
            this.inventory = new Inventory();
            this.blacksmith = new blacksmith();
        }
        public void beliMaterial(){
            
        }
        public void lihatSupply(){
            supplier.lihatStok();
        }
        public void lihatInventoryMaterialUser(){
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Diamond", 10);
            inventory.tambahItemMaterial("Wood", 10);
            inventory.tambahItemMaterial("Copper", 10);
            inventory.tambahItemMaterial("Iron", 10);
            inventory.lihatInventoryMaterial();
        }
        public void lihatInventoryItemUser(){
            inventory.tambahItemSenjata("Copper Dagger", 3);
            inventory.tambahItemSenjata("Copper Mace", 3);
            inventory.tambahItemSenjata("Diamond Crossbow", 3);
            inventory.tambahItemSenjata("Bow", 6);
            inventory.lihatInventoryItem();
        }
        public void buatItem(){
            blacksmith.membuatItem("Copper Dagger",4,this.inventory);
        }



        
            
}


                    