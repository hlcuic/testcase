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
	 * ʹ������ʽע����������Ҫ��������ķ�������ע�⣬�����������Ȼ����ڱ�����ķ���ǰ�����aop����
	 * �ڵ��÷���ǰ�����������ִ�з���������ɹ������ύ�����ʧ�ܣ���ع���
	 * @param vo
	 * @return
	 */
	@Transactional
	public int insertData(TraderVo vo){
		return mapper.insert(vo);
	}
	
}
