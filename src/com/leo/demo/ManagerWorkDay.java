package com.leo.demo;

public class ManagerWorkDay extends WorkDay {

	public ManagerWorkDay(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(mName+"开始工作:上上网&&开开会&&调戏秘书");
	}

	@Override
	boolean hook() {
		return false;
	}

}
