/**
*   中介者模式
*       definition: Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping
*                   objects from referring to each other explicitly, and it lets you vary their interaction independently.
*               用一个中介对象封装一系列对象（同事）的交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变他们之间地交互。
*
*       Roles:
*              1. Mediator, 抽象中介者，定义出同事对象到中介者对象的统一接口，用于各同事角色之间的通信。
*              2. Concrete Mediator, 具体中介者，该角色实现抽象中介者，它依赖于各个同事角色，并通过协调各同事角色实现协作行为。
*              3. Colleague 抽象同事，定义出中介者到同事对象的接口，同事对象只知道中介者而不知道其余的同事对象。
*              4. Concrete Colleague 具体同事，每一个具体同事类都清楚自己在小范围内的行为，而不知道大范围内的目的。
*
*       Advantages:
*              1. 减少类间的依赖，将原来一对多的依赖变成一对一的依赖，使得对象之间的关系更容易维护。
*              2. 避免同事对象之间的过度耦合，同事类只依赖与中介者，使同事类更容易被复用，中介类和同事类可以相对独立地演化。
*              3. 中介模式将对象地行为和协作抽象化，将对象在小尺度地行为上与其他对象地相互作用分开处理，
*
*       Disadvantages:
*             1. 降低了同事类地复杂性但是增加了中介类二点复杂性。
*             2. 中介类充满了协调代码，不可复用。
*
*
*
*/