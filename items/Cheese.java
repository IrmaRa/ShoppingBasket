package items;

public class Cheese extends Item implements Edible {
  public Cheese(String name, int price, boolean twoForOne) {
    super(name, price, twoForOne);
  }
  public String eat() {
    return "Getting full";
  }
}