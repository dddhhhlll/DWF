# DWF
visualization work flow
## 主要功能
实现对若干工作流引擎兼容的工作流客户高度可用管理工具。
## 现阶段工作
完成一个基于 spring boot 框架 的简易web平台
:)happy every day
***
## 主要模块
![结构图](./WF%E6%95%B0%E6%8D%AE%E6%B5%81%E5%9B%BE.png)
* #### [分布式同步模块](https://github.com/dddhhhlll/DWF/projects/1 "分布式同步模块")
实现可适配 *es* *zookeeper* *redis* *mysql* 等组件的*分布式锁*、
*分布式取值*、*分布式赋值*等功能。
* #### [配置模块](https://github.com/dddhhhlll/DWF/projects/2 "配置模块")
配置功能主要依赖spring boot的**config**功能也能通过端口接收外部配置对象的配置能力
* #### [分布式自感知模块/工作流事件路由模块](https://github.com/dddhhhlll/DWF/projects/3 "分布式自感知模块")
通过配置 spring cloud 发现服务（zookeeper/eureka 等）同服务相互定时刷新发现
并在接收到工作流请求时，根据同步锁判断工作流是否在某个服务上整等待参数，并根据发现的
服务将请求路由到对应的服务上
* #### [工作流适配器模块](https://github.com/dddhhhlll/DWF/projects/4 "工作流适配器模块")
根据配置的工作流引擎生成对应适配器对象去对接工作流引擎，也可能甩到外面独立成一个类似 JDBC driver 一样得驱动插件。
* #### [工作流事件处理模块](https://github.com/dddhhhlll/DWF/projects/5 "工作流事件处理模块")
根据配置实现工作流事件的分发
* #### [表单\工单\数据单管理模块](https://github.com/dddhhhlll/DWF/projects/6 "表单管理模块")
实现表单或着数据集的序列化存储和可视化编辑
* #### [版本控制模块](https://github.com/dddhhhlll/DWF/projects/7 "版本控制模块")
主要是面向工作流 和 表单 的版本控制
* #### [工作流监控模块](https://github.com/dddhhhlll/DWF/projects/8 "工作流监控模块")
监控在工作流引擎中的工作流实例的状态
