import java.util.*;
public class Order {
    private int orderId;
    private Customer customer;//has -a relationship with backward linking of customer as 1 to many with unidirectional
    private List<OrderItem>orderItem;

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

    public List<OrderItem> getOrderItems(){
        return this.orderItem;
    }
    public void addOrderItem(OrderItem orderItem){
        this.orderItem.add(orderItem);
    }

    public Order(){
        this.orderItem=new ArrayList<OrderItem>();
    }
}
