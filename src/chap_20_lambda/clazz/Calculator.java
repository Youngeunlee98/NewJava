package chap_20_lambda.clazz;

@FunctionalInterface // 함수형 인터페이스를 보장 -> 추상메소드를 하나만 가질 수 있음

public interface Calculator {
    void calculate(int a, int b);
}
