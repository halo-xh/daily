/**
 * Facade Pattern (外观模式)
 * Definition: Provide a unified interface to a set of interfaces in a subsystem.
 *              Facade defines a higher-level interface that makes the subsystem easier to use.
 *          要求一个子系统的外部与其内部通信必须通过一个统一的对象进行。外观模式提供一个高层次的接口，使得子系统更易使用。
 *
 *  Roles:
 *          Facade: 外观角色。客户端可以调用该角色的方法，该角色知道相关子系统的功能和责任。正常情况下，本角色会将所有从客户端发来的
 *                  请求委派到相应的子系统，即该角色没有实际的业务逻辑，只是一个委托类。
 *
 *          Subsystem: 子系统角色。可以同时有一个或多个子系统，每一个子系统都不是一个单独的类，而是一个类的集合。
 *                      子系统不知道外观角色的存在，对于子系统而言，外观角色仅仅是另外一个客户端而已。
 *
 *  Advantages:
 *          1. 减少子系统的相互依赖
 *          2. 提高安全性，只可以访问Facade中暴露的方法
 *
 *   DisAdvantage: 不符合开闭原则。
 *
 *
 */