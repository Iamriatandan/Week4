package smartwarehousemanagementsystem;

public class Groceries extends WareHouseItem{
    private String expiryDate ;

    public Groceries(String name, String expiryDate){
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries : " + getName() + "Expiry Date : " + expiryDate);
    }
}
