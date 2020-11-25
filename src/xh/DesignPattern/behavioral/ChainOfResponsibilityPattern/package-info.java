/**
*   责任链模式 纯
*   Definition: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to
*               handle the request. Chain the receiving objects and pass the request along the chain until an object
*               handles it.
*               使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象，连成一条链，并沿着这条链传递该请求，
*               直到有对象处理为止。
*
*       Roles:
*           1. Handler: 抽象处理角色，该角色对请求进行抽象，并定义一个方法以设定和返回对下一个处理者的引用。
*           2. Concrete Handler: 具体处理者角色，该角色接到请求后，可以选择将请求处理掉，或者将请求传给下一个处理者。由于具体处理者持有对下一个
*             处理者的引用，因此，如果需要，具体处理者可以访问下一个处理者。
*
*       Advantages:
*           1. 将请求和处理分开，请求者不知道是谁处理的，处理者不用知道请求的全貌。
*           2. 提高系统灵活性
*
*       DisAdvantages:
*           1. 降低程序性能，每个请求都是从链头遍历到链尾，当链比较长的时候，性能大幅下降。
*           2. 不易调试，采用类似递归的方式，调试的时候逻辑比较复杂。
*
*       使用场景:
*           1. 一个请求需要一系列的处理。 SpringMVC? Filter? Security?
*           2. 业务流的处理，如文件审批
*           3. 对系统进行补充扩展
*
*
*/