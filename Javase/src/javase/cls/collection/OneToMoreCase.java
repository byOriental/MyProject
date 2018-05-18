package javase.cls.collection;

/**
 * this()调用本类构造方法以及本类属性、super调用父类构造方法以及本类属性
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	private String name;
	private int age;
	private School school;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}

class School {
	private String name;
	private List<Student> student;

	public School() { // 无参构造方法
		this.student = new ArrayList<Student>();
	}

	public School(String name) {// 有参构造方法
		this();// 调用本类构造方法
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public String toString() {
		return this.name;
	}

}

public class OneToMoreCase {
	public static void main(String[] args) {
		School sch = new School("哈佛大学");
		Student s1 = new Student("武城", 19);
		Student s2 = new Student("诚挚", 26);
		Student s3 = new Student("刘成", 30);
		Student s4 = new Student("张明", 27);

		sch.getStudent().add(s1);
		sch.getStudent().add(s2);
		sch.getStudent().add(s3);
		sch.getStudent().add(s4);
		s1.setSchool(sch);
		s2.setSchool(sch);
		s3.setSchool(sch);
		s4.setSchool(sch);
		System.out.println(sch);
		Iterator<Student> itr = sch.getStudent().iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Student st = itr.next();
			System.out.println("姓名：" + st.getName() + "----年龄：" + st.getAge());
		}

	}

}
