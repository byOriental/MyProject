slf4j日志框架配置；
关系：
slf4j-api.jar(接口)——slf4j-log4j.jar(转换器)——slf4j.jar(实现类)
在src目录下加入日志输出配置资源文件,约定俗称log4j.properties
最后将以上jar包加入即可。
-------------------------
Junit单元测试步骤
1、采用maven模式，新建Source Folder源码目录创建包，包名与所测试的model类所在包一致
2、在右键包-New-Other-Junit-Junit Test Case
3、定义测试类名称，以及选择所测试的类