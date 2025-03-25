package good.behavior.fly;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("날개 달고 날기!!");
  }
}
