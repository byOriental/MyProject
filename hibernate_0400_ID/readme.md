slf4j日志框架配置；
关系：
slf4j-api.jar(接口)——slf4j-log4j.jar(转换器)——slf4j.jar(实现类)
在src目录下加入日志输出配置资源文件,约定俗称log4j.properties
最后将以上jar包加入即可。

/hibernate_0400_ID
1、自动生成ID
student类（xml)
a、配置student.hbm.xml文件，指定id生成策略，多数使用native/uuid/identity(orale不能用)/sequence
b、对student类进行测试，专门创建源码文件夹（编译时同src一起）test,
c、对测试类写Junit测试程序studentTest.java，进行测试

teacher类(annotation三种方法生成id)
a、@GeneratedValue  普通生成id策略
b、@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacherSEQ")自定义生成id策略
c、@SequenceGenerator


使用native；
mysql 默认auto_inrement
oracla 默认hibernate_sequence（create sequence hibernate_sequence start with 1 increment by 1）
(xml配置Oracle,并且将其驱动程序导入开发环境)

Navicat配置Oracle;
打开Navicat，选择工具→选项→其他→OCI，然后设置OCI library为：E:\app\Administrator\product\11.2.0\client_1\BIN\oci.dll，确定后重启进行连接Oracle数据库。