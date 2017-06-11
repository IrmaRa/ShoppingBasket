package items;

public class Wine extends Item implements Drinkable{
  public Wine(String name, int price, boolean twoForOne) {
    super(name, price, twoForOne);
  }
  public String drink() {
    return "Getting drunk";
  }

}