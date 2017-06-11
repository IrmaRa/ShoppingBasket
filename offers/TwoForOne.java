package offers;
import basket.*;

public class TwoForOne implements Discountable {

  @Override
  public double calculateDiscount(Basket basket, double currentTotal) {
    if(basket.basketCount() >= 2) {
      double totalAfterDiscount = currentTotal - (basket.getDealItemsTotal() * 0.5);
      return totalAfterDiscount;

    }
    else return currentTotal;
  }
}
