package my.examples.javaexam.my;

import my.examples.javaexam.fw.Action;

public class MyAction extends Action {
    //Action이 가지고 있는 추상 메소드를 구현한다.

    @Override
    protected void service() {
        System.out.println("service");
    }
}
