import org.junit.*;
import static org.junit.Assert.assertEquals;
import basket.*;
import offers.*;
import items.*;


public class OfferTest {

  Basket basket;
  Wine item1;
  Cheese item2;
  TenPercentOff tenPercentOff;

  @Before
  public void before() {
    basket = new Basket();
    item1 = new Wine("Chardonnay", 18);
    item2 = new Cheese("Parmesan", 12);
    tenPercentOff = new TenPercentOff();

  }

  @Test
  public void canApplyTenPercentDiscount() {
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(27, basket.applyDiscount(tenPercentOff), 0.1);
  }

}
