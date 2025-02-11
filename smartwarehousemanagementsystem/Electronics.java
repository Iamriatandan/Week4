package smartwarehousemanagementsystem;

 class Electronics extends WareHouseItem {
private int warrantyPeriod;
public Electronics(String name, int warrantyPeriod){
    super(name);
    this.warrantyPeriod = warrantyPeriod;
}

@Override
     public void displayDetails(){
    System.out.println("Electronics : " + getName() + "Warranty : " + warrantyPeriod + "months.");
}
}
