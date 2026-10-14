package Codegnan.HibernateDemo;

public class student {
	
	int sid;
	String sname;
	int age;
	
	public student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
