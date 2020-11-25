/**
 *  观察者模式:
 *      Definition: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are
 *                  notified adn updated automatically.
 *                  定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。
 *
 *      Roles:
 *              1. Subject 抽象主题，又被称为被观察者，可以增加和删除观察者对象。
 *              2. Observer 抽象观察者，观察者接口，收到通知更新状态。
 *              3. Concrete Subject: 实现 Subject
 *              4. Concrete Observer: 实现 Observer
 *
 *      Advantages:
 *              1. 观察者和被观察者之间是抽象耦合。 依赖倒置。
 *              2. 支持广播通信。
 *      Disadvantages:
 *              1.  通知所有观察者耗时，开发调试复杂。
 *              2. 有循环依赖则会循环调用。
 *              3. 如果是异步投递需要保证投递的顺序。
 *              4. 无法了解到被观察者是如何变化的。 ？？？
 *
 *
 */