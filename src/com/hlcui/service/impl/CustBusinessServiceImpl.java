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
		System.out.println("����hanlder����...");
	}
	
	@Override
	public void dowith(){
		System.out.println("����dowith����...");
	}

}
