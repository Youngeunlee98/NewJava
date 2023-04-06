package chap_99;

public class _01_printReverse {
    public static void main(String[] args) {
       /* String str = "AbcDeF";
                //fEdCBa
        //대문자에서 32를 더하면 소문자 , 소문자 -32 는 대문자.
        //대소문자 변환된 문자열
        String capStr = "";

        for(int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i); //첫 번째 ch는 A이다.

            char capCh = ch >= 'A' && ch <= 'Z'
                    ?
                    (char)((int)ch + 32) //true
                    :
                    (char)((int)ch - 32) ;//false;
            capStr = capCh + capStr;
            //A가 들어왔을 때 : a + "" capStr = "a"
            //b가 들어왔을 때 : B + "a" -> capStr = "Ba"
            //... F가 들어왔을 때 : f + "EdCBa" -> capStr = "fEsCBa"

        }
        System.out.println(capStr);
        */



        //반대로 출력
        //aBCdEf

        String str = "dBEfIZ";
        String prStr = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            char convertCh;
            if(ch >= 'A' && ch <= 'Z') {
                if((ch + 33) > 'z') {
                    convertCh = (char)(('a' - 1) +
                            ((ch + 33) - 'z'));
                } else {
                    convertCh = (char)(ch + 33);
                }

            } else {
                if((ch - 33) < 'A') {
                    convertCh = (char)(('Z' + 1) -
                            ('A' - (ch - 33)));
                } else {
                    convertCh = (char)(ch - 33);
                }

            }
            prStr = convertCh + prStr;

        }


        System.out.println(prStr);


    }

}


