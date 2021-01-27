package com.demo.service;

import com.demo.base.BaseService;
import org.springframework.stereotype.Service;

@Service()
// @Transactional
public class TestService extends BaseService {

    public String test() {
        return "TestService.test()";
    }
}
