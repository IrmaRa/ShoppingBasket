import org.junit.*;
import static org.junit.Assert.assertEquals;
import items.*;


public class ItemTest {

  WhiteWine item1;
  RedWine item2;

  @Before
  public void before() {
    item1 = new WhiteWine("Pinot Grigio", 15);
    item2 = new RedWine("Rioja", 17);
  }

  @Test
  public void itemHasName() {
    assertEquals("Pinot Grigio", item1.getName());
  }

  @Test
  public void itemHasPrice() {
    assertEquals(17, item2.getPrice());
  }
}