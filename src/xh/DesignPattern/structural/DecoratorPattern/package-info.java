
/**
 *
 *  装饰模式
 *  definition: attach additional responsibilities to an object dunamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.
 *            动态地给一个对象添加一些额外的职责。就增加功能来说，比生成子类更加灵活。
 *   Roles:
 *      Component: 抽象构件，规范需要装饰的对象，即原始对象。
 *      Concrete Component：具体构件，实现抽象构件，定义一个需要装饰的原始类。
 *      Decorator: 装饰角色，持有构件对象的实例，并定义一个与抽象构件接口一致的接口。
 *      Concrete Decorator: 具体装饰角色，负责对构件对象进行装饰。
 *
 *
 *
 */