package com.br.practice;

public interface IListener {
	void duringTest();
	void afterTest() ;
	default void beforeTest() { //or private void beforeTest() supported from Java 8 features
		
	}
	static void generate() {
		
	}
	

}
