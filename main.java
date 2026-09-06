public class main {
    public static void main(String[] args) {
        var company=new Company();
        company.setName("Shopper stop");
        System.out.println(company.getName());

        // now company decided to purchase items for the shop
        // shirt,pant,belt,shoes,watches

        var shirt=new Item(1,"Allen Solly",2000);
        var pant =new Item(2,"Levis",30000);
        var shoes=new Item(3,"Gucci",500000);
        var belt=new Item(4,"Coach",240000);

        company.addItem(belt);
        company.addItem(shirt);
        company.addItem(pant);
        company.addItem(shoes);

        for(Item item:company.getItems()){
            System.out.println(item.getItemName()+"-"+item.getItemRate());
        }

// Now a regular customer walks in your shop to buy items from ur shops 
       
        var regularCustomer=new Customer();
        regularCustomer.setCustId(101);
        regularCustomer.setCustName("Aniket");

// // Regular customer wants to buy 2 pants and 4 shirts from stores

    }
}
