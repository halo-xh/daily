/**
*
*   模板方法:
*   Definition: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
*               Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
*               定义一个操作中的算法的框架，而将一些步骤延迟到子类中。是的子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
*
*   Roles:
*       Abstract template: 抽象模板，该角色定义一个或多个抽象操作，以便让子类实现；这些抽象操作是基本操作，是一个顶级逻辑的组成步骤。还
*                           需要定义并实现一个或几个模板方法，这些模板方法一般是具体方法，即一个框架，实现对基本方法的调度，完成固定的逻辑。
*       Concrete template: 具体模板，实现抽象模板中定义的一个或多个抽象方法，每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每个具体
*                          模板都可以给出这些抽象方法的不同实现，从而使得顶级逻辑的实现各不相同。
*
*   Advantages:
*          1. 封装不变的部分，扩展可变部分。
*          2. 提取公共部分代码，便于维护。
*          3. 行为由父类控制，子类实现。
*
*   使用场景:
*           1. 多个子类有公共方法，并且逻辑基本相同时。
*           2. 可以把重要的，复杂的，核心算法设计为模板方法，周免的相关细节功能则由各个子类实现。
*           3. 重构时，模板方法模式是一个经常使用的模式，将相同的代码抽取到父类中。
*
*
*
*
*
*
*
*
*
*
*/