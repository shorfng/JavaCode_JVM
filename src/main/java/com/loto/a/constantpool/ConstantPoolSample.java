package com.loto.a.constantpool;

/**
 * 字节码 - 常量池
 */
public class ConstantPoolSample {
    private final String name;
    private final int age;
    private final double temp = 0.0;

    public ConstantPoolSample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void output(String prefix) {
        System.out.println(prefix + "姓名:" + name);
        System.out.println(prefix + "年龄:" + age);
    }

    public String output1(String prefix) {
        System.out.println(prefix + "姓名:" + name);
        System.out.println(prefix + "年龄:" + age);
        return "SUCCESS";
    }

    public static void main(String[] args) {
        new ConstantPoolSample("TD", 36).output("[IT]");
        new ConstantPoolSample("TD", 36).output1("");
    }
}
