package homework._20230403;

public class _배열 {
    //1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
    //   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
    public static void main(String[] args) {
        char[] chArr= {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        String bit =  "" + chArr[0] + chArr[4] + chArr[8];
        String com = "" + chArr[1] + chArr[5] + chArr[9];
        String sql = "" + chArr[2] + chArr[6] + chArr[10];

        System.out.println(bit);
        System.out.println(com);
        System.out.println(sql);
    }
}
