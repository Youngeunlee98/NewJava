package chap_04;

public class _quiz_duplicationForBr {
    public static void main(String[] args) {

        //외-내부for문의 break문 차이

        int iCnt = 0;
        int jCnt = 0;

        for (int i = 0; i < 5 ; i++) {
            if( i ==3){
                break;
            }
            iCnt++;
            for (int j = 0; j < 5 ; j++) {
                if (j ==2){
                    break;
                }
                jCnt++;
            }
        }

        System.out.println(iCnt);
        System.out.println(jCnt);
    }
}
