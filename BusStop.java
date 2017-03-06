class BusStop {
  // private Bus;
  private Person[] queue;

  public BusStop() {
    // this.schedule = new Bus[4];
    this.queue = new Person[8];
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

}