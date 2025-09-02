package SoloStudy.plusOmg;

public class Student implements java.io.Serializable {//직렬화
    //직렬화는 사람이 말을하면 컴퓨터는 말을 바이트다위로 쪼개서 저장한다. 요것을 직렬화라고 한다.
    static final long serialVersionUID = 1;//요게 그 1리터 그거인가? 그거 맞다 L은 생략가능
    private String name;
    private int[] record;// 4과목의 점수를 받아야 한다.(국영수과) 고로 배열
    private int total;//총합
    private float average;// 더블쓰면 안되나? 더블 써도 된다
    private String grade;// 학점 등급

    public Student() {
        this.name = "^^";// 이름쓰고 ^^거 하면 종료
        this.record = new int[4];
        //4칸짜리배열 1.국어 2. 영어 3. 수학 4. 과학


    }
    public Student(String name,int [] record){//오버로드된 생성자
        this.name = name; //이름 초기화
        this.record = record;//점수배열 record에 저장
        this.makeScores(); //요거 메서드 밑에서 정의함
        //오버로드란 같은이름의 메서드나 생성자를 매개변수의 타입이나 갯수만 다르게해서 여러 개 정의 하는 것




    }



}
