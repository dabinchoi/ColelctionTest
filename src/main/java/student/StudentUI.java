package student;

import java.util.List;
import java.util.Scanner;

public class StudentUI {

    public Student inputStudent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 적어라");
        String name = scan.nextLine();
        System.out.println("국어 점수를 입력");
        int kor = scan.nextInt();
        System.out.println("수학 점수를 입력");
        int math = scan.nextInt();
        System.out.println("영어 점수를 입력");
        int eng = scan.nextInt();

        Student student = new Student(name,kor,math,eng);
        return student;
    }
    public String inputContinue(){
        System.out.println("계속입력할겨?");
        Scanner scan= new Scanner(System.in);
        String result = scan.nextLine();
        return result;
    }
}
