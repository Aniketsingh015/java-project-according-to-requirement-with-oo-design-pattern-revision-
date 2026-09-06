import java.util.*;
public class Customer {
    private String custName;
    private int custId;

    private List<Order> orders;


    // gtter and setters for custId
    public int getCustId(){
        return this.custId;
    }
    public void setCustId(int custId){
        this.custId=custId;
    }

    // getter and setter for name
    public String getCustName(){
        return this.custName;
    }
    public void setCustName(String custName){
        this.custName=custName;
    }

    public List getOrders(){
        return this.orders;
    }
    public void addOrder(Order order){
        this.orders.add(order);
    }

    // constructor for customer
    public Customer(){
        this.orders=new ArrayList<Order>();
    }
}
