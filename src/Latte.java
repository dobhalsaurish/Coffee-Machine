public class Latte extends Coffee{

    String milkType; // Whole milk, Skimmed milk, Oat milk, Almond milk
    String syrupFlavor; // Vanilla, Caramel, Hazelnut, None

    public Latte(String name,String roast,double price,String milkType,String syrupFlavor){
        super(name,roast,price);
        this.milkType=milkType;
        this.syrupFlavor=syrupFlavor;
    }

    public void printLatteDetails(){
        System.out.println("Your Latte has "+milkType+" milk and "+syrupFlavor+" flavor.");
        System.out.println("Your total bill is "+price+"$.");
    }
}
