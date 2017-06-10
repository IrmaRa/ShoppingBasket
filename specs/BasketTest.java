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
    item1 = new Wine("Merlot", 17);
    item2 = new Cheese("Taleggio", 8);
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

}