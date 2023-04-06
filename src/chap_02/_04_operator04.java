package chap_02;

public class _04_operator04 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        //& 연산자는 &&와 다르게 결과가 false여도 마지막 조건식까지 모두 수행.
        //| 연산자는 ||와 다르게 실행된 조건식에서 true가 나와도 모든 조건식을 수행.

        // or은 ||, 여러개 중에 하나라도 참이면 참.
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 결과는 true
        // and는 &&, 여러개 전부 참이여야만 참.
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true면 true


        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고, 3은 1보다 크다 true
        System.out.println((5 > 3) && (3<1)); //5는 3보다 크고, 3은 1보다 작다 false

        System.out.println((5 > 3) || (3 >1)); //true
        System.out.println((5 > 3 ) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //둘 다 틀려서 false

        //System.out.println(1 < 3 < 5); //불가능한 코드

        //논리 부정 연산자
        System.out.println(!true); // true의 반대값 출력.
        System.out.println(!false); // false의 반대값.
        System.out.println(!(5 == 5)); // "5는 5와 같다"의 반대 = false
        System.out.println(!(5 == 3)); // "5는 3과 같다"의 반대 = true


        }

    }
