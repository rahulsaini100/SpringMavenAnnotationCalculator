package com.springcore;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Welcome to calcultor");
		
		
		int flag = 1;
		while (flag == 1) {
			System.out.println("Enter two NUmbers a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Choose Operation");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. Div");
			System.out.println("5. exit");
			int c = sc.nextInt();
			if (c == 1) {
				IOP obj1 = (IOP) context.getBean("addbean");
				Operator obj = new Operator();
				obj.setop(obj1);
				obj.operationfun(a, b);
			} else if (c == 2) {
				IOP obj1 = (IOP) context.getBean("subbean");
				Operator obj = new Operator();
				obj.setop(obj1);
				obj.operationfun(a, b);
			} else if (c == 3) {
				IOP obj1 = (IOP) context.getBean("mulbean");
				Operator obj = new Operator();
				obj.setop(obj1);
				obj.operationfun(a, b);
			} else if (c == 4) {
				IOP obj1 = (IOP) context.getBean("divbean");
				Operator obj = new Operator();
				obj.setop(obj1);
				obj.operationfun(a, b);
			} else {
				flag = 0;
				System.out.println("You exit successfully");
				break;
			}
			
		}

		context.close();
	}
}