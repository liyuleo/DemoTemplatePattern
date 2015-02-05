package com.leo.demo;

public abstract class WorkDay {
	protected String mName;
	public WorkDay(String name) {
		mName = name;
	}

	public final void workPlan(){
		
		enterCompany();
		work();
		exitCompany();
	}
	
	void enterCompany(){
		System.out.println(mName+"来到公司");
		if(hook()){
			System.out.println(mName+"最早来到公司");
		}
	}
	
	
	void exitCompany(){
		System.out.println(mName+"离开公司");
		if(hook()){
			System.out.println(mName+"最晚离开公司");
		}
	}
	
	abstract void work();
	abstract boolean hook();
}
