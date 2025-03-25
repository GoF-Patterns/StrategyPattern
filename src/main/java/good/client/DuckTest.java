package good.client;

import good.model.DecoyDuck;
import good.model.Duck;
import good.model.MallardDuck;
import good.model.RubberDuck;
import good.behavior.fly.FlyNoWay;
import good.behavior.quack.MuteQuack;

public class DuckTest {
  public static void main(String[] args) {
    System.out.println("== 청둥오리 ==");
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();
    mallard.swim();

    System.out.println("\n== 가짜오리 ==");
    Duck decoy = new DecoyDuck();
    decoy.display();
    decoy.performFly();
    decoy.performQuack();

    System.out.println("\n== 고무오리 ==");
    Duck rubber = new RubberDuck();
    rubber.display();
    rubber.performFly();
    rubber.performQuack();

    System.out.println("\n== 행동 동적 변경 ==");
    rubber.setFlyBehavior(new FlyNoWay());
    rubber.setQuackBehavior(new MuteQuack());
    System.out.println("고무오리의 행동을 변경했습니다:");
    rubber.performFly();
    rubber.performQuack();
  }
}