/**
 * 
 */
package com.hlcui.service;

import java.util.Arrays;
import java.util.Iterator;
import com.googlecode.cqengine.ConcurrentIndexedCollection;
import com.googlecode.cqengine.IndexedCollection;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.index.navigable.NavigableIndex;
import com.googlecode.cqengine.index.suffix.SuffixTreeIndex;
import com.googlecode.cqengine.query.option.QueryOptions;

import static com.googlecode.cqengine.query.QueryFactory.*;

import com.googlecode.cqengine.resultset.ResultSet;
import com.hlcui.entity.Car;

/**
 * @author Administrator
 *
 */
//@Service  
public class CgEngineService {  
      
    public static final SimpleAttribute<Car, Integer> Car_ID =  new SimpleAttribute<Car, Integer>("carId"){
		@Override
		public Integer getValue(Car arg0, QueryOptions arg1) {
			return arg0.getCarId();
		}
    };
    
    public static final SimpleAttribute<Car, String> DESCRIPTION = new SimpleAttribute<Car, String>("carDescription"){
		@Override
		public String getValue(Car arg0, QueryOptions arg1) {
			return arg0.getDescription();
		}
    };
    
    //使用query  
    public String test1()  
    {  
        StringBuffer sbBuffer=new StringBuffer();  
        IndexedCollection<Car> cars = new ConcurrentIndexedCollection<Car>();  
        //添加对象  
        cars.add(new Car(1, "great ford focus", "great condition, low mileage", Arrays.asList("spare tyre", "sunroof")));  
        cars.add(new Car(2, "ford taurus", "dirty and unreliable, flat tyre", Arrays.asList("spare tyre", "radio")));  
        cars.add(new Car(3, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));  
        cars.add(new Car(4, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));  
        cars.add(new Car(5, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));  
        
        //添加索引  
        cars.addIndex(NavigableIndex.onAttribute(Car_ID));  
        cars.addIndex(SuffixTreeIndex.onAttribute(DESCRIPTION));
        
        //cars.retrieve(equal(Car_ID,4)).uniqueResult().setCarId(10);
        //cars.remove(cars.retrieve(equal(Car_ID,4)).uniqueResult());
        
        //创建查询  
        //Query<Car> query1 =  and(startsWith(DESCRIPTION, "great"),lessThan(Car_ID, 4)); 
        //Query<Car> query1 = all(Car.class);
        //orderBy(descending(Car_ID));
        //获取查询结果  
        //ResultSet<Car> result=cars.retrieve(query1,queryOptions(orderBy(descending(Car_ID))));  
        ResultSet<Car> result=cars.retrieve(and(startsWith(DESCRIPTION, "great"),lessThan(Car_ID, 4)));
         if(result.isNotEmpty()){
        	 Iterator<Car> it = result.iterator();
        	 while(it.hasNext()){
        		 Car car = it.next();
        		 sbBuffer.append(car.toString());  
                 sbBuffer.append("\n"); 
        	 }
             return sbBuffer.toString();  
         }else{  
             return "nothing found";  
         }  
    }
            
            
}  
