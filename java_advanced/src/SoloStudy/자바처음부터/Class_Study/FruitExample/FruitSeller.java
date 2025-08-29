package SoloStudy.자바처음부터.Class_Study.FruitExample;

public class FruitSeller {

    //과일장수는 과일을 팝니다.(행동)=기능
    //과일 장수는 사과 20개 오렌지 10개를 가지고 있습니다.(상태)=데이터,정보
    //과일 판매 수익은 50,000원입니다(상태)=데이터,정보
    //사과는 1개당 1000원입니다.(데이터)
    //구매자는 과일 장수한테 2000원어치 사과를 샀다(행동)
    //과일장수는 2000원을 얻었고 18개의 사과가 남았다(데이터)
    int SellerApple = 20;//사과를 20개를가지고 있다
    int SellerMoney = 0;// 과일 장수가 번 금액이다
    final int ApplePrice = 1000;// 사과 한개에 1000원 요것은 절대 변하지 않으므로 상수

    //2번 메서드 만들기
    //사과를 팝니다 행동 메서드
    public int SaleApple(int Money)     //(파는 행동)사과 구매액을 매소드 인자로 전달
    {
        int num = Money / 1000; //판매한 사과 갯수: 개당 천원이므로 판매액을 1000으로 나누면 구할 수있다.
        //이제 사과를 팔면?
        SellerApple -= num;// 사과 갯수를 판매하면 가지고 있던 사과의 갯수가 줄어든다
        SellerMoney += Money;//판매 금액만큼 소유한 돈의 금액이 증가한다.
        return num;//판매한 과일의 수를 반환 리턴값은 왜?=계산이 필요한 부분이다 따라서 계산을 하고 답을 내놓으라고 독촉해야한다
    }
        public void showSaleResult() {//이제 판매자가 현재 가지고 있는 사과의 갯수와 판매수익을 알려줘
        //질문 사항 갑자기 왜 void를 썻을까?= void는 반환하지 않는 다는 뜻이 이 말은 계산하지 않는다는 뜻이다
            //따라서 여기는 단순히 계산이 없고 출력만 하는 블럭이다
        System.out.println("남은 사과" + SellerApple);
            System.out.println("판매 금액" + SellerMoney);


        }

}

