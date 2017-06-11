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
  LoyaltyCard loyaltyCard;
  TwoForOne twoForOne;

  @Before
  public void before() {
    basket = new Basket();
    item1 = new Wine("Chardonnay", 18, true);
    item2 = new Cheese("Parmesan", 12, false);
    tenPercentOff = new TenPercentOff();
    loyaltyCard = new LoyaltyCard();
    twoForOne = new TwoForOne();
  }


  @Test
  public void canApplyTenPercentDiscount() {
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(27, basket.applyDiscount(tenPercentOff), 0.1);
  }

  @Test
  public void canApplyLoyaltyCardDiscount() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.addLoyaltyCard();
    assertEquals(29.4, basket.applyDiscount(loyaltyCard), 0.1);
  }

  @Test
  public void canApplyTwoForOneDiscount() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.checkDealItemsTotal();
    assertEquals(18, basket.applyDiscount(twoForOne), 0.1);
  }

  @Test
  public void canNotApplyTwoForOneDiscountIfOneItemIsNotOnOffer() {
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(30, basket.applyDiscount(twoForOne), 0.1);
  }

  @Test
  public void canApplyTwoForOneDiscountOnlyForItemsOnOffer1() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item2);
    basket.checkDealItemsTotal();
    assertEquals(30, basket.applyDiscount(twoForOne), 0.1);
  }

  @Test
  public void canApplyTwoForOneDiscountOnlyForItemsOnOffer2() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item2);
    basket.checkDealItemsTotal();
    assertEquals(48, basket.applyDiscount(twoForOne), 0.1);
  }

}
