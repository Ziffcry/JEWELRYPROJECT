public class Ring extends JewelryItem {
    private boolean engraving;
    private int size;
    private String gemstone;

    public Ring (){
        super();
        this.engraving = false;
        this.size = 0;
        this.gemstone = "unassigned";
    }

    public Ring(String itemName, String metalName , double wcost,boolean engraving, int size , String gemstone){
        super( itemName, metalName , wcost);
        this.engraving =  engraving;
        this.size = size;
        this.gemstone = gemstone;
    }

    public int getSize(){
        return size;
    }

    public boolean getEngraving (){
        return engraving;
    }

    public String getGemstone(){
        return gemstone;
    }

   @Override
   public double calcTotalPrice(LinkedList metalList){
       double gemCharge = 0.0 , engravingCharge = 0.0;
       super.calcTotalPrice(metalList);
       if(gemstone.equalsIgnoreCase("zamrud")){
          gemCharge = 50.0;
       }
       // wak hok lain plop
       if(engraving){
         engravingCharge = 20.0;       
       }

       totalPrice += gemCharge + engravingCharge;
       return  totalPrice;
   }

   @Override
   public String toString(){
      super.toString();
      return size + gemstone + engraving;  // wak come
   }
}
