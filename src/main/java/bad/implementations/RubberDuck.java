package bad.implementations;

import bad.interfaces.Quackable;
import bad.model.Duck;

public class RubberDuck extends Duck implements Quackable {
  @Override
  public void quack() {
    System.out.println("I'm quacking!");
  }

  @Override
  public void display() {
    System.out.println("I'm Rubber Duck!");
  }
}
