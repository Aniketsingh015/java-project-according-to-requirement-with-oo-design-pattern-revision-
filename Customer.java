import java.util.*;
public class Customer {
    private int custName;
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
    public int getCustName(){
        return this.custName;
    }
    public void setCustName(int custName){
        this.custName=custName;
    }

    public List getOrders(){
        return this.orders;
    }
    public void addOrder(Order order){
        this.addOrder(order);
    }

    // constructor for customer
    public Customer(){
        this.orders=new ArrayList<Order>();
    }
}
