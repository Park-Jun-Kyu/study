import java.util.Collection;

public class Student implements Collection<Student>  {
int hak_num;
String name;
int total;

Student(){}
Student(int hak_num,String name,int total){
	this.hak_num = hak_num;
	this.name = name;
	this.total = total;
}

public String toString() {
	
	return "�й� :" +hak_num+"�̸� :"+name+"���� :"+total;
}
public int compareTo(Student s) {
	return this.name.compareTo(s.name);
}
	
	
}
