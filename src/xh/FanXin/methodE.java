package FanXin;

import java.util.List;

//泛型方法
public class   methodE<E> {

    public static<E> void printArray(E[] arr){
        for (E e: arr) {
            System.out.println(e);
        }

    }

    public<S> void printArray2(S[] arr){
        //随便
    }

    public void print(List<E> aa){
        System.out.println(aa.toString());
    }


}
