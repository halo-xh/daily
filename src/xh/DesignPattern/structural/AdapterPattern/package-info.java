
/**
 * 适配器模式 Adapter Pattern
 * definition: Convert the interface of a class into another interface clients expect. Adapter lets classes work together
 *              that couldn't otherwise because of incompatible interface.
 *  将一个类的接口变换成客户端所期待的另一种，从而使原本因接口不匹配无法在一起工作 的两个类能够一起工作。
 *
 * Roles:
 *      Target: 定义要转换的目标接口
 *      Adaptee: 需要被转换成目标角色的源角色
 *      Adapter: 适配器橘色，通过继承或是类关联的方式将源角色转换成目标角色。
 *
 * Advantages:
 *      1.让没有关系的类一起运行
 *      2.增加类的透明性
 *      3.提高类的复用性
 *      4.增强代码灵活性
 *      ....
 *
 *
 *
 */
package DesignPattern.structural.AdapterPattern;