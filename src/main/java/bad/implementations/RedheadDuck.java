package bad.implementations;

import bad.interfaces.Flyable;
import bad.interfaces.Quackable;
import bad.model.Duck;

public class RedheadDuck extends Duck implements Flyable, Quackable {

  @Override
  public void fly() {
    // 이 부분이 문제. 만약 fly를 수정해야한다면 fly()를 구현한 모든 클래스에 들어가서 수정해야함.
    // 즉, 재사용성이 없음.
    System.out.println("I'm flying!");
  }

  @Override
  public void quack() {
    System.out.println("I'm quacking!");
  }

  @Override
  public void display() {
    System.out.println("I'm a Redhead duck!");
  }
}
