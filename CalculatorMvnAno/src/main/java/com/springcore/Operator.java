package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;


public class Operator {
	
	
	IOP operation;
	

	@Autowired
	public void setop(IOP operation) {
		this.operation= operation;
	}

	public void  operationfun(int a,int b) {
		 operation.operationab(a, b);
	}
}
