package good.model;

import good.behavior.fly.FlyWithWings;
import good.behavior.quack.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("저는 청둥오리입니다.");
  }
}
