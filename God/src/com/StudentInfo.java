package com;

public class StudentInfo {

	int id;
	String name;
	
	public StudentInfo getStudentInfoById(int id) throws StudentNotFoundException {
		
		if(id > 500) {
			throw new StudentNotFoundException("Their is no student info with ID : "+id);
		}
		StudentInfo info = new StudentInfo();
		info.id = id;
		info.name = "student name";
		
		return info;
		
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		
		StudentInfo info = new StudentInfo();
		StudentInfo info1 = null;
		StudentInfo info2 = null;
		StudentInfo info3 = null;
		StudentInfo info4 = null;
		
		StudentInfo[] s = {info, info1, info2};
		
		try {
			info1 = info.getStudentInfoById(200);
			 info2 = info.getStudentInfoById(210);
			 info3 = info.getStudentInfoById(510);
			 info4 = info.getStudentInfoById(5);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(info1);
		System.out.println(info2);
		System.out.println(info3);
		System.out.println(info4);
		
		
	}
}
