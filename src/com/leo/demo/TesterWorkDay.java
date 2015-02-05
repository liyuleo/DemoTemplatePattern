package com.leo.demo;

public class TesterWorkDay extends WorkDay {

	public TesterWorkDay(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(mName+"开始工作:测试bug&&写测试用例");
	}

	@Override
	boolean hook() {
		return false;
	}

}
