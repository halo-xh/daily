

/**
 * Created by Xiao Hong on 2020-07-16
 *
 * 工厂方法模式
 *
 * 组成：
 *  1.抽象工厂 A
 *  2.抽象产品 C
 *  3.抽象工程的实现 B
 *  4.抽象产品的实现 D
 *  ps: 其中 B 和 D 是对应的。
 *
 * 应用：
 *  A a = new B;
 *  C c = a.create;
 *  c.method;
 *
 *
 */
package DesignPattern.creational.FactoryMethodPattern;
