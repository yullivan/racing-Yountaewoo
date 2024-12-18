package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    //자동차 이름들 입력받기
    public static List<Car> inputCars() {
        Scanner scanner = new Scanner(System.in);
        String cars;
        ArrayList<Car> carname = new ArrayList<>();
        while (true) {
            cars = scanner.nextLine();
            try {
                for (String car : cars.split(",")) {
                    Car car1 = new Car(car);
                    carname.add(car1);
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("다시 입력하십시오.");
                carname.clear();
            }
        }
        return carname;
    }

    //시행 횟수 입력받기
    public static int racingCount() {
        Scanner scanner = new Scanner(System.in);
        int racingCount;
        while (true) {
            racingCount = scanner.nextInt();
            try {
                RacingNumber racingNumber = new RacingNumber(racingCount);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("다시입력하십시오");

            }
        }
        return racingCount;
    }
}
