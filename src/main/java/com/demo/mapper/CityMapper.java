package com.demo.mapper;

import com.demo.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * CityMapper 直接使用注解的形式查询数据库
 *
 * @author jerome
 * @date 2017/1/9 14:57
 */
@Mapper
public interface CityMapper {

    /**
     * sql直接使用注解 不使用xml形式
     *
     * @param state
     * @return
     */
    @Select("select * from city where state = #{state}")
    City selectOneCityByState(@Param("state") String state);

    /**
     * 使用xml形式，xml id默认为方法名
     *
     * @param id
     * @return
     */
    City selectOneCityById(long id);

}