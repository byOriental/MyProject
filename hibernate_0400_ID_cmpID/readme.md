1�������������ã�student��_xml��
    <composite-id name="pk" class="pkclass">
        <key-property name="lineId"/>
        <key-property name="orderId"/>
        <key-property name="customerId"/>
    </composite-id>
pk;[������������]
pkclass;[pojo��]
ͬʱpojo�����ʵ��Serializable�ӿڣ�
hashCode(),equals()����[Alt + Shift + S + H �������hashCode��equal����]��

2�������������ã�teacher��_annotation��
����1��������ǰд@Embeddable����ԭpojo��������ԡ�TercherPK����get����ǰд@ld
����2��@EmbeddedlD(*)������pojo�������ע�⣬ֻ����ԭpojo�������ԡ�TeacherPK����get����ǰд@EmbeddedlD����
����3��@Id  @IdClass(*)  ��pojo�������ע�⣬ԭpojo���id��name���Ա������䣬Ҳ����������TercherPK�����ԡ� 
ֻ��id��name��get����ǰ����@Id������ԭpojo��ǰ�ӡ�@IdClass(TeacherPK.class)��
--------����3��ӽ��������