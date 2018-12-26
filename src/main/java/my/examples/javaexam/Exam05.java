package my.examples.javaexam;

public class Exam05 {
    public static void main(String[] args){
        Box box = new Box();
        Item item1 = new Item();    //new Item
        item1.x = 100;
        item1.y = 300;



        box.add(item1);
        Item i = box.get();
        System.out.println(i.x);
        System.out.println(i.y);


    }
}

// 결과가 왜 이렇게 나오는가?// i가 참조하는 것은 무엇인가? 기 이유를 설명하시오.