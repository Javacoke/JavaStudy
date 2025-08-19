package main_study.the_08_05;

public class Account {

    public static final int MIN_BALANCE = 0;//대가리 깨져도 안바뀐다.=상수
    public static final int MAX_BALANCE = 1000000;//상수=대문자로 표시

    private String num; //계좌번호 중요하닌깐 잠그고
    private String name;//이름 중요하닌깐 잠그고
    private int balance;//잔액 쪽파리닌깐 잠그고

    public String getNum() {//계좌번호는 잠가놔서 못보여줘 보고 싶으면 열쇠를 줄게
        return num;//계좌 알려줄게
    }

    public String getName() {//이름은 잠가놔서 못보여줘 보고 싶으면 열쇠를 줄게
        return name;//이름 알려줄게
    }

    public int getBalance() {//계좌번호는 잠가놔서 못보여줘 보고 싶으면 열쇠를 줄게
        return this.balance;//현재 잔액 알려줄게
    }

    public boolean push (int money) {//기본적인 입금함수 money만큼 입금
        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            //MIN BALANCE는 0원이다 그 이하면 마이너스라 안됨, MAX는 1,000,000 이상은 안됨
            System.out.println("입금 실패: 금액은 0원 이상 1,000,000원 이하만 가능합니다.");
            return false;// 조건에 걸리면 끄지라
        }
        this.balance += money;//조건에 맞으면 현재 잔액에서 돈만큼 추가하라
        System.out.printf("""
                -----------
                입금
                -----------
                계좌번호: %s
                입금액:%d
                """,num,money);//예금과 입금은 다른 거 아닌가요? 예금은 잔액조회이고 입금은 돈 더넣는거구
        return true;
    }

    public boolean pull(int money) {//money 만큼 출금하라는 함수
        if (money <= 0) {
            //출금액이 마이너스 출금 안된다
            System.out.println("출금 실패: 출금액은 0원보다 커야 합니다.");
            return false;//이러면 돌아가라
        }

        if (this.balance - money < MIN_BALANCE) {
            // 잔액부족
            System.out.println("잔액부족");
            return false;//이러면 돌아가라
        }
        this.balance -= money;
        {
            System.out.printf("""
                    -----------
                    출금
                    -----------
                    계좌번호: %s
                    출금액:%d
                    """, num, money);
        }
    return true;
    }

    public Account() {
    }

    ;// 생성자 만들고~~

    public Account(String num, String name, int balance) {
        //생성자 코드 번호랑 이름 잔액의 정보 저장해
        this.num = num;
        this.name = name;
        this.balance = balance;


    }


}





