class Bus {
  private int number;
  private String final_stop;
  private Person[] passengers;

  public Bus(int number, String final_stop){
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

}