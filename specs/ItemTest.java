import org.junit.*;
import static org.junit.Assert.assertEquals;
import items.*;


public class ItemTest {

  Wine item1;

  @Before
  public void before() {
    item1 = new Wine("Pinot Grigio", 15, true);
  }

  @Test
  public void itemHasName() {
    assertEquals("Pinot Grigio", item1.getName());
  }

  @Test
  public void itemHasPrice() {
    assertEquals(15, item1.getPrice());
  }

  @Test
  public void itemHasTwoForOneDeal() {
    assertEquals(true, item1.getTwoForOneStatus());
  }

}