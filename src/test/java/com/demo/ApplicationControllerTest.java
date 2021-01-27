package com.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.demo.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationControllerTest {

    private MockMvc mvc;

    @Before
    public void setup() {
        this.mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
    }

    @Test
    public void contextLoads() throws Exception {
        // TODO 不知为何，如果 Controller 调用注解的Service就会报空指针？
        RequestBuilder request = get("/test");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("hello world"));

//        request = get("/test/test").param("name", "jerome");
//        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("jerome"));
    }

}