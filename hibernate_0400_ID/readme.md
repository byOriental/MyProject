slf4j��־������ã�
��ϵ��
slf4j-api.jar(�ӿ�)����slf4j-log4j.jar(ת����)����slf4j.jar(ʵ����)
��srcĿ¼�¼�����־���������Դ�ļ�,Լ���׳�log4j.properties
�������jar�����뼴�ɡ�

/hibernate_0400_ID
1���Զ�����ID
student�ࣨxml)
a������student.hbm.xml�ļ���ָ��id���ɲ��ԣ�����ʹ��native/uuid/identity(orale������)/sequence
b����student����в��ԣ�ר�Ŵ���Դ���ļ��У�����ʱͬsrcһ��test,
c���Բ�����дJunit���Գ���studentTest.java�����в���

teacher��(annotation���ַ�������id)
a��@GeneratedValue  ��ͨ����id����
b��@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacherSEQ")�Զ�������id����
c��@SequenceGenerator


ʹ��native��
mysql Ĭ��auto_inrement
oracla Ĭ��hibernate_sequence��create sequence hibernate_sequence start with 1 increment by 1��
(xml����Oracle,���ҽ������������뿪������)

Navicat����Oracle;
��Navicat��ѡ�񹤾ߡ�ѡ���������OCI��Ȼ������OCI libraryΪ��E:\app\Administrator\product\11.2.0\client_1\BIN\oci.dll��ȷ����������������Oracle���ݿ⡣