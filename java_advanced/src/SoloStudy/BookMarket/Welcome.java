package SoloStudy.BookMarket;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;//책이 3권이 있어 뭔책 (쉽게~,안드로이드,스크래치)3개
    static final int NUM_ITEM = 7;//정보가 7개가 있어 뭔 정보(책ID,제목,가격,저자,부제목,책종류,날짜)7개
    static CartItem[] mCartItem = new CartItem[NUM_BOOK];//mCartItem이란 장바구니(책3권, 1권당 정보7개)를 만들어요 요거는 2차 배열이에요
    static int mCartCount = 0;//장바구니 책의 권수를 넣는 박스에요
    static User mUser;//사용자 정보

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];//mBook에는 책3권의 7가지 정보가 들어가요

        Scanner input = new Scanner(System.in);//사용자에게 입력을 받으세요
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();// 입력 받은 값을 userName에 저장하세요

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();//입력받은 값을 userMobile에 저장하세요


        mUser = new User(userName, userMobile);//입력받은 이름과 모바일을 합쳐서 mUser에 저장하세요

        String greeting = "Welcome to Shopping Mall";// 머릿말 greeting에 저장
        String tagline = "Welcome to Book Market!";//꼬릿말 tagline에 저장

        boolean quit = false;//거짓이 나오면 종료하세요(주어를 모름)

        while (!quit) {//종료 될때마다 요렇게 출력하세용
            System.out.println("***********************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
            /*
             * System.out.println("***********************************************");
             * System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
             * System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
             * System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
             * System.out.println(" 7. 영수증 표시하기 \t8. 종료");
             * System.out.println("***********************************************");
             */
            menuIntroduction();//밑에있는 메뉴 인트로 덕션 포맷을 출력하세요

            System.out.print("메뉴 번호를 선택해주세요 ");//메뉴번호 입력받기
            int n = input.nextInt();//n이라는 변수에 입력받은거 저장하기
            // System.out.println(n + "번을 선택했습니다");

            if (n < 1 || n > 9) {//만약에 입력받은 n이 1보다 작거나 9보다크면 출력하세요
                System.out.println("1부터 9까지의 숫자를 입력하세요.");
            } else { //그게 아니면 밑에 있는 거처럼 하세요
                switch (n) {// 해당하는 숫자에 맞춰서 움직이세요

                    case 1://1번이 나오면
                        // System.out.println("현재 고객 정보 : ");
                        // System.out.println("이름 " + userName + " 연락처 " + userMobile);
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2://2번이 나오면
                        // System.out.println("장바구니 상품 목록 보기 :");
                        menuCartItemList();
                        break;
                    case 3://3번이 나오면
                        // System.out.println("장바구니 비우기");
                        menuCartClear();
                        break;
                    case 4://4번이 나오면
                        // System.out.println("장바구니에 항목 추가하기 : ");
                        menuCartAddItem(mBook);
                        break;
                    case 5://5번이 나오면
                        // System.out.println("5. 장바구니의 항목 수량 줄이기");
                        menuCartRemoveItemCount();
                        break;
                    case 6://6번이 나오면
                        // System.out.println("6. 장바구니의 항목 삭제하기");
                        menuCartRemoveItem();
                        break;
                    case 7://7번이 나오면
                        // System.out.println("7. 영수증 표시하기");
                        menuCartBill();
                        break;
                    case 8://8번이 나오면
                        // System.out.println("8. 종료");
                        menuExit();
                        quit = true;
                        break;
                    case 9://9번이 나오면
                        menuAdminLogin();
                        break;
                }
            }
        }

    }

    public static void menuIntroduction() {//메뉴인트로덕션 포맷
        System.out.println("******************************");
        System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기 \t8. 종료");
        System.out.println(" 9. 관리자 로그인");
        System.out.println("******************************");
    }

    public static void menuGuestInfo(String name, int mobile) {//1번이 나오면
        System.out.println("현재 고객 정보 : ");
        // System.out.println("이름 " + name + " 연락처 " + mobile);
        // Person person = new Person(name, mobile);
        // System.out.println("이름 " + person.getName() + " 연락처 " + person.getPhone());
        System.out.println("이름 " + mUser.getName() + "   연락처 " + mUser.getPhone());
    }

    public static void menuCartItemList() {//2번이 나오면
        System.out.println("장바구니 상품 목록 :");
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
            System.out.print("    " + mCartItem[i].getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }//3번이 나오면

    public static void menuCartAddItem(String[][] book) {//4번이 나오면
        // System.out.println("장바구니에 항목 추가하기 : ");

        BookList(book);//Booklist란 메서드를 하세요 이게 뭔데 ㅅㅂ

        for (int i = 0; i < NUM_BOOK; i++) {//(2차배열)_1단계:일단 i라는 변수를 꺼내봐요 i가 Num_Book(책의 권수)보다 작으면 1씩 증가시키세요
            for (int j = 0; j < NUM_ITEM; j++)//(2차배열)_2단계: i이가 Num_Item(책의 정보)보다 작으면 1씩 증가시키세요
                System.out.print(book[i][j] + " | ");
            System.out.println("");
        }
        boolean quit = false;// 만약 조건에 부합하지 많으면 끄지라

        while (!quit) {//초기값 false의 반대 true가 된다 그러면 그냥 true라고 쳐 적으면 안되는건가?

            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();//도서 id 저장!!

            boolean flag = false;//모름
            int numId = -1;//아이디에 -1?? 뭔소리야

            for (int i = 0; i < NUM_BOOK; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }
            if (flag) {//모르겠다
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")) {
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                    // 장바구니에 넣기
                    if (!isCartInBook(book[numId][0]))
                        mCartItem[mCartCount++] = new CartItem(book[numId]);
                }
                quit = true;
            } else
                System.out.println("다시 입력해 주세요");

        }
    }

    public static void menuCartRemoveItemCount() {
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("6. 장바구니의 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("7. 영수증 표시하기");
    }

    public static void menuExit() {
        System.out.println("8. 종료");
    }

    public static void BookList(String[][] book) {

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }

    public static boolean isCartInBook(String bookId) {

        boolean flag = false; //아이디를 잘못 입력하면
        for (int i = 0; i < mCartCount; i++) {//i=0부터 /시작 장바구니(mCartCount) 보다 작으면 1씩 추가하세요
            if (bookId == mCartItem[i].getBookID()) {//만약 아이디를 올바르게 쳤으면
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1); // 해당하는 아이디의 책을 1추가하세요(set,get 다시 공부)
                flag = true; //참이다
            }
        }
        return flag;//다시 돌아간다
    }

    public static void menuAdminLogin() {
        System.out.println("관리자 정보를 입력하세요");

        Scanner input = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = input.next();

        System.out.print("비밀번호 : ");
        String adminPW = input.next();

        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");
    }
}