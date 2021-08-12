package com.springcore;
import org.springframework.stereotype.Component;


@Component("divbean")
public class div implements IOP{
	
	public void operationab(int a, int b) {
		if(b==0)
			System.out.println("Can not divide by zero");
		else System.out.println("Result for the operation is :"+(a/b));
	}
}