package main_study.The_08_01.ArrayCopy;

import java.util.Arrays;

public class ArrayCopyEx {

    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 50};
        int[] newArray = new int[oldArray.length * 10];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];

        }
        for (int i : newArray) {
            System.out.print(i + "");
        }

        int[] systemArray1 = new int[oldArray.length * 2];
        System.arraycopy(oldArray, 0, systemArray1, 0, oldArray.length);
        System.out.println();


        int[] Arrascopy0F=new int[oldArray.length*2];

        Arrascopy0F = Arrays.copyOf(oldArray,Arrascopy0F.length);//요방법 많이 쓰이닌깐 요거 암기
        System.out.println(Arrays.toString(Arrascopy0F));
    }



    }

