/**
 *
 *  Composite Pattern  组合模式
 *  --------------------------
 *
 *  definition: Compose objects into tree structures to represent part-whole hierarchies.
 *             Composite lets clients treat individual objects and compositions of objects uniformly.
 *            将对象组合成树形结构以表示 "部分 -- 整体" 的 层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 *    Roles:
 *         Component:抽象构件，定义参加组合对象共有的方法和属性，规范一些默认行为接口。
 *         Leaf: 叶子构件，该角色是叶子对象，其下没有其他分支，定义出参加组合的原始对象的行为。
 *         Composite: 树枝构件，该角色代表参加组合的、其下有分支的树枝对象，它的作用是将树枝和叶子组合成一个树形结构，
 *                  并定义出管理子对象的方法，如 add(),remove() 等。
 *
 *    Advantages:
 *          1. 高层模块调用简单。一棵树形结构中所有的节点都是Component，局部和整体对调用者来说没有任何区别，简化高层模块代码，
 *                               即，高层不必关心处理的是单个对象还是整个组合结构。
 *           2. 节点自由增加。 使用组合模式后，如果想增加一个树枝节点、树叶节点只需要找到其父节点即可。
 *
 *    Disadvantages: 1. 不易控制树枝构件的类型；
 *                   2. 不易使用继承的方法来增加新的行为。
 *
 *
 *    使用场景:
 *         1. 需要描述对象的部分和整体的等级结构，如树形菜单、文件和文件夹管理
 *         2. 需要客户忽略个体构件和组合构件的区别，平等对待所有的构件
 *
 *     示例: swing , JComponent.
 *
 *
 *
 *
 *
 *
 *
 */
package DesignPattern.structural.CompositePattern;
