package com.leo.demo;

public class ProgramerWorkDay extends WorkDay {

	public ProgramerWorkDay(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(mName+"开始工作：写代码&&修复Bug");
	}

	@Override
	boolean hook() {
		return true;
	}

}
