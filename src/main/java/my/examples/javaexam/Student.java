package my.examples.javaexam;
import java.util.*;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
String name;
int kor;
int eng;
int math;
String go;

int korsum=0;
int engsum=0;
int mathsum=0;

int koravg=0;
int engavg=0;
int mathavg=0;

        List<String> namel = new ArrayList<>();
        List<Integer> korl=new ArrayList<>();
        List<Integer> engl=new ArrayList<>();
        List<Integer> mathl=new ArrayList<>();

while(true){
    System.out.println("이름은 무엇인가?");
    name= sc.next();
    System.out.println("국어점수는?");
    kor = sc.nextInt();

    System.out.println("영어점수는?");
    eng = sc.nextInt();

    System.out.println("수학점수는?");
    math = sc.nextInt();

    System.out.println("계속 입력하시겠습니까? (y/n)");
    go =sc.next();

namel.add(name);
korl.add(kor);
engl.add(eng);
mathl.add(math);

if(go.equals("n") || go.equals("n")){
    break;
    }

}

    for(int i = 0; i<namel.size(); i++){
    korsum=korsum+ korl.get(i);
}
    for(int i = 0; i<namel.size(); i++){
            engsum=engsum+ engl.get(i);
        }
    for(int i = 0; i<namel.size(); i++){
            mathsum=mathsum+ mathl.get(i);
        }
   koravg = (int)korsum/korl.size();
engavg = (int)engsum/engl.size();
mathavg = (int)mathsum/mathl.size();


System.out.println("이름  국어  영어  수학");
        for(int i = 0; i<namel.size(); i++) {
            System.out.print(namel.get(i)+ "\t");
            System.out.print(korl.get(i)+ "\t");
            System.out.print(engl.get(i)+ "\t");
            System.out.println(mathl.get(i)+ "\t");
        }
        System.out.println("\n");
        System.out.println("합계");
        System.out.print("이름 "  + name);
        System.out.print("국어 "  + korsum);
        System.out.print("\t" + "영어 " + engsum);
        System.out.print("\t" + "수학 " + mathsum);
        System.out.println("\n");
        System.out.println("평균");
        System.out.print("국어 "  + koravg);
        System.out.print("\t" + "영어 " + engavg);
        System.out.print("\t" + "수학 " + mathavg);
    }
}





