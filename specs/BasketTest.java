import org.junit.*;
import static org.junit.Assert.assertEquals;
import items.*;
import basket.*;


public class BasketTest {

  Basket basket;
  Wine item1;
  Cheese item2;

  @Before
  public void before() {
    basket = new Basket();
    item1 = new Wine("Merlot", 17, true);
    item2 = new Cheese("Taleggio", 8, false);
  }

  @Test
  public void canCountItemsInBasket() {
    assertEquals(0, basket.basketCount());
  }

  @Test
  public void canAddItemToBasket() {
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(2, basket.basketCount());
  }

  @Test
  public void canRemoveItemFromBasket() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.removeItem(item1);
    assertEquals(1, basket.basketCount());
  }

  @Test
  public void canRemoveAllItemsFromBasket() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.removeAll();
    assertEquals(0, basket.basketCount());
  }

  @Test
  public void canGetDealItemsTotalOneItemOnOffer() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.checkDealItemsTotal();
    assertEquals(17, basket.getDealItemsTotal());
  }

  @Test
  public void canGetDealItemsTotalBothItemsOnOffer() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.checkDealItemsTotal();
    assertEquals(34, basket.getDealItemsTotal());
  }

}