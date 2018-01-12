package com.hlcui.proxy.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hlcui.dao.Datamapper;
import com.hlcui.model.TraderVo;

public class TestBatchInsertOrUpdate {
	
	@Test
	public void testBatchInsert(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		System.out.println(context);
		SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
		SqlSession sqlSession = factory.openSession(ExecutorType.BATCH, false);
		Datamapper mapper = sqlSession.getMapper(Datamapper.class);
		long start = System.currentTimeMillis();
		for(TraderVo vo:getTraderList()){
			mapper.insert(vo);
		}
		sqlSession.commit();
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start)+"ms");//耗时55047ms
	}
	
	@Test
	public void testBatchInsert2(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		System.out.println(context);
		long start = System.currentTimeMillis();
		Datamapper mapper = context.getBean(Datamapper.class);
		mapper.batchInsert(getTraderList());
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start)+"ms"); //插入1000条耗时399ms
	}
	
	@Test
	public void testBatchInsert3(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		System.out.println(context);
		long start = System.currentTimeMillis();
		Datamapper mapper = context.getBean(Datamapper.class);
		for(TraderVo vo:getTraderList()){
			mapper.insert(vo);
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start)+"ms");//耗时50917ms
	}
	
	private List<TraderVo> getTraderList(){
		List<TraderVo> result = new ArrayList<TraderVo>();
		for(int i=0;i<1000;i++){
			TraderVo vo = new TraderVo();
			vo.setName(String.valueOf(i));
			result.add(vo);
		}
		return result;
	}
	
	@Test
	public void test(){
		Map<String,TraderVo> map = new HashMap<String,TraderVo>();
		map.put("1", new TraderVo(1,"tom"));
		System.out.println(map);
		TraderVo vo = map.get("1");
		vo.setName("jack");
		System.out.println(map);
	}
}
