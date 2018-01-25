slf4j日志框架配置；
关系：
slf4j-api.jar(接口)——slf4j-log4j.jar(转换器)——slf4j.jar(实现类)
在src目录下加入日志输出配置资源文件,约定俗称log4j.properties
最后将以上jar包加入即可。
-------------------------
Junit单元测试步骤
1、新建Source Folder源码目录创建包，包名与所测试的model类所在包一致
2、在右键包-New-Other-Junit-Junit Test Case
3、定义测试类名称，以及选择所测试的类

--------------------------------
注解
@Entity:
每一个POJO（Plain Ordinary Java Object）简单的Java对象，实际就是普通JavaBeans，用@Entity注解来声明

@Id
每一个POJO的标识属性(主键)

@Table(name = "_Teacher")
表示所持久化类名所映射表中的表名，不指定时，默认与POJO一致

@Column(name = "_name")
表示所持久化属性所映射表中的字段，不指定时，默认与POJO一致

@Enumerated(EnumType.STRING)
STRING 存储到数据库的是varchar类型
ORDINAL 存储到数据库的是int类型

@Temporal(TemporalType.DATE)
DATE 2016--09--28
TIME 15:50:30
TIMESTAMP 2016-09-28 15:52:32:000

@Transient
“透明”，指定字段不进行持久化（不存到数据库）

