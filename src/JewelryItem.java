public class JewelryItem {
    protected String itemName;
    protected char itemCode;
    protected String metalName;
    protected double wageCost; 
    protected double totalPrice;
    final  private double rate ;


    public JewelryItem(){
        this.itemName = "unassigned";
        this.itemCode = 'u';
        this.metalName = "unassigned";
        this.wageCost = 0.0;
        this.totalPrice = 0.0;
        this.rate = 0.05;
    }

    public JewelryItem(String itemName, String metalName , double wcost){
        this.itemName = itemName;
        this.itemCode = 'u';
        this.metalName =  metalName;
        this.wageCost = wcost;
        this.totalPrice = 0.0;
        this.rate = 0.05;
    }
      
    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public char getItemCode(){
        return itemCode;
    }

    public String getMetalName() {
        return metalName;
    }

    public double getWageCost() {
        return wageCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getRate(){
        return rate;
    }

    // Processor methods
    public double calcTotalPrice (LinkedList metalList){
        
        Metal temp = (Metal) metalList.getFirst();
        Metal data = null;
        while (temp != null) {
            if (temp.getMetalName().equalsIgnoreCase(metalName)) {
                data =  (Metal) metalList.searchObject(temp);
                break;  
            }
            temp = (Metal) metalList.getNext();   
        }
        totalPrice = wageCost + data.getMetalPrice() + (getRate() * (wageCost + data.getMetalPrice()));
        return totalPrice ;
    }
   
    public void updateJLL(LinkedList metalList, LinkedList jewelList){ 
        LinkedList tempList = new LinkedList();
  
        //  calculating 
        while (!jewelList.isEmpty()) {
            JewelryItem data = (JewelryItem) jewelList.removeAtFront();
            data.calcTotalPrice(metalList);
            tempList.insertAtBack(data);
        }   

        //  restore jewelList
        while (!tempList.isEmpty()) {
           JewelryItem data = (JewelryItem) tempList.removeAtFront();  
           jewelList.insertAtBack(data);
        }
      
    }

    public boolean searchItem(String itemName , LinkedList jewelList){
       Object temp = jewelList.getFirst();
       while (temp!= null) {
          JewelryItem data = (JewelryItem) temp;
          if (data.getItemName().equalsIgnoreCase(itemName)) {
            System.out.println("Found: " + data.toString());
            return true;
          }
         temp = jewelList.getNext(); 
       }

       return false;
           
    }

    // Printer methods
    public String toString(){
        return "Item Name  : " + itemName + "\nMetal : " + metalName + "\nPrice : " + totalPrice;
    }
    
    public void displayJewelList(LinkedList jewelList){
        JewelryItem data = (JewelryItem) jewelList.getFirst();
        while (data != null) {
            System.out.println(data.toString());
        data = (JewelryItem) jewelList.getNext();
        }
    }
}

//test234
