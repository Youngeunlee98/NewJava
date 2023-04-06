package chap_21_stream;






import chap_21_stream.clazz.HyundaiCar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _03_streamPipeLine {
    public static void main(String[] args) {
        List<HyundaiCar> hCarList = new ArrayList<HyundaiCar>();

        hCarList.add(new HyundaiCar("아반떼", 3000));
        hCarList.add(new HyundaiCar("아반떼", 2500));
        hCarList.add(new HyundaiCar("아반떼", 2000));
        hCarList.add(new HyundaiCar("제네시스", 5000));
        hCarList.add(new HyundaiCar("그랜저", 4000));

        /*
        //방법1
        //현대차ㅏ리스트에서
        Stream<HyundaiCar> hCarStream = hCarList.stream();
        //2. 조건에 맞는 현대차 필터림
        //모델명이 아반떼인 요소들만 새로 스트림 구성
        Stream<HyundaiCar> avanteStream = hCarStream.filter(
                hCar-> hCar.getModel().equals("아반뗴"));
        //3. 스트림 타입변환
        //모델이 아반데 요소들의 가격만 모아서 새로 스트림 구성
        IntStream priceStream = avanteStream.mapToInt(avante ->
                avante.getPrice());
        //4. 가격들의 총집합(최종 처리)
        //int totalPrice = priceStream.sum();
        */
        //체이닝 기법
        int totalPrice = hCarList.stream() .filter(hCar ->
                        hCar.getModel().equals("아반떼")).mapToInt(hCar -> hCar.getPrice()).sum();

        System.out.println("아반떼 가격의 총합 : " + totalPrice);
    }
}
