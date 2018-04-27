成功部署。
开始写后台-Struts2和Json的整合　， 显示 category集合于DataGrid中
出现问题；
json-lib-2.4包中的两个jar文件commons-lang-2.5和commons-logging-1.1.1与原来lib下
的同名jar冲突，出现异常；
信息: Illegal access: this web application instance has been stopped already.…………
解决办法是去掉commons-lang-2.5和commons-logging-1.1.1包，将剩下的加入到lib中，问题得到解决。

