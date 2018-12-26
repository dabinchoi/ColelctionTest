package student;

import java.util.Iterator;

public class StudentExam {
    public static void main(String[] args) {
        StudentUI studentUI = new StudentUI();
        StudentManager studentManager = new StudentManager();
        while(true){
            Student student = studentUI.inputStudent();
            studentManager.addStudent(student);
            String result = studentUI.inputContinue();
            if("y".equals(result.toUpperCase())){
                continue;
            }else{
                break;
            }
        }

        Iterator<Student> iterator = studentManager.iterator();
        while(iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student.getName());
            System.out.println("\t");
            System.out.println(student.getKor());
            System.out.println("\t");
            System.out.println(student.getMath());
            System.out.println("\t");
            System.out.println(student.getEng());

        }
        System.out.println(studentManager.getKorTotal());
        System.out.println("\t");
        System.out.println(studentManager.getMathTotal());
        System.out.println("\t");
        System.out.println(studentManager.getEngTotal());

        System.out.println(studentManager.getKorAvg());
        System.out.println("\t");
        System.out.println(studentManager.getMathAvg());
        System.out.println("\t");
        System.out.println(studentManager.getEngAvg());
    }
}
