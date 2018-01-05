/**
 * 
 */
package com.hlcui.service;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



/**
 * @author Administrator
 *
 */
import redis.clients.jedis.Jedis;

public class RedisService {
	
	public static Jedis jedis;
	
	static{
		init();
	}
	
	public static void init(){
        jedis = new Jedis("localhost",6379);
        System.out.println("���ӳɹ�");
        System.out.println("������������: "+jedis.ping());
	}
	
    public static void main(String[] args) {
    	setString();
        setList();
    }

    public static void setString(){
        jedis.set("runoobkey", "www.runoob.com");
        System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("runoobkey"));
    }
    
    private static void setList() {
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("�б���Ϊ: "+list.get(i));
        }
        Set<String> keys = jedis.keys("*"); 
        Iterator<String> it=keys.iterator() ;   
        while(it.hasNext()){   
            String key = it.next();   
            System.out.println(key);   
        }
	}
    
}
