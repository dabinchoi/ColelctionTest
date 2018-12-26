package my.examples.javaexam;

public class ObjectBox {
    private Object obj; // 필드

    public void set(Number obj){
        this.obj = obj;
    }

    public Object get(){
        return obj;
    }
}

// 아무것도 상속받지 않으면 자동으로 Object를 상속받는다.
// public class ObjectBox
// public class ObjectBox extends Object
// Object obj = new ObjectBox(); ( O )


//아무것도 상속받지 않으면 자동으로 Object를 상속받는다.
//public class ObjectBox
//public class ObjectBox extends Object
// Object obj = new ObjectBox();  (O)   왜 되는가?
//참조타입은 부모나 조상 타입이 올수있다.