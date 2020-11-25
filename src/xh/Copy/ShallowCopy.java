package Copy;


//浅拷贝 。 默认浅拷贝。？
public class ShallowCopy implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ShallowCopy)super.clone();
    }
}
