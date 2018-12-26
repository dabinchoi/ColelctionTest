package my.examples.javaexam;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하시오");

        int score = scan.nextInt();
        if(score>80)
            System.out.println("ㅊㅋㅊㅋㅊㅋㅊㅋ");
        scan.close();

    }
}
