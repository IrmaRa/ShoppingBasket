package basket;
import java.util.ArrayList;
import java.util.Random;
import items.*;

public class Basket {

  private ArrayList<Item> shoppingBasket;

  public Basket() {
    this.shoppingBasket = new ArrayList<Item>();
  }

  public int basketCount() {
    return this.shoppingBasket.size();
  }

  public void addItem(Item item) {
    this.shoppingBasket.add(item);
  }

  public void removeItem(Item item) {
    this.shoppingBasket.remove(item);
  }

  public void removeAll() {
    this.shoppingBasket.clear();
  }

}