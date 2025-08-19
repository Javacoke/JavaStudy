package main_study.The_07_29;


import java.util.Scanner;

public class 메뉴판 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Format = """
                
                ***************************************************************        
                           Welcome to Shopping Mall        
                           Welcome to Book Market!
                ***************************************************************   
                %-20s\t%s        
                %-20s\t%s        
                %-20s\t%s        
                %-20s\t%s        
                ***************************************************************    
                """;//20칸 비우고 한칸 띄어서 정렬 맞춤
        System.out.print("당신의 이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.println("연락처를 입력하세요. ; ");
        String phone = sc.nextLine();

        while (true) {//메뉴 포멧에 데이터 기입
            System.out.printf(Format,
                    "1. 고객 정보 확인하기", "4. 바구니에 항목 추가하기",
                    "2. 장바구니 상품 목록 보기", "5. 장바구니의 항목 수량 줄이기",
                    "3. 장바구니 비우기", "6. 장바구니의 항목 삭제하기",
                    "7. 영수증 표시하기", "8.종료");

            System.out.println("메뉴 번호를 선택해주세요");//메뉴 넘버 받기
            Scanner sc1 =new Scanner(System.in);
            int num = sc1.nextInt();
            if (num > 8) {//요거 물어보기
                System.out.print("잘못된 선택입니다. 다시 선택해주세요");
                break; //원한던 것이 아님 수정필요
            }
            switch (num) {//스위치가 햇갈리네요 여기 지금 에러있음 여줘보기

                case 1:// 정렬 유지를 위해서 printf 이용
                    System.out.print("현재 고객 정보 : \n");
                    System.out.print("이름 "+name+"  연락처 "+phone);


                    break;//출력이 완료되면 멈춰야하므로 브레이크

                case 8:
                    System.out.print("이용해주셔서 감사합니다.");
                    break;//요거랑
            }
        }
    }
}