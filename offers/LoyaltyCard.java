package offers;
import basket.*;

public class LoyaltyCard implements Discountable {

  @Override
  public double calculateDiscount(Basket basket, double currentTotal) {
    if(basket.getLoyaltyCard() == true) {
      double totalAfterDiscount = currentTotal - (currentTotal * 0.02);
      return totalAfterDiscount;

    }
    else return currentTotal;
  }
}