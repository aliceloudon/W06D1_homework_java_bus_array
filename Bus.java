class Bus {
  private int number;
  private String final_stop;
  private Person[] passengers;

  public Bus(int number, String final_stop) {
    this.number = number;
    this.final_stop = final_stop;
    this.passengers = new Person[15];
  }

  public int getNumber() {
    return this.number;
  }

  public String getFinalStop() {
    return this.final_stop;
  }

  public int passengerCount() {
    int count = 0;
    for (Person person : passengers) { 
    // passengers is the array
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void pickUpPassenger(Person person) {
    if (isBusFull() ) {
      return;
    }
    int index = passengerCount();
    passengers[index] = person;
  }

  public boolean isBusFull() {
    return passengerCount() == passengers.length;
  }

}