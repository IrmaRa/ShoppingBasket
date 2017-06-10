import org.junit.*;
import static org.junit.Assert.assertEquals;
import items.*;
import basket.*;


public class BasketTest {

  Basket basket;

  @Before
  public void before() {
    basket = new Basket();
  }

  @Test
  public void canCountItemsInBasket() {
    assertEquals(0, basket.basketCount());
  }

}