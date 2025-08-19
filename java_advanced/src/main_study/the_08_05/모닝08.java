package main_study.the_08_05;

public class 모닝08 {
    String str =new String();
    public static void main(String[] args) {

        int[][] array = {{95,86},
                        {83,92,96},
                        {78,83,93,87,88}}; //2차원배열
        int 총합=0;
        double 평균 = 0.0;
        int count = 0;//갯수 구하는거

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                총합 += array[i][j];
                count++;

            }

        }
        평균=(double) 총합/count;
        System.out.println(총합);
        System.out.println(평균);


    }

}
