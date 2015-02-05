package com.leo.demo;

public class Demo {

	public static void main(String[] args) {
		ProgramerWorkDay programerWorkDay = new ProgramerWorkDay("程序猿");
		TesterWorkDay testerWorkDay = new TesterWorkDay("测试");
		ManagerWorkDay managerWorkDay = new ManagerWorkDay("经理");
		
		programerWorkDay.workPlan();
		System.out.println("----------------------------");
		testerWorkDay.workPlan();
		System.out.println("----------------------------");
		managerWorkDay.workPlan();
		
	}

}
