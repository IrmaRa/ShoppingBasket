package offers;
import basket.*;

public interface Discountable {
  public double calculateDiscount(Basket basket, double currentTotal);
}