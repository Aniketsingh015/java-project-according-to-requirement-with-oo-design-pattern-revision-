import java.util.*;
class Company{
    private String name;

    private List<Item>items;
    private List<Customer>customers;



// getter and setters for the company 
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

// getter and setter for item

    public List<Item> getItems(){
        return this.items;
    }
    public void addItem(Item item){
        this.items.add(item);
    }

     public List<Customer> getCustomer(){
        return this.customers;
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

// constructor for company 
    public Company(){
        
        this.items=new ArrayList<Item>();
    }
}