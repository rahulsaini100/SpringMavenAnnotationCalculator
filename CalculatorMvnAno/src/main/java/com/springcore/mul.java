package com.springcore;
import org.springframework.stereotype.Component;


@Component("mulbean")
public class mul implements IOP{
	
	public void operationab(int a, int b) {
		
		System.out.println("Result for the operation is :"+(a*b));
	}
}