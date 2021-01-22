package com.flipkart.business;

import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constant.Gender;
import com.flipkart.constant.Role;

public class AdminBusiness {

	String userId;
	String emailId;
	String name;
	long mobile;
	Role role;
	Gender gender;
	
	AuthorCredentialSystemBusiness  credentialobj = new AuthorCredentialSystemBusiness();
	public  AdminBusiness ()
	{
		
	}
	public  AdminBusiness (String userId, String emailId, String name, long mobile, Role role, Gender gender)
	{
		 this.userId = userId; 
		 this.emailId = emailId; 
		 this.name = name; 
		 this.mobile = mobile;
		 this. role =  role;
		 this.gender = gender;
	}
	
	public void approvestudents()
	{
		Student studentone  = new Student("1","abhishek@gmail.com","Abhishek",9876511,Role.STUDENT,Gender.MALE,"1","EEE");
		credentialobj.approveStudent();
	}
	public void assignProfessor(Professor professor, int courseId) {
		try {
			adminDao.assignProfessor(professor, courseId);
		}catch(ProfessorNotFoundException ce) {
			logger.error(ce.getUsername() + "not found");
		}catch(Exception e) {
			logger.error(e);
		}
		}
		
	}
	public void registersadmin()
	{   
		new  AdminBusiness("100","rashmi@gmail.com","rashmi",85943241, Role.ADMIN,Gender.FEMALE);
		
	}
}
