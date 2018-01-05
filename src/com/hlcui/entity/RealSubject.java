/**
 * 
 */
package com.hlcui.entity;

/**
 * @author Administrator
 *
 */
public class RealSubject implements Subject{

	@Override
	public void eat() {
		System.out.println("eating...");
	}

	@Override
	public void sing() {
		System.out.println("singing...");
	}

}
