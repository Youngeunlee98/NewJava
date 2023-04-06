package homework._0327;

import homework._0324.M;
import homework._03_0316.PhoneInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class M3 extends PhoneInfo {
    private Map m;

    /*
        PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
         */
    public static void main(String[] args) {

    }

    List<Map<String, String>> list = new ArrayList<>();
    Map<String, String> map = new HashMap<>();
    int index = 0;
    public void insertPhoneInfo(String name, String number) {

        map.put(name, number);
        list.add(index++,map);
    }
    public void printAllPhoneInfo() {
        for (Map m: list) {
            System.out.println(m);
        }
    }

    public void printPhoneInfo(int index) {
        for (String key : list.get(index).keySet()){
            System.out.println("key: " + key +" /  value: " + list.get(0).get(key));
        }

    }

}
