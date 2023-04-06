package homework._0405.clazz;

public class Student {
    //int sno, String sName, int score, String grade를 갖는 Student 클래스

    private int sno;
    private String sName;
    private int score;
    private String grade;


    public Student(int sno, String sName, int score ){
        this.sno = sno;
        this.sName = sName;
        this.score = score;

    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public int getSno() {
        return sno;
    }



    public String getsName() {
        return sName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String tostring(){
        return "Student 넘버: " + sno + ", 이름: " + sName + ", 점수: " + score
                + ", 등급: " + grade + " 입니다.";
    }

}
