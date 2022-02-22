package com.entlogics.schoolsystem.dao;

// implementation class for testing mvc flow
public class IndexDAO implements IIndexDAO {

	// method to test mvc flow
	@Override
	public String testMVCFlow() {
		System.out.println("Inside dao method");
		
		return "helloworld";
	}
}
