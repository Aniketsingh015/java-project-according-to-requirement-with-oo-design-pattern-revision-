public class Order {
    private int orderId;
    private Customer customer;//has -a relationship with backward linking of customer as 1 to many with unidirectional

    public void setOrderId(int orderId){
        this.orderId=orderId;
    }
    public int getOrderId(){
        return this.orderId;
    }

    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
}
