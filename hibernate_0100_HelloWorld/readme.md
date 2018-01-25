slf4j日志框架配置；
关系：
slf4j-api.jar(接口)——slf4j-log4j.jar(转换器)——slf4j.jar(实现类)
在src目录下加入日志输出配置资源文件,约定俗称log4j.properties
最后将以上jar包加入即可。