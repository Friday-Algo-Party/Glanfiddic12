package class1;

class Animal {
    // 부모 클래스의 메서드
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    // 부모 클래스의 sound() 메서드를 오버라이딩
    @Override
    void sound() {
        System.out.println("개가 멍멍 짖습니다.");
    }
}

class Cat extends Animal {
    // 부모 클래스의 sound() 메서드를 오버라이딩
    @Override
    void sound() {
        System.out.println("고양이가 야옹야옹 울습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // 다형성
        Animal myCat = new Cat();

        myDog.sound(); // 개가 멍멍 짖습니다.
        myCat.sound(); // 고양이가 야옹야옹 울습니다.
    }
}