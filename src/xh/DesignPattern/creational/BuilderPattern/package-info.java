/**
 *
 *
 *
 * definition: 将一个复杂对象的构建与表示分离，是的同样的构建过程可以创建不同的表示。
 *
 * roles:   1. Builder,抽象建造者，用于规范产品的各个组成部分，并进行抽象，一般独立于应用程序逻辑。
 *          2. Concrete Builder, 具体建造者，实现抽象建造者，返回产品实例。
 *          3. Product, 需要构建的复杂对象。
 *          4. Director， 导演者，负责安排已有模块的顺序，告Builder开始建造。 起到封装作用，避免高层模块深入到建造者内部实现类。
 *
 *
 */
 package DesignPattern.creational.BuilderPattern;
