package com.demo.dao;

import com.demo.model.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CityDao 使用sqlSession的形式查询数据
 *
 * @author jerome
 * @date 2017/1/9 14:52
 */
@Component
public class CityDao {
    @Autowired
    private SqlSession sqlSession;

    public City selectOneCityById(long id) {
        return this.sqlSession.selectOne("selectOneCityById", id);
    }

}
