public class Coffee {

    String name;
    String roast;
    int caffineLevelInMg;
    double price;

    public Coffee(String name, String roast, double price){
        this.name=name;
        this.roast=roast;
        this.price=price;

        setCaffineLevel();
    }

    public void setCaffineLevel(){
        if(roast.equalsIgnoreCase("light")){
            caffineLevelInMg=50;
        }else if(roast.equalsIgnoreCase("medium")){
            caffineLevelInMg=100;
        }else if(roast.equalsIgnoreCase("dark")){
            caffineLevelInMg=150;
        }else{
            caffineLevelInMg=0;
        }
    }

    public void grindBeans(){
        System.out.println("Grinding beans for "+name+"...");
    }

    public void brewCoffee(){
        System.out.println("Brewing your favoirte "+name+"...");
    }

    public void coffeeInfo(){
        System.out.println("You ordered a "+name+" with a "+roast+" roast.");
        System.out.println("The caffenine level in your coffee is "+caffineLevelInMg);
    }

}
