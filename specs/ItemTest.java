import org.junit.*;
import static org.junit.Assert.assertEquals;
import items.*;


public class ItemTest {

  WhiteWine item1;

  @Before
  public void before() {
    item1 = new WhiteWine("Pinot Grigio");
  }

  @Test
  public void itemHasName() {
    assertEquals("Pinot Grigio", item1.getName());
  }
}