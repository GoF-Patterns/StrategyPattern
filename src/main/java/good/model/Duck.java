package good.model;

import good.behavior.fly.FlyBehavior;
import good.behavior.quack.QuackBehavior;

public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 뜨죠!");
  }

  public void setFlyBehavior(FlyBehavior fb) {
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.quackBehavior = qb;
  }
}