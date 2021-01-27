package com.demo.service;

import com.demo.base.BaseService;
import com.demo.dao.CityDao;
import com.demo.mapper.CityMapper;
import com.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * City业务类
 *
 * @author jerome
 * @date 2017/1/9 14:59
 */
@Service()
// @Transactional
public class CityService extends BaseService {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private CityDao cityDao;

    /**
     * 通过注解的形式查询数据库
     *
     * @return
     */
    public City selectOneCityByStateUseAnnotation() {
        return cityMapper.selectOneCityByState("CA1");
    }

    /**
     * 使用@Mapper映射XML 查询数据
     *
     * @return
     */
    public City selectOneCityByIdUseMapper(long id) {
        return cityMapper.selectOneCityById(id);
    }

    /**
     * 使用XML的形式查询数据库
     *
     * @return
     */
    public City selectOneCityByIdUseXML(long id) {
        return cityDao.selectOneCityById(id);
    }
}
