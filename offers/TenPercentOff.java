package offers;
import basket.*;

public class TenPercentOff implements Discountable {

  @Override
  public double calculateDiscount(Basket basket, double currentTotal) {
    if(currentTotal > 20) {
      double totalAfterDiscount = currentTotal - (currentTotal * 0.1);
      return totalAfterDiscount;

    }
    else return currentTotal;
  }
}