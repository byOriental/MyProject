多对多双向关联

有两种写法：
1.在注解@manytomany后写mappedby指定主控方与被控方的关系。
2.在两边都写为“主控方”，即配置注解@JoinTable，只是joinColumns和inverseJoinColumns属性的地方互换就可以了