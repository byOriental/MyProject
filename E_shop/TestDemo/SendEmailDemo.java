import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailDemo {

	public static void main(String[] args) throws Exception {

		// 1. ��½�ʼ��ͻ���(�����Ựsession)
		Properties prop = new Properties();
		prop.setProperty("mail.transport.protocol", "smtp");
		// ������session�Ự
		Session session = Session.getDefaultInstance(prop);
		// ����debugģʽ�����Է�����Ϣ
		session.setDebug(true);
		// ����һ���ʼ�����
		Message message = new MimeMessage(session);
		// д��
		message.setSubject("��ӭ�����ҵ�CSDN������ҳ��");
		// ��������
		message.setContent("��ӭ�����ҵ�CSDN������ҳ��http://blog.csdn.net/eson_15"
				+ "��ôô��~", "text/html;charset=utf-8");
		// �����˵�ַ
		message.setFrom(new InternetAddress("baichangling@126.com"));
		Transport transport = session.getTransport();
		// �����ʼ�����������֤��Ϣ
		transport.connect("smtp.126.com", "nishengwus", "xxxxx����");
		// �����ռ��˵�ַ���������ʼ�
		transport
				.sendMessage(message,
						new InternetAddress[] { new InternetAddress(
								"839563776@qq.com") });
		transport.close();
	}
}
