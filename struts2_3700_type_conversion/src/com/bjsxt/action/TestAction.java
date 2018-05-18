package com.bjsxt.action;

import java.awt.Point;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	// 常用类型转换_所有输出到前台页面的字符都被转换为字符串
	private String name;
	private int age;
	private Date d;
	Set<String> interests;// xxx/test?interests=chinese&interests=math
	Map<String, String> users;// xxx/test?users['a']=aaa&users['b']=bbb
	Point p;// xxx/test?p=2,3

	List<Point> ps;// xxx/test?ps=2,0&ps=5,6
	Map<String, Point> points;// xxx/test?points['a']=5,6&points['b']=8,9

	@Override
	public String execute() throws Exception {

		return super.execute();
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

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public Set<String> getInterests() {
		return interests;
	}

	public void setInterests(Set<String> interests) {
		this.interests = interests;
	}

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public List<Point> getPs() {
		return ps;
	}

	public void setPs(List<Point> ps) {
		this.ps = ps;
	}

	public Map<String, Point> getPoints() {
		return points;
	}

	public void setPoints(Map<String, Point> points) {
		this.points = points;
	}

}
