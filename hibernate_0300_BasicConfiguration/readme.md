slf4j��־������ã�
��ϵ��
slf4j-api.jar(�ӿ�)����slf4j-log4j.jar(ת����)����slf4j.jar(ʵ����)
��srcĿ¼�¼�����־���������Դ�ļ�,Լ���׳�log4j.properties
�������jar�����뼴�ɡ�
-------------------------
Junit��Ԫ���Բ���
1���½�Source FolderԴ��Ŀ¼�������������������Ե�model�����ڰ�һ��
2�����Ҽ���-New-Other-Junit-Junit Test Case
3��������������ƣ��Լ�ѡ�������Ե���

--------------------------------
ע��
@Entity:
ÿһ��POJO��Plain Ordinary Java Object���򵥵�Java����ʵ�ʾ�����ͨJavaBeans����@Entityע��������

@Id
ÿһ��POJO�ı�ʶ����(����)

@Table(name = "_Teacher")
��ʾ���־û�������ӳ����еı�������ָ��ʱ��Ĭ����POJOһ��

@Column(name = "_name")
��ʾ���־û�������ӳ����е��ֶΣ���ָ��ʱ��Ĭ����POJOһ��

@Enumerated(EnumType.STRING)
STRING �洢�����ݿ����varchar����
ORDINAL �洢�����ݿ����int����

@Temporal(TemporalType.DATE)
DATE 2016--09--28
TIME 15:50:30
TIMESTAMP 2016-09-28 15:52:32:000

@Transient
��͸������ָ���ֶβ����г־û������浽���ݿ⣩

