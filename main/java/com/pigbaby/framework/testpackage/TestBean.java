package com.pigbaby.framework.testpackage;

/**
 * 测试Bean1，这个Bean主要测试以下功能：
 * 1. 测试出什么时候触发Bean的销毁动作。Bean中将定义一个销毁的动作。在Spring停止前，Bean销毁的时候会运行Clean方法。
 * TestBean
 */
public class TestBean {

    private String name1;
    private String name2;

    public TestBean(){
        name1="pigbaby";
        name2="feifei";
        System.out.println("A testbean is initialized ! The id is"+this.hashCode());
    }

    public void clean(){
        System.out.println("the test bean is closed ! The id is:"+this.hashCode());
    }

    /**
     * @return the name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @param name1 the name1 to set
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }
}