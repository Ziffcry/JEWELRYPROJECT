public class JewelryItem {
    private String itemName;
    private String metalName;
    private double wageCost;
    private double totalPrice;


    public JewelryItem(String itemName, String metalName , double wcost){
        this.itemName = itemName;
        this.metalName =  metalName;
        this.wageCost = wcost;
        this.totalPrice = 0.0;
    }

    public JewelryItem(){
        this.itemName = "unassigned";
        this.metalName = "unassigned";
        this.wageCost = 0.0;
        this.totalPrice = 0.0;
    }
    

    // Setter methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public void setWageCost(double wageCost) {
        this.wageCost = wageCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
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
        totalPrice = wageCost + data.getMetalPrice();
        return totalPrice ;
    }
   
    // option 1
    public void updateJewelList(LinkedList metalList, LinkedList jewelList){ 
        LinkedList dummy = new LinkedList();
        int loop =  dummy.countObject(jewelList);
        Object temp =  jewelList.getFirst();
        for (int i = 0; i < loop; i++){
            JewelryItem data = (JewelryItem) temp;
            data.calcTotalPrice(metalList);
            jewelList.removeAtFront();
            jewelList.insertAtBack(temp); 
            temp = jewelList.getNext();
        }
    }
   
    // option 2
    public LinkedList updateJewelList2(LinkedList metalList, LinkedList jewelList){ 
        LinkedList dummy = new LinkedList();
        int loop =  dummy.countObject(jewelList);
        Object temp =  jewelList.getFirst();
        for (int i = 0; i < loop; i++){
            JewelryItem data = (JewelryItem) temp;
            data.calcTotalPrice(metalList);
            jewelList.removeAtFront();
            jewelList.insertAtBack(temp); 
            temp = jewelList.getNext();
        }
        return jewelList;
    }

    // option 3 (maybe this is most suitable)
    public LinkedList updateJLL(LinkedList metalList, LinkedList jewelList){ 
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
        return jewelList;
    }

    public void searchItem(String itemName , LinkedList jewelList){
       Object temp = jewelList.getFirst();
       while (temp!= null) {
          JewelryItem data = (JewelryItem) temp;
          if (data.getItemName().equalsIgnoreCase(itemName)) {
            System.out.println("Found: " + data.toString());
            break;
          }
         temp = jewelList.getNext(); 
       }
           
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
