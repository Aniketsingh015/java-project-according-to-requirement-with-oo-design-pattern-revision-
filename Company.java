import java.util.*;
class Company{
    private String name;

    private List<Item>items;



// getter and setters for the company 
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

// getter and setter for item

    public List getItems(){
        return this.items;
    }
    public void addItem(Item item){
        this.addItem(item);
    }

// constructor for company 
    public Company(String name){
        this.name=name;
        this.items=new ArrayList<Item>();
    }
}