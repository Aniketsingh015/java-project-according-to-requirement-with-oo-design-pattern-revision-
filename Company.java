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

    public List<Item> getItems(){
        return this.items;
    }
    public void addItem(Item item){
        this.items.add(item);
    }

// constructor for company 
    public Company(){
        
        this.items=new ArrayList<Item>();
    }
}