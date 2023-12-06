public class Metal {
    private String metalName;
    private double metalPrice;

    public Metal(){
        this.metalName ="unassigned";
        this.metalPrice = 0.0;
    }

    public Metal(String n, double p){
        this.metalName = n;
        this.metalPrice = p;
    }

    public void setMetalName(String n){
         this.metalName = n;
    }

    public void setMetalPrice(double p){
         this.metalPrice = p;
    }

     public String getMetalName(){
         return this.metalName ;
    }

    public double getMetalPrice(){
        return  this.metalPrice ;
    }

    public String toString(){
        return "The name of the metal is: "+ getMetalName() +" and its price is RM"+ getMetalPrice();
    }
}
