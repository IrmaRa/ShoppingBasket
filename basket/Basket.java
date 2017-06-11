package basket;
import java.util.ArrayList;
import items.*;
import offers.*;

public class Basket {

  private ArrayList<Item> shoppingBasket;
  private double total;
  private ArrayList<Discountable> offers;
  private boolean loyaltyCard;
  private int dealItemsTotal;


  public Basket() {
    this.shoppingBasket = new ArrayList<Item>();
    this.total = total;
    this.offers = new ArrayList<Discountable>(); 
    this.loyaltyCard = loyaltyCard;
    this.dealItemsTotal = dealItemsTotal;
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
    this.total -= item.getPrice();
  }

  public void removeAll() {
    this.shoppingBasket.clear();
    this.total = 0;
  }

  public double getTotal() {
    return this.total;
  } 

  public boolean getLoyaltyCard() {
    return this.loyaltyCard;
  }

  public void addLoyaltyCard() {
    this.loyaltyCard = true;
  }

  public int getDealItemsTotal() {
    return this.dealItemsTotal;
  }

  public void checkDealItemsTotal() {
    for(Item item : shoppingBasket) {
      if(item.getTwoForOneStatus() == true) {
        this.dealItemsTotal += item.getPrice();
      }
    }
  }

  public double applyDiscount(Discountable discount) {
    return discount.calculateDiscount(this, this.getTotal());
  }

}
