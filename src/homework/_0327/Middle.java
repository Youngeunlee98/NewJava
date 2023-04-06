package homework._0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle {
    /*
1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.

2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서
    Map<String, Integer>에 담은 후 출력하세요.
  ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4}, {2, 3})}

3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
     */

    public static void main(String[] args) {
        // name = key , score = value
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            System.out.print(i + "번째 학생 이름을 입력하세요: ");
            String name= sc.next();
            System.out.print(i + "번째 학생의 점수를 입력해주세요: ");
            int score = Integer.parseInt(sc.next());
            map.put(name,score); // 학생 이름과 점수 저장.
        }

        String Mname = "";
        int Mscore = 0; // 최고 점수/이름


        for (String name : map.keySet()){
            int score = map.get(name);
            if(score > Mscore){
                Mname = name;
                Mscore = score; //갱신
            }
        }
        System.out.println("최고점: " + Mscore + ", 학생: " + Mname);










    }
}
