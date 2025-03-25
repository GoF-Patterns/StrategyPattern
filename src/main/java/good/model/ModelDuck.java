package good.model;

import good.behavior.fly.FlyNoWay;
import good.behavior.quack.MuteQuack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("저는 가짜오리입니다.");
  }
}
