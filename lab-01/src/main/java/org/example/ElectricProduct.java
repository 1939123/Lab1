package org.example;

public class ElectricProduct extends Product{

  private String voltage;

  public ElectricProduct(int id, double price, String name, String voltage){
    super(id, price, name);
    this.voltage = voltage;
  }

  @Override
  public void getSellableStatus(){
    System.out.println("This product is sellable");
}

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

}