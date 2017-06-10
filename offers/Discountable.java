package offers;
import basket.*;
import items.*;

public interface Discountable {
  public double calculateDiscount(Basket basket, double currentTotal);
}