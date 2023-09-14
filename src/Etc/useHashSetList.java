package Etc;

import java.util.HashSet;

public class useHashSetList {
    //배열 공부
    public static void main(String[] args)
    {
        HashSet<Integer> num = new HashSet<>();
        HashSet<Integer> num1= new HashSet<>();
        HashSet<Integer> num2= new HashSet<>();

        for (int i = 1; i <= 10; i++)
        {
            num.add(i);
        }

        for (int i = 1; i<=num.size(); i++)
        {
            if (i % 2 != 0) // 홀수인 경우 num1에 추가
            {
                num1.add(i);
            }
            else// 짝수인 경우 num2에 추가
            {
                num2.add(i);
            }
        }

        System.out.println("전체 배열 : "+num);
        System.out.println("홀수 배열 : "+num1);
        System.out.println("짝수 배열 : "+num2);
    }
}
