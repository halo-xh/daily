package FanXin;

//泛型类. 继承某个类的类
//public class classT<T extends methodE> {
//泛型类.
public class classT<T> {

    private T t;

    public void add(T t){
        this.t =t;
    }

    public T getT(){
        return t;
    }
}
