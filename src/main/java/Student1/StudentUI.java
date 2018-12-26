package Student1;

import java.util.Scanner;

public class StudentUI {
    public Student inputStudent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력해");
        String name = scan.nextLine();
        System.out.println("국어 점수를 입력");
        int kor = scan.nextInt();
        System.out.println("영어 점수를 입력");
        int eng = scan.nextInt();
        System.out.println("수학 점수를 입력");
        int math = scan.nextInt();

        Student student = new Student(name,kor,eng,math);
        return student;
    }
    public String inputContinue(){
        System.out.println("계속 입력할겨?");
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        return result;
    }
}
