package racing;

import java.util.Objects;

public class Car {
    private String name;
    private int count;

    public Car(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Car(String name) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 10글자를 넘을 수 없습니다.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return count == car.count && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getRandomCount() {
        count = count + Game.count(Game.randomNumber());
        return count;
    }
}
