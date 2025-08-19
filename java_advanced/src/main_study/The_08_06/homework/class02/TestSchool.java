package main_study.The_08_06.homework.class02;

import main_study.The_08_06.homework.class02.Employee;
import main_study.The_08_06.homework.class02.Student;
import main_study.The_08_06.homework.class02.Teacher;

public class TestSchool {
	
	public static void main(String[] args) {

		main_study.The_08_06.homework.class02.Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setId(200201);
		main_study.	The_08_06.homework.class02.Teacher t = new Teacher();
		t.setName("홍길동");
		t.setAge(30);
		t.setSubject("JAVA");
		main_study.	The_08_06.homework.class02.Employee e= new Employee();
		e.setName("홍길동");
		e.setAge(40);
		e.setDept("교무과");
		
		s.print();
		t.print();
		e.print();
	}

}
