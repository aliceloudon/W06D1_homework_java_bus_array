import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus (11, "Ocean Terminal");
    person = new Person();
  }

  @Test
  public void hasNumber() {
    assertEquals( 11, bus.getNumber() );
  }

  @Test
  public void hasFinalStop() {
    assertEquals( "Ocean Terminal", bus.getFinalStop() );
  }

  @Test
  public void busStartsEmpty() {
    assertEquals( 0, bus.passengerCount() );
  }

}