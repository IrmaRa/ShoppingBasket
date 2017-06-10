package items;
import interfaces.*;

public class Cheese extends Item implements Edible {
  public Cheese(String name, int price) {
    super(name, price);
  }
  public String eat() {
    return "Getting full";
  }
}