/**
 * 
 */
package com.hlcui.service.impl;

import com.hlcui.service.IcustBusinessService;

/**
 * @author Administrator
 *
 */
public class CustBusinessServiceImpl implements IcustBusinessService{

	@Override
	public void handler() {
		System.out.println("调用hanlder方法...");
	}
	
	@Override
	public void dowith(){
		System.out.println("调用dowith方法...");
	}

}
