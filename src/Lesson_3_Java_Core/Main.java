package Lesson_3_Java_Core;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
    }
}
    class Apple extends Fruit{
        public Apple() {
            super.weigth = 1f;
    }

}

    class Orange extends Fruit{
        public Orange() {
            super.weigth = 1.5f;
    }
}

    class Fruit {
        float weigth;
}

    class Box<T>{
        private boolean isEmpty = true;
        float maxWeight = 10f;
        float normWeight = 0;
        ArrayList<T> arrayList;

        void addFruit(T fruit) {
            if (normWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            normWeight++;
                if (arrayList.size() < 1)
                isEmpty = false;
        }   else
            System.out.println("Коробка полная");
    }

        float getWeight(Fruit f) {
            return arrayList.size() * f.weigth;
    }

        boolean compare(Fruit or, Fruit ap) {
            return getWeight(or) == getWeight(ap);
    }

        public boolean compare(Box box) {
            return normWeight == box.normWeight;
        }
}
