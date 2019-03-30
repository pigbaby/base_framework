package com.pigbaby.framework.testpackage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TestService
 */
@Service("testservice")
public class TestService {
    @Autowired(required = false)
    private TestBean testBean;

    public TestService() {
        System.out.println("The testService is initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("The parameter of testbean is:"+testBean.getName1()+testBean.getName2());
        System.out.println("the service is ready");
        testBean=null;
    }

    @PreDestroy
    public void close(){
        System.out.println("the service is closing");
    }

    /**
     * @return the testBean
     */
    public TestBean getTestBean() {
        return testBean;
    }

    /**
     * @param testBean the testBean to set
     */
    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }
}