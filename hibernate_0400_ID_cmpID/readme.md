1、联合主键配置（student类_xml）
    <composite-id name="pk" class="pkclass">
        <key-property name="lineId"/>
        <key-property name="orderId"/>
        <key-property name="customerId"/>
    </composite-id>
pk;[联合主键名称]
pkclass;[pojo类]
同时pojo类必须实现Serializable接口，
hashCode(),equals()方法[Alt + Shift + S + H 生成类的hashCode和equal方法]。

2、联合主键配置（teacher类_annotation）
方法1：在新类前写@Embeddable，在原pojo类的新属性“TercherPK”的get方法前写@ld
方法2：@EmbeddedlD(*)——新pojo类无需加注解，只需在原pojo类新属性“TeacherPK”的get方法前写@EmbeddedlD即可
方法3：@Id  @IdClass(*)  新pojo类无需加注解，原pojo类的id，name属性保留不变，也无需新增“TercherPK”属性。 
只在id，name的get方法前都加@Id，并在原pojo类前加“@IdClass(TeacherPK.class)”
--------方法3最接近面向对象