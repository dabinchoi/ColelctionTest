
package my.examples.javaexam;

public class Exam07 {
    public static void main(String[] args){
        GenericBox<Integer> box = new GenericBox<>();//Integer타입으로 가상의 타입을 쓰겠다.
        box.set(new Integer(5));
        Integer int1 = box.get();
        System.out.println(int1.toString());
    }
}