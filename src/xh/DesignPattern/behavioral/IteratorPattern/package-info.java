/**
*   迭代器模式
*       Definition: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
*                   提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节。
*
*       Roles:
*           Iterator: 抽象迭代器，负责定义访问和变量元素的接口。
*           Concrete Iterator: 实现Iterator 接口，完成容器元素的遍历。
*           Aggregate: 抽象聚集角色，提供创建迭代器角色的接口。
*           Concrete Aggregate: 具体聚集角色，实现抽象聚集接口，创建出容纳迭代器的对象。
*
*       Advantages:
*           1. 简化了访问容器元素的操作，具备一个统一的遍历接口。
*           1. 封装遍历算法，算法独立于聚集角色。
*       DisAdvantages:
*           1.给使用者一个序列化的错觉。
*
*/