package basket;
import java.util.ArrayList;
import items.*;
import offers.*;

public class Basket {

  private ArrayList<Item> shoppingBasket;
  private double total;
  private ArrayList<Discountable> offers;


  public Basket() {
    this.shoppingBasket = new ArrayList<Item>();
    this.total = total;
    this.offers = new ArrayList<Discountable>();

  }

  public int basketCount() {
    return this.shoppingBasket.size();
  }

  public void addItem(Item item) {
    this.shoppingBasket.add(item);
    this.total += item.getPrice();
  }

  public void removeItem(Item item) {
    this.shoppingBasket.remove(item);
  }

  public void removeAll() {
    this.shoppingBasket.clear();
  }

  public double getTotal() {
    return this.total;
  }

  public double applyDiscount(Discountable discount) {
    return discount.calculateDiscount(this, this.getTotal());
    } 
  }

