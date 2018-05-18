package javase.cls.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentMore {
	private String name;
	private int age;
	private List<Course> allCourse;

	public StudentMore() {
		this.allCourse = new ArrayList<Course>();
	}

	public StudentMore(String name, int age) {
		this();
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

	public List<Course> getAllcourse() {
		return allCourse;
	}

	public void setAllcourse(List<Course> allcourse) {
		this.allCourse = allcourse;
	}

	public String toString() {
		return this.getName() + "、";
	}
}

class Course {
	private String name;
	private int credit;// 课程学分
	private List<StudentMore> allStudents;

	public Course() {
		allStudents = new ArrayList<StudentMore>();
	}

	public Course(String name, int credit) {
		this();
		this.name = name;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<StudentMore> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(List<StudentMore> allStudents) {
		this.allStudents = allStudents;
	}

	public String toString() {
		return "课程：" + this.getName() + "学分" + this.getCredit();
	}
}

public class MoreToMoreCase {

	public static void main(String[] args) {
		StudentMore st1 = new StudentMore("吴舒", 25);
		StudentMore st2 = new StudentMore("孙智慧", 23);
		StudentMore st3 = new StudentMore("张丽莎", 26);
		StudentMore st4 = new StudentMore("xxx", 22);

		Course c1 = new Course("计算机网络", 4);
		Course c2 = new Course("c程序设计", 4);
		// 多对多双向处理关系（一门课程有多个学生参加&每个学生参加一门课程）
		c1.getAllStudents().add(st1);
		c1.getAllStudents().add(st2);
		c1.getAllStudents().add(st3);
		st1.getAllcourse().add(c1);
		st2.getAllcourse().add(c1);
		st3.getAllcourse().add(c1);

		System.out.println(c1);
		Iterator<StudentMore> it = c1.getAllStudents().iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

}
