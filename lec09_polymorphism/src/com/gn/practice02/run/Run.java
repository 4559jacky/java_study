package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		SchoolMember[] arr = new SchoolMember[3];
		arr[0] = new Student();
		arr[1] = new Teacher();
		arr[2] = new Staff();
		
		for(SchoolMember sm : arr) {
			sm.introduce();
			if(sm instanceof Student) {
				((Student) sm).study();
			} else if(sm instanceof Teacher) {
				((Teacher) sm).teach();
			} else if(sm instanceof Staff) {
				((Staff) sm).work();
			}
		}
	}
}
