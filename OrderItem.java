public class OrderItem {
    private int quantity;
    private Order order;


     private Item item;//has a relation 1-1 unidirectional

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public Item getItem(){
        return this.item;
    }
    public void setItem(Item item){
        this.item=item;
    }

    public void setOrder(Order order){
        this.order=order;
    }
    public Order getOrder(){
        return this.order;
    }

}
