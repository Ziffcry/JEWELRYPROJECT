import java.util.Scanner;

public class App { 
    static LinkedList metalList = new LinkedList();
    static LinkedList jewelList = new LinkedList();
    static MetalDealer dealer = new MetalDealer("ahmad123", "ahmad");
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       Metal m1 = new Metal("gold" , 331.0);
       Metal m2 = new Metal("silver" , 250.0);
   
       dealer.addMetal(m1, metalList);
       dealer.addMetal(m2, metalList);

       //dealer.displayMetalList(metalList);

       dealer.removeMetal("silver", metalList);
       dealer.displayMetalList(metalList);
      
       JewelryItem j1 = new JewelryItem("rantaiEmas" , "gold" , 100.0);
       JewelryItem j2 = new JewelryItem("cincinEmas" , "gold" , 150.0);
       JewelryItem j3 = new JewelryItem("gelangEmas" , "gold" , 90.0);

       jewelList.insertAtBack(j1);
       jewelList.insertAtBack(j2);
       jewelList.insertAtBack(j3);

       JewelryItem dummy = new JewelryItem();
       //dummy.updateJLL(metalList, jewelList);
      // dummy.displayJewelList(jewelList);

       // dummy.updateJewelList(metalList, jewelList);
       // dummy.displayJewelList(jewelList);

       dummy.updateJewelList2(metalList, jewelList);
      dummy.displayJewelList(jewelList);

      System.out.println("test searching");
      dummy.searchItem("cincinEmas", jewelList);
    }
}
