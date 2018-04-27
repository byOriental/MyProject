成功部署。
开始写后台-级联问题，N+1问题

问题：
1、项目中getCurrentSession不能拿到连接，更换openSession可以
2、由逆向工程完成数据库到代码生成，会出现逆向工程步骤中找不到当前项目，解决办法为展开选项"install hibernate facets",重新生成hibernate配置文件，然后将数据表对应model包下已经存在的
pojo对象和对应的xml配置文件删除即可。
