package main_study.the_08_04;

import java.util.Scanner;

public class Example06 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String form = """
                =============================================
                               사칙연산 계산기 
                =============================================
                1. 덧셈 2. 뺄셈 3. 곱셉 4. 나눗셈 5. 프로그램 종료        
                """;

        while (true) {
            System.out.println("두 수를 차례로 입력하고 수행할 사칙 연산의 메뉴 숫자를 입력해주세요");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();


            switch (n3) {
                case 1:

                    System.out.println(form);
                    int sum = n1 + n2;
                    System.out.printf("%d + %d = %d\n", n1, n2, sum);

                    System.out.println(form);
                    System.out.println();

                    break;
                case 2:
                    System.out.println(form);
                    int min = n1 - n2;
                    System.out.printf("%d - %d = %d\n", n1, n2, min);

                    System.out.println(form);
                    System.out.println();
                    break;
                case 3:
                    System.out.println(form);
                    int 곱하기 = n1 * n2;
                    System.out.printf("%d * %d = %d\n", n1, n2, 곱하기);
                    System.out.println(form);
                    System.out.println();
                    break;
                case 4:
                    System.out.println(form);
                    int 나누기 = n1 / n2;
                    System.out.printf("%d / %d = %.1f\n", n1, n2, 나누기);
                    System.out.println(form);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("숫자를 잘못 입력하셨습니다.");

                    continue;


            }


        }


    }


}
