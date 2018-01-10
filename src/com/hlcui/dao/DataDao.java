package com.hlcui.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hlcui.model.TraderVo;

@Component
public class DataDao{
	
	@Autowired
	private Datamapper mapper;
	
	/**
	 * 使用声明式注解事务，在需要声明事务的方法加上注解，配置事务管理，然后会在被管理的方法前后进行aop代理，
	 * 在调用方法前加入事务管理，执行方法，如果成功，则提交；如果失败，则回滚。
	 * @param vo
	 * @return
	 */
	@Transactional
	public int insertData(TraderVo vo){
		return mapper.insert(vo);
	}
	
}
