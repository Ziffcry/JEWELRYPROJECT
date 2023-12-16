public class Sales {
    private double expense;
    private double revenue;
    
   public Sales (){
    this.expense = 0.0;
    this.revenue = 0.0;  
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
   
   public double calcRevenue(LinkedList itemBought){
     double sum = 0.0;
     Object temp = itemBought.getFirst();
     JewelryItem data = (JewelryItem) temp;
       while(temp != null) {
        if(data.getItemCode() == 'R'){
            // klaw ring kne casting balik jdi ring 
            double itemExp = (data.getRate()*data.getTotalPrice()) ;
            sum  += itemExp;
        }
        else if(data.getItemCode() == 'N'){
            //klaw necklace casting balik jdi necklace
            double itemExp = (data.getRate()*data.getTotalPrice()) ;
           sum  += itemExp;
        }
         temp = itemBought.getNext();
       }

       revenue = sum - expense;
    return revenue;
   }


   

   public void SalesReport(){
     
   }


}
