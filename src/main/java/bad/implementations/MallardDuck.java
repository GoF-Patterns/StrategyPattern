package bad.implementations;

// Quackable 인터페이스 import 추가
import bad.interfaces.Flyable;
import bad.interfaces.Quackable;
import bad.model.Duck;

public class MallardDuck extends Duck implements Quackable, Flyable {

  @Override
  public void quack() {
    System.out.println("Quack!");
  }

  @Override
  public void display() {
    System.out.println("I'm a Mallard duck!");
  }

  @Override
  public void fly() {
    // 이 부분이 문제. 만약 fly를 수정해야한다면 fly()를 구현한 모든 클래스에 들어가서 수정해야함.
    // 즉, 재사용성이 없음.
    System.out.println("I'm flying!");
  }

}