import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  BusStop bus_stop;
  // Bus bus;
  Person person;

  @Before
  public void before() {
    bus_stop = new BusStop();
    // bus = new Bus ();
    person = new Person();
  }

  @Test
  public void busStopHasQueueOfZero() {
    assertEquals( 0, bus_stop.queueCount() );
  }

  @Test
  public void busStopHasQueueNotZero() {
    bus_stop.addPassenger(person);
    assertEquals( 1, bus_stop.queueCount() );
  }

}