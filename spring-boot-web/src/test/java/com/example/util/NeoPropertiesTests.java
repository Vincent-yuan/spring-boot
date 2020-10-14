package com.example.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NeoPropertiesTests {

    @Autowired
    private NeoProperties neoProperties;

    @Test
    public void getHello() throws Exception{
        System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(),"spring-boot-web-vincent");
        Assert.assertEquals(neoProperties.getDescription(),"spring boot web test");
    }
}
