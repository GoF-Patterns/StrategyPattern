package good.model;

import good.behavior.fly.FlyNoWay;
import good.behavior.quack.Squeak;

public class RubberDuck extends Duck {
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("저는 고무오리입니다.");
  }
}
