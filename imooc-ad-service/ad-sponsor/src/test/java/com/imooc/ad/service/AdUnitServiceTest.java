package com.imooc.ad.service;

import com.imooc.ad.Application;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdUnitRequest;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},
    webEnvironment =  SpringBootTest.WebEnvironment.NONE)
public class AdUnitServiceTest {
    @Autowired
    private IAdUnitService adUnitService;
    @Test
    public void testCreateUnit() throws AdException {
        System.out.println(
                adUnitService.createUnit(
                        new AdUnitRequest(1L,"nihk",1,1L)
                )
        );
    }
}
