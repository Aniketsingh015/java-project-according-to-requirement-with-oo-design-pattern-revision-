public class Item {
    private int itemNo ;
    private String itemName;
    private int itemRate;

    // getter and setter for itemNo

    public void setItemNo(int itemNo){
        this.itemNo=itemNo;
    }
    public int getItemNo(){
        return this.itemNo;
    }

    // getter and setter for itemName

    public void setItemName(String itemName){
        this.itemName=itemName;
    }
    public String getItemName(){
        return this.itemName;
    }

    // getter and setter for rate

    public void setItemRate(int itemRate){
        this.itemRate=itemRate;
    }
    public int getItemRate(){
        return this.itemRate;
    }


    public Item(int itemNo,String itemName,int itemRate){
        this.itemName=itemName;
        this.itemNo=itemNo;
        this.itemRate=itemRate;
    }

}
