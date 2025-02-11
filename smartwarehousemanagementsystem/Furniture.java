package smartwarehousemanagementsystem;

public class Furniture extends WareHouseItem{
    private String material;
    public Furniture(String name, String material){
        super(name);
        this.material=material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture : " + getName() + " Material Used : " + material);
    }
}
