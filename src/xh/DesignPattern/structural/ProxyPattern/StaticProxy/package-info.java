

/**
 *  ## 代理模式 ##
 *  definition: Provide a surrogate or placeholder for another object to control accss to it.
 *              - 为其他对象提供一种代理以控制对这个对象的访问。
 *  用到代理模式的其他模式： 状态模式 策略模式 访问者模式
 *  --------------------------------------------------
 *  Roles:
 *      1. Subject,抽象主题角色，代理类和真实主题共同接口
 *      2. Proxy Subject，代理类，负责创建 销毁 增强被代理对象。
 *      3. Real Subject，具体业务逻辑实现。
 *
 *
 */
