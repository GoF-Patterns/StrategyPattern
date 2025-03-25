package bad.implementations;

import bad.model.Duck;

public class DecoyDuck extends Duck {
  @Override
  public void display() {
    System.out.println("I'm decoy duck");
  }
}
