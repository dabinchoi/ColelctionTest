package my.examples.javaexam;

public class GenericBox<T> { //<T> <-- 제네릭타입:타입이 결정안된것
    private T obj;
    public void set(T obj){
        this.obj = obj;
    }
    public T get(){
        return obj;
    }
}
