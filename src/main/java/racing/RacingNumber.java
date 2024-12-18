package racing;

import java.util.Objects;

public class RacingNumber {
    int number;

    public RacingNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("[ERROR] 시행횟수는 1보다 작을 수 없습니다.");
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingNumber that = (RacingNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
