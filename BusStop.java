class BusStop {
  private Person[] queue;
  private Bus bus;

  public BusStop() {
    this.queue = new Person[8];
    this.bus = new Bus (11, "Ocean Terminal");
  }

  public int queueCount() {
    int count = 0;
    for (Person person : queue) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person person) {
    int index = queueCount();
    queue[index] = person;
  }

  public void removePassengerFromQueue(Person person) {

  }

  public void movePassengerFromQueueToBus() {

  }

}