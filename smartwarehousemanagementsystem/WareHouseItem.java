package smartwarehousemanagementsystem;

abstract class WareHouseItem {
    String name;
    public WareHouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //abstract method to display details
    public abstract void displayDetails();
}
