package com.demo.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service("baseService")
public class BaseService {

	/*@Autowired
	protected JdbcTemplate jdbc;
	*//**
	 * redis访问对象
	 *//*
	@Autowired
	protected StringRedisTemplate redis;

	*//**
	 * mongo访问对象
	 *//*
	@Autowired
	protected MongoTemplate mongo;


	public StringRedisTemplate getRedis() {
		return redis;
	}*/
	public static ObjectMapper obp = new ObjectMapper();
	
	public Logger LOG = LogManager.getLogger(this.getClass());
}
