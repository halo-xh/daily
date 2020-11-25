package Copy;

// 深拷贝： 会拷贝对象
public class DeepClone implements Cloneable {

    ShallowCopy shallowCopy;

    public DeepClone(ShallowCopy shallowCopy) {
        this.shallowCopy = shallowCopy;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone =null;
        deepClone = (DeepClone) super.clone();
        deepClone.shallowCopy = (ShallowCopy) shallowCopy.clone();//?这里是深clone??????还是说shallowCopy也要实现深拷贝
        return deepClone;
    }
}
//todo. 序列化与反序列化重建对象是深拷贝
