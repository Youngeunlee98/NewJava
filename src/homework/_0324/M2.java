package homework._0324;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	    parse() 메소드를 이용하면 String -> Calendar로 변환가능)
                Calendar cal1 = Calendar.getInstance();

                String s = "yyyy-MM-dd";
                DateFormat format1 = new SimpleDateFormat(s);

                System.out.print("날짜 입력>>");
                String str = sc.next();

                SimpleDateFormat sdFormat = new SimpleDateFormat(s, Locale.KOREA);

                try {
                    //sdFormat.parse(str) => Date객체
                    //cal1.setTime() => Date 객체를 Calendar 객체로 변경
                    cal1.setTime(sdFormat.parse(str));
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    System.err.println("입력하신 날짜: " + str +
                            ", 확인한 포맷: " + s);
                    e.printStackTrace();
                }
                add(cal1);
                String str1 = format1.format(cal1.getTime());
                System.out.println(str1);

//		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//  	사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
                Calendar cal2 = Calendar.getInstance();

                String[] days = {"", "일요일", "월요일", "화요일",
                        "수요일", "토요일", "금요일", "토요일"};
                System.out.print("날짜 입력>>");
                String str2 = sc.next();

                SimpleDateFormat sdFormat2 = new SimpleDateFormat(s, Locale.KOREA);
                try {
                    //sdFormat.parse(str) => Date객체
                    //cal1.setTime() => Date 객체를 Calendar 객체로 변경
                    cal2.setTime(sdFormat2.parse(str2));
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    System.err.println("입력하신 날짜: " + str2 +
                            ", 확인한 포맷: " + s);
                    e.printStackTrace();
                }
                System.out.println("요일 : "
                        + days[cal2.get(Calendar.DAY_OF_WEEK)]);


//		3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	    시 분 초 형태로 나타내시오.
                LocalDateTime ldt1 = LocalDateTime
                        .of(2023, 3, 15, 20, 31, 45);

                LocalDateTime ldt2 = LocalDateTime
                        .of(2021, 07, 8, 11, 58, 04);

                Duration diff = Duration.between(ldt1.toLocalTime(), ldt2.toLocalTime());

                System.out.printf("시: %d, 분: %d, 초: %d",
                        diff.toHours(), diff.toMinutes(), diff.getSeconds());
            }

            static Calendar add(Calendar cal) {
                cal.add(Calendar.DATE, 3);
                return cal;
            }
        }





