package chap_20_lambda.clazz;

import java.util.*;

public class CCustomString {
    String str;

    @Override
    public String toString() {
        return "CCustomString{" +
                "str='" + str + '\'' +
                '}';
    }

    public CCustomString(String str){
        this.str = str;
    }

    public void changStr(char ch,UserChar uc){
        this.str = uc.findUserChar(ch,this.str);

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {

        //맵으로 할꺼면.....

//        List<Map<String, String>> mapList =
//				new ArrayList<Map<String, String>>();
//
//		for(int i = 0; i < 5; i++) {
//			Map<String, String> map =
//					new HashMap<String, String>();
//			/*
//			 * {
//			 * 		i : i,
//			 * 		i : i,
//			 * 		i : i
//			 * }
//			 */
//        map.put(String.valueOf(i), String.valueOf(i));
//        map.put(String.valueOf(i), String.valueOf(i));
//        map.put(String.valueOf(i), String.valueOf(i));
//        map.put(String.valueOf(i), String.valueOf(i));
//        map.put(String.valueOf(i), String.valueOf(i));
//
//        mapList.add(map);



        Scanner sc = new Scanner(System.in);
        //사용자가 10개의 스트링 입력
        //찾을 문자입력 , 찾아내기

        //1. 리스트 짜기
        List<CCustomString> ctList = new ArrayList<>();
        //2. 입력 문자열 저장
        for (int i = 0; i < 3; i++) {
            System.out.print("문자열를 입력하세요 : ");
            ctList.add(new CCustomString(sc.nextLine()));
        }
        //3. 찾는 문자 알아내기
        System.out.println("찾는 문자: ");
        char findch = sc.nextLine().charAt(0);

        for (CCustomString c : ctList){
            c.changStr(findch,(a,b)->{
                String returnStr = "";
                for (int i = 0; i <b.length() ; i++) {
                    if (b.charAt(i) == a){
                        returnStr = b;
                    }
                }
                return returnStr;
            });
        }
        System.out.println(ctList);




    }
}
