/**
 *  桥梁模式 Bridge Pattern ('使用频率不高' todo. why)
 *   Definition: Decouple an abstraction from its implementation so that the two can vary independently.
 *              将抽象和实现解耦 是的两者可以独立变化
 *   Roles:
 *          1. Abstraction: 抽象化角色，该角色抽象化的给出定义，并保存一个对实现化对象的引用。
 *          2. Implementor: 实现化角色，该角色给出实现化角色的接口，但不给出具体的实现。
 *          3. RefinedAbstraction: 修正抽象化角色，该角色扩展抽象化角色，引用实现化角色并对抽象化角色进行修正。
 *          4. ConcreteImplementor: 具体实现化角色，该角色对实现化角色接口中的方法进行具体实现。
 *
 *   Advantages:
 *          1. 抽象和实现分离是桥梁模式的主要特点，是为了解决继承的缺点而提出的设计模式。在该模式下，实现可以不受抽象的约束，
 *              不用绑定在一个固定的抽象层次上。
 *          2. 实现对客户透明，客户端不用关心细节的实现，他已经由抽象层通过聚合关系完成封装。
 *          3. 提高灵活性和扩展性。
 *
 *   就是依赖倒置原则的体现？ 高层依赖抽象 细节依赖抽象？
 *
 *
 *
 *
 *
 *
 */