package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // 자동차 이름들 입력하라는 문구 출력
        Output.inputCars();
        // 자동차 이름들 입력받고 cars 라는 List 생성
        List<Car> cars = Input.inputCars();
        // 입력한 자동차들 출력
        Output.showCars(cars);
        //시행 횟수를 입력하라는 문구 출력
        Output.inputRacingCount();
        //시행 횟수 입력받기
        int racingCount = Input.racingCount();
        //입력받은 시행 횟수 보여주기
        Output.showRacingCount(racingCount);
        // 게임진행
        Game.game(cars, racingCount);
        //게임 결과 발표
        Output.showGameResult(Game.winner(cars));
    }

}
