public class MetalDealer{
    private String dealerId;
    private String dealerName;
    //private Date date;

    public MetalDealer(String dealerId, String dealerName){
        this.dealerId = dealerId;
        this.dealerName = dealerName;
    }
    
    public String getDealerID(){
       return dealerId;
    }

    public String getDealerName(){
       return dealerName;
    }
   
    // Processor methods
    public LinkedList addMetal(Metal data , LinkedList metalList){     
        metalList.insertAtBack(data);
        return metalList;
    }


    public LinkedList removeMetal(String name,LinkedList metalList){
       Metal data = (Metal) metalList.getFirst();
       while (data  != null) {
          if(data.getMetalName().equalsIgnoreCase(name)){
               metalList.removeData(data);
               break;
            }
        data = (Metal) metalList.getNext();
       }
      return metalList;
    }


    public void updatePrice (String name , double newPrice, LinkedList metalList){
       Metal data = (Metal) metalList.getFirst();
       while (data  != null) {
          if(data.getMetalName().equalsIgnoreCase(name)){
             data.setMetalPrice(newPrice);
             break;               
         }
        data = (Metal) metalList.getNext();
       }
    }

    // Printer methods
    public void displayMetalList(LinkedList metalList){
        Metal data = (Metal) metalList.getFirst();
        while (data != null) {
            System.out.println(data.toString());
        data = (Metal) metalList.getNext();
        }
    }




}


