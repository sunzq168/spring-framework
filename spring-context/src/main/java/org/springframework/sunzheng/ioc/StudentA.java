package org.springframework.sunzheng.ioc;

public class StudentA {
	private StudentB studentB;

	public StudentA(StudentB studentB) {
		this.studentB = studentB;
	}
}
