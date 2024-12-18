package racing;

import java.util.*;

public class Game {

    // 1 -6 사이 랜덤으로 숫자를 뽑는 함수
    public static int randomNumber() {
        ArrayList<Integer> oneToSix = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            oneToSix.add(i);
        }
        Collections.shuffle(oneToSix);
        return oneToSix.get(0);
    }

    //랜덤숫자에 따른 count 증가 함수
    public static int count(int randomNumber) {
        int count = 0;
        if (randomNumber > 3) {
            count++;
        }
        return count;
    }

    //시행횟수만큼 게임을 진행하고 보여주는 함수
    public static void game(List<Car> cars, int racingCount) {
        //시행 횟수만큼 반복
        for (int i = 1; i <= racingCount; i++) {
            //각각의 자동차들에게 명령
            System.out.println(i + "번째");
            for (Car car : cars) {
                Output.showGameImage(car, car.getRandomCount());
            }
            System.out.println("-------------------------------");
        }
    }

    //게임 결과를 알려주는 함수
    public static List<String> winner(List<Car> cars) {
        HashMap<String, Integer> carHashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        ArrayList<String> winner = new ArrayList<>();

        for (Car car : cars) {
            carHashMap.put(car.getName(), car.getCount());
            if (car.getCount() > max) {
                max = car.getCount();
            }
        }

        for (Map.Entry<String, Integer> entry : carHashMap.entrySet()) {
            String carname = entry.getKey();
            int carCount = entry.getValue();
            if (carCount == max) {
                winner.add(carname);
            }
        }
        return winner;
    }
}

