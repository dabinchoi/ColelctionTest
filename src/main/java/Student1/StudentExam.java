package Student1;

import java.util.Iterator;

public class StudentExam {
    public static void main(String[] args) {
        StudentUI studentUI = new StudentUI();
        StudentManager studentManger = new StudentManager();
        while(true){
            Student student = studentUI.inputStudent();
            studentManger.addStudent(student);
            String result = studentUI.inputContinue();
            if("y".equals(result.toUpperCase())){
                continue;
            }else{
                break;
            }
        }
        Iterator<Student> iterator = studentManger.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName());
            System.out.println("\t");
            System.out.println(student.getKor());
            System.out.println("\t");
            System.out.println(student.getMath());
            System.out.println("\t");
            System.out.println(student.getEng());
        }

        System.out.println();
    }
}
