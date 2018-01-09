/**
 * 
 */
package com.hlcui.cache.cqengine;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.cqengine.ConcurrentIndexedCollection;
import com.googlecode.cqengine.IndexedCollection;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.index.navigable.NavigableIndex;
import com.googlecode.cqengine.index.suffix.SuffixTreeIndex;
import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.query.option.QueryOptions;

import static com.googlecode.cqengine.query.QueryFactory.*;

import com.googlecode.cqengine.resultset.ResultSet;
import com.hlcui.cache.cqengine.Car;

public class CgEngineService {

	private IndexedCollection<Car> cars;

	@Before
	public void setUp() {
		cars = new ConcurrentIndexedCollection<Car>();
		// ��Ӷ���(�ȼ������ݿ�insert)
		cars.add(
				new Car(1, "great ford focus", "great condition, low mileage", Arrays.asList("spare tyre", "sunroof")));
		cars.add(new Car(2, "ford taurus", "dirty and unreliable, flat tyre", Arrays.asList("spare tyre", "radio")));
		cars.add(new Car(3, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));
		cars.add(new Car(4, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));
		cars.add(new Car(5, "honda civic", "has a flat tyre and high mileage", Arrays.asList("radio")));
		// �������
		cars.addIndex(NavigableIndex.onAttribute(Car_ID));
		cars.addIndex(SuffixTreeIndex.onAttribute(DESCRIPTION));
	}

	public static final SimpleAttribute<Car, Integer> Car_ID = new SimpleAttribute<Car, Integer>("carId") {
		@Override
		public Integer getValue(Car args0, QueryOptions args1) {
			return args0.getCarId();
		}

	};

	public static final SimpleAttribute<Car, String> DESCRIPTION = new SimpleAttribute<Car, String>("carDescription") {
		@Override
		public String getValue(Car args0, QueryOptions args1) {
			return args0.getDescription();
		}

	};

	@Test
	public void testQueryMemory1() {
		cars.retrieve(equal(Car_ID, 4)).uniqueResult().setCarId(10); // ��carIdΪ4�Ķ���carId����Ϊ10
		cars.remove(cars.retrieve(equal(Car_ID, 4)).uniqueResult()); // �Ƴ�carIdΪ4�Ķ���
	}

	@Test
	public void testQueryMemory2() {
		StringBuffer sbBuffer = new StringBuffer();
		// ������ѯ
		Query<Car> query1 = and(startsWith(DESCRIPTION, "great"), lessThan(Car_ID, 4));
		Query<Car> query2 = all(Car.class);
		orderBy(descending(Car_ID));
		// ��ȡ��ѯ���
		ResultSet<Car> result1 = cars.retrieve(query1, queryOptions(orderBy(descending(Car_ID))));
		ResultSet<Car> result2 = cars.retrieve(and(startsWith(DESCRIPTION, "great"), lessThan(Car_ID, 4)));
		if (result1.isNotEmpty()) {
			Iterator<Car> it = result1.iterator();
			while (it.hasNext()) {
				Car car = it.next();
				sbBuffer.append(car.toString());
				sbBuffer.append("\n");
			}
			System.out.println(sbBuffer.toString());
		} 
	}

}
