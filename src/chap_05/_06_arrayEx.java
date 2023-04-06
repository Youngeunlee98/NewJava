package chap_05;

public class _06_arrayEx {
    public static void main(String[] args) {
        int [] nums = new int[10];

        //1ㄱ씩 증가하면서 3의 배수인지 검사될 변수
        //3의 배수면 nums 배열에 저장
        int num = 0;

        //3의 배수를 nums에 저장할 때 마다 1 씩 증가할 배열의 인덱스
        int index = 0;

        while (index < 10){
            //1부터 3의 배수인지 검사
            num++;
            if (num % 3 == 0){
                //index는 num이 3의 배수일때만 1 씩 증가
                //num = 1, index = 0
                //num = 2, index = 0
                //num = 3, index = 1, nums[0] = 3
                //....
                //num = 30, nums[9] = 30, index = 10
                nums[index++] = num;
            }
         }








    }
}
