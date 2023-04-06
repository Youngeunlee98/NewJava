package chap_17_Jeneric;

import chap_07.Car.KiaCar;

import java.util.*;

public class test {

    public static void main(String[] arg) {
        //여기는 내가 작성한 코드가 알 맞은지 확인할수 있는 곳.
        add(1, 33);
        System.out.println("베이직 2번 테스트 결과(1) : " + add(1, 33));
        System.out.println("베이직 2번 테스트 결과(2) : " + add(true, false));

        /*베이직 3번 */
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("베이직 3번 테스트 결과(1) : " + add(list1));
        List<String> list2 = new ArrayList<>();
        list2.add("안1111111111111111");
        list2.add("녕");
        list2.add("하");
        list2.add("세2222222222222222");
        list2.add("요");
        System.out.println("베이직 3번 테스트 결과(2) : " + add(list2));
        List<String> list3 = null;
        System.out.println("베이직 3번 테스트 결과(3) : " + add(list3));

        System.out.println("=======================================");

        System.out.println("---------------4번-----------------");
        printArr(list1);
        printArr(list2);

        System.out.println("---------------5번-----------------");
        System.out.println(getMin(list1));

        System.out.println("---------------6번-----------------");
        Map<Integer, Integer> map = new HashMap<>();
        Integer a = 1111111111;
        map.put(1,123);
        map.put(2,a);
        printOverTen(map);

    }

    /*베이직 1번*/
    public class GenericClass<T> {
        //멤버변수 t
        private T t;

        //생성자 : 초기값 설정 역할
        public GenericClass(T t) {
            this.t = t;
        }

        //게터
        public T getT() {
            return t;
        }

        //세터
        public void setT(T t) {
            this.t = t;
        }
    }


    /*베이직 2번 */
    public static <T> String add(T t1, T t2) {
        String str = "";

        //결합연산이 "+" 인거면, string으로 형변환해서 t1 + t2 해주면 됌.
        str = t1.toString() + t2.toString();

        return str;
    }


    /*베이직 3번 */
    //public static Integer add(List<?> list) 와일드 카드를 이용한 메소드를 구현하세요.
    public static Integer add(List<?> list) {
        //메소드 이름이 "add"인걸로 보아 list의 원소를 다 더하라는걸로 알겠음.
        Integer result = null;
        Integer sum = 0;
        //1. list의 원소를 하나씩 접근한다.
        //2. 예외(try-catch문)처리
        try {
            for (int i = 0; i < list.size(); i++) {
                //3.List의 요소들의 타입을 체크한다.
                Class<?> type = list.get(i).getClass();
                System.out.println("List<?>의 요소[" + i + "] 타입: " + type.getName());
                //형변환하는게 이해하기 어려울수도..
                sum += ((Number) list.get(i)).intValue();
                ;
            }
            result = sum;

        } catch (NullPointerException e) {
            // NullPointerException 예외 처리
            System.out.println("#NullPointerException이 발생했습니다.");
            //e.printStackTrace();
        } catch (Exception e) {
            // 다른 모든 예외 처리
            System.out.println("#예외가 발생했습니다.");
            //e.printStackTrace();
        }


        return result;
    }

    //어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
   public static void printArr(List<?>list){
        for (int i = 0; i < list.size(); i++) {
            if(i % 3 == 0){
                System.out.println(list.get(i));
            }
        }
    }

    //Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
    public static <T extends Number> int getMin(List<T>list){
        int min = Integer.MAX_VALUE; //가장큰 값 배정
        for(T t : list ){
            if(min > t.intValue()){
                min = t.intValue();
            }
        }return min;

    }

    //6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드
    //void printOverTen을 구현하세요.

    public static <K,V> void printOverTen(Map<K,V> map){

        for(K k1 : map.keySet()){
            K key = k1;
            V value = map.get(k1);
            String str = value.toString();
            if(str.length() > 9){
                System.out.println(key);
            }

        };


    }







}

