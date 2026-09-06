public class Order {
    private int orderId;
    private Customer customer;

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
