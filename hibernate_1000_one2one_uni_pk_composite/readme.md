一对一_单向_联合_关联主键

mappedBy：
1>只有OneToOne，OneToMany，ManyToMany上才有mappedBy属性，ManyToOne不存在该属性；
2>mappedBy标签一定是定义在被拥有方的，他指向拥有方；
3>mappedBy的含义，应该理解为，拥有方能够自动维护跟被拥有方的关系，当然，如果从被拥有方，通过手工强行来维护拥有方的关系也是可以做到的；
4>mappedBy跟joinColumn/JoinTable总是处于互斥的一方，可以理解为正是由于拥有方的关联被拥有方的字段存在，拥有方才拥有了被拥有方。mappedBy这方定义JoinColumn/JoinTable总是失效的，不会建立对应的字段或者表。


mappedBy定义在被拥有方-----定义在被拥有方-----定义在被拥有方----定义在被拥有方