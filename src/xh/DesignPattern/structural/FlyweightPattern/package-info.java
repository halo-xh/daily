/**
* Flyweight Pattern 享元模式
*
* Definition: Use sharing to support large numbers of fine-grained objects efficiently.
*            使用共享对象可有效地支持大量的细粒度的对象。
*
*        享元模式是以共享的方式高效地支持大量的细粒度对象，享元对象能做到共享的关键是区分内部状态和外部状态。
*        内部状态: 存储在享元对象内部的、可以共享的信息，且不会随环境改变而改变。
*        外部状态: 随环境改变而改变且不可以共享的状态。享元对象的外部状态必须由客户端保存，并在享元对象被创建之后，
*                 在需要使用的时候再传入到享元对象内部。
*   Roles:
*           Flyweight: 抽象享元角色, 该角色对享元类进行抽象，需要外部状态的操作可以通过参数的形式将外部状态传入。
*           ConcreteFlyweight: 具体享元角色, 该角色实现抽象享元定义的业务，注意享元对象的内部状态必须与环境无关，从而使得享元对象可以在系统内共享。
*           FlyweightFactory: 享元工厂, 该角色构造一个池容器，负责创建和管理元角色，并提供从池容器中获得对象的方法，保证享元对象可以被系统适当的共享。
*                               当一个客户端对象请求一个享元对象时，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象。如果已经有了，享元工厂
*                               则提供这个已有的对象，否则创建一个合适的享元对象。
*           Client: 客户端角色，该角色需要自信存储所有享元对象的外部状态。
*
*
*
*/