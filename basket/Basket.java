package basket;
import java.util.ArrayList;
import java.util.Random;
import items.*;

public class Basket {

  private ArrayList<Item> items;

  public Basket() {
    this.items = new ArrayList<Item>();
  }

  public int basketCount() {
    return this.items.size();
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

}