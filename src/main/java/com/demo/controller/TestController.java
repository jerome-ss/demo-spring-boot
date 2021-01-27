package com.demo.controller;

import com.demo.model.User;
import com.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("test")
public class TestController {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TestService testService;

    // 32位随机字符串
    @Value(value = "${jerome.random.value}")
    private String randomValue;

    // int类型的随机数字
    @Value(value = "${jerome.random.int}")
    private int randomInt;

    // 自定义名字，如果没有配置使用默认值jerome
    @Value(value = "${jerome.name:jerome}")
    private String name;

    // 属性占位符属性 ${jerome.name} is a domain name
    @Value(value = "${jerome.desc}")
    private String desc;

    /**
     * 不区分get post
     * localhost/test
     *
     * @return String
     */
    @RequestMapping()
    String test() {
        logger.debug("this is debug.");
        logger.info("this is info.");
        logger.warn("this is warn.");
        return "hello world";
    }

    /**
     * Get请求
     * localhost/test/test?name=jerome
     *
     * @param name 名字(默认必填)
     * @param age  年龄(非必填)
     * @return String
     */
    @RequestMapping(value = "test", method = RequestMethod.GET)
    String testGet(@RequestParam("name") String name, @RequestParam(value = "age", required = false) String age) {
        return testService.test() + name;
    }

    /**
     * Post请求
     *
     * @return String
     */
    @RequestMapping(value = "test", method = RequestMethod.POST)
    String testPost() {
        return testService.test();
    }

    /**
     * Restful请求
     * localhost/test/test/jerome
     *
     * @param name 名字(默认必填)
     * @return String
     */
    @RequestMapping("test/{name}")
    String testRestful(@PathVariable String name) {
        return testService.test() + name;
    }

    /**
     * 返回Map的json
     *
     * @return Json
     */
    @RequestMapping("testMap")
    Map<String, Object> testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "jerome");
        map.put("age", 26);
        return map;
    }

    /**
     * 返回List的json
     *
     * @return Json
     */
    @RequestMapping("testList")
    List<String> testList() {
        List<String> list = new ArrayList<>();
        list.add("苏志达");
        list.add("jerome");
        return list;
    }

    /**
     * 返回实体的json
     *
     * @return Json
     */
    @RequestMapping("testModel")
    User testModel() {
        return new User("苏志达", 26, 0, new Date(), 99.6);
    }

    /**
     * 获取配置文件的数据
     *
     * @return Json
     */
    @RequestMapping("testProp")
    Map<String, Object> testProp() {
        Map<String, Object> map = new HashMap<>();
        map.put("title", "hello world");
        map.put("randomValue", randomValue);
        map.put("randomInt", randomInt);
        map.put("name", name);
        map.put("desc", desc);
        return map;
    }

    /**
     * 跨域请求
     *
     * @return Json
     */
    @CrossOrigin(origins = "http://localhost/test/cross")
    @RequestMapping("cross")
    Map<String, Object> cross(@RequestParam("name") String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }


}
