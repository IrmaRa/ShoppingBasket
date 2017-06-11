package items;

public abstract class Item {
  private String name;
  private int price;
  private boolean twoForOne;

  public Item(String name, int price, boolean twoForOne) {
  this.name = name;
  this.price = price;
  this.twoForOne = twoForOne;
  } 

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean getTwoForOneStatus() {
    return this.twoForOne;
  }

}