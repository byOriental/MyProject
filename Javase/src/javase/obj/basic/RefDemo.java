package javase.obj.basic;

/**
 * 一个人有一个小孩（小孩属于人），一个小孩有一本书（书属于人）
 * 
 * @Title:RefDemo
 * @Description:面向对象之一对一关系(重点掌握)
 * @author:Administrator
 * @date:2017年8月15日 下午10:24:36
 */

class Person11 {
	private String name;
	private int age;
	private Person11 child;// 属人这个类
	private Book book;

	public Person11(String name, int age) {
		this.setName(name);
		this.setAge(age);
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

	public void setAge(int age2) {
		this.age = age2;
	}

	public Person11 getChild() {
		return child;
	}

	public void setChild(Person11 child) {
		this.child = child;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}

class Book {
	private String title;
	private float price;
	private Person11 person;

	public Book(String title, float price) {
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Person11 getPerson() {
		return person;
	}

	public void setPerson(Person11 person) {
		this.person = person;
	}

}

public class RefDemo {

	public static void main(String[] args) {
		Person11 p1 = new Person11("oldman", 29);
		Person11 c1 = new Person11("childman", 7);// 定义一个孩子
		Book b1 = new Book("java", 88.8f);
		Book b2 = new Book("c++", 89.8f);
		p1.setChild(c1);// 一个人有一个孩子
		c1.setBook(b2);// 一个孩子有一本书
		b2.setPerson(c1);// 一本书属于一个人（这个孩子）
		p1.setBook(b1);// 一个人有一本书
		b1.setPerson(p1);// 一本书属于一个人

		// 从人找到书
		System.out.println("name:" + p1.getName() + "\nage：" + p1.getAge()
				+ "\ntitle:" + p1.getBook().getTitle() + "\nprice:"
				+ p1.getBook().getPrice());

		// 通过人找到孩子找到书
		System.out.println("name:" + p1.getName() + "\nage:" + p1.getAge()
				+ "\nchild：" + p1.getChild().getName() + "\nbook:"
				+ p1.getChild().getBook().getTitle());
	}

}
