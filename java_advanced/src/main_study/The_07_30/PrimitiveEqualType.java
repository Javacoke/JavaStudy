package main_study.The_07_30;
// == , != 연산자는 변수의 값이 같은지, 아닌지를 조사한다.
// 참조 타입 변수의 값은 객체의 주소(번지)이므로
// 참조 타입 변수의 ==,!= 비교는 주소 값을 비교하는 것이다.





public class PrimitiveEqualType {
    public static void main(String[] args) {
        //정수형 배열 arr1,arr2,arr3 선언

        int[]arr1;
        int[]arr2;
        int[]arr3;

        // 정수형 배열

        arr1 =new int[3];
        arr2 =new int[3];
        arr3 =new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);


        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[1] = 3;
        System.out.println(arr1[1]);

        //ar3에 차례대로 1,2,3, 할당하고, 결과를 확인하세요

        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;

        System.out.println("==============================");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("==============================");
        //for문으로 처리 가능
        //itar 자동완성


        System.out.println("==============================");
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr3[i];
            System.out.println(i1);

            for (int j = 0; j < arr3.length; j++) {
                int i2 = arr3[j];
                
            }

            //arr3에 값을 차례로 itar, iter 방식을 통해서 5,6,7 값을 할당하고, 할당한 값을 iter,itar 방식으로 확인

            arr3[0]=0;
            arr3[1]=0;
            arr3[2]=0;

            arr3[0]=5;
            arr3[1]=6;
            arr3[2]=7;

            for (int i2 : arr3) {

            }







            for (int j = 0; j < arr3.length; j++) {
                int i2 = arr3[j];

            }
            for (int i2 : arr3) {

            }


                   }
        System.out.println("==============================");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("==============================");




    }
}
