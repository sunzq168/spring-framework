package org.springframework.sunzheng.ioc;

public class StudentB {
	private StudentA studentA;

	public StudentB(StudentA studentA) {
		this.studentA = studentA;
	}
}
