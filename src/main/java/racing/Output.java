package racing;

import java.util.List;

public class Output {

    public static void inputCars() {
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
    }

    public static void showCars (List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName());
        }
    }

    public static void inputRacingCount () {
        System.out.println("몇 회 시행할까요?");
    }

    public static void showRacingCount (int racingCount) {
        System.out.println(racingCount + "회 시행");
    }

    public static void showGameImage (Car car,int carRandomCount) {
        System.out.println(car.getName() + ":" + " ".repeat(carRandomCount)  + "🚗");
    }

    public static void showGameResult (List<String> winners) {
            System.out.println("승자는" + winners);
        }
    }


