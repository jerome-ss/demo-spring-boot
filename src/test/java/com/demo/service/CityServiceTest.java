package com.demo.service;

import com.demo.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServiceTest {

	@Autowired
	private CityService cityService;

	/**
	 * 使用注解查询数据库
	 */
	@Test
	public void selectOneCityByStateUseAnnotationTest() {
		City city = cityService.selectOneCityByStateUseAnnotation();
		System.out.println(city.toString());
	}

	/**
	 * 使用@Mapper映射XML 查询数据
	 */
	@Test
	public void selectOneCityByIdUseMapperTest() {
		City city = cityService.selectOneCityByIdUseMapper(2);
		System.out.println(city.toString());
	}

	/**
	 * 使用XML的形式查询数据库
	 */
	@Test
	public void selectOneCityByIdUseXMLTest() {
		City city = cityService.selectOneCityByIdUseXML(2);
		System.out.println(city.toString());
	}

}
