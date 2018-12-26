package my.examples.javaexam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest04 {
    public static void main(String[] args){
    //1~45까지의 숫자를 순서대로 저장 = List
    //100번을 반복한후 랜덤한 위치의 값을 두개 꺼내서 (random)
    //2개의 값을 바꿔준다.
    //List의 값을 출력하는데 0~5번째 까지의 값을출력


List<Integer> list = new ArrayList<>();
for(int i= 1; i<=45; i++){
    //list.add(new Integer(i));
    list.add(i);
    }
//Math.random() 0.0 <= x < 1.0실수. ex>0.45234234
/*int index1 = 0;
int index2 = 0;
for(int i = 0; i<45;i++){
   index1 = (int)(Math.random() *45);
    index2 = (int)(Math.random() *45);
    if(index1 != index2){
        Integer tmp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,tmp);

        }

    }*/
        Collections.shuffle(list); // static 메소드
    for(int i=0; i<6;i++){
        System.out.print(list.get(i)+"\t");

    }
    System.out.println();
    }

}
