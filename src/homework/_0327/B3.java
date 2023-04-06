package homework._0327;

import java.util.HashMap;
import java.util.Map;

public class B3 {
    /*
    3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분)
    value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
     */
    public static void main(String[] args) {

        Map<String, Integer> objMap = new HashMap<String,Integer>();

        objMap.put("a",97);
        objMap.put("A",65);
        objMap.put("h",104);
        objMap.put("G",71);
        objMap.put("k",107);

        System.out.println(objMap.get("a"));
    }
}
