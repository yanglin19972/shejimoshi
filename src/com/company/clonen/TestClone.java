package com.company.clonen;

public class TestClone implements Cloneable {


    private  TestClone() {
        System.out.println("这是克隆对象");

    }
    private void getTest() {
        
        System.out.println("我也被克隆了");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("成功复制");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone clone = new TestClone();
        TestClone clone1 = (TestClone) clone.clone();
        clone1.getTest();
        System.out.println();
    }



}

