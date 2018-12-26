package my.examples.javaexam.mywork;

import my.examples.javaexam.Student;

import java.util.*;

public class StudentsExam {
    public static void main(String[] args) {

        Students s1 = new Students("dabin", 100, 50, 44);
        Students s2 = new Students("jungjin", 80, 30, 70);
        Students s3 = new Students("sunghun", 70, 60, 20);

        List<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);


            System.out.println("------------name-----------------");
              Collections.sort(list);
              for(Students students : list) {
                  System.out.println(students);
              }
                System.out.println("-----------kor---------------");
                Collections.sort(list,new KorComparator());
                for(Students students : list){
                    System.out.println(students);
                }
        System.out.println("-----------eng---------------");
        Collections.sort(list,new EngComparator());
        for(Students students : list){
            System.out.println(students);
        }
        System.out.println("-----------math---------------");
        Collections.sort(list,new MathComparator());
        for(Students students : list){
            System.out.println(students);
        }



    }

    }

   class KorComparator implements Comparator<Students> {
        @Override
        public int compare(Students o1, Students o2) {
            return o1.getKor() - o2.getKor();
        }
    }
class EngComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getEng() - o2.getEng();
    }
}
class MathComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getMath() - o2.getMath();
    }
}