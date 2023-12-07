public class Sales {
    private double expense;
    private double revenue;
    //private Date date;
    
   public Sales (){
    this.expense = 0.0;
    this.revenue = 0.0;
    //this.date = new Date();
   }

   public double calcExpense (LinkedList itemBought){
       Object temp = itemBought.getFirst();
       JewelryItem data = (JewelryItem) temp;
       while(temp != null) {
        if(data.getItemCode() == 'R'){
            // klaw ring kne casting balik jdi ring 
            double itemExp = (data.getRate()*data.getTotalPrice()) - data.getTotalPrice();
            expense += itemExp;
        }
        else if(data.getItemCode() == 'N'){
            //klaw necklace casting balik jdi necklace
            double itemExp = (data.getRate()*data.getTotalPrice()) - data.getTotalPrice();
            expense += itemExp;
        }
         temp = itemBought.getNext();
       }
       return expense;
   }

   

   public void SalesReport(){
     // nati sepmu ejas la ui ni
   }


}
