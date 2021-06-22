package com.example.processor.test;

import com.example.annotation.annotation.RuntimeAnnotation;

/**
 * @author hejinhua
 * @date 2021/6/22
 */
public class RuntimeAnnotationTest {
    @RuntimeAnnotation(description = "这个参数的意思是名字")
    private String name;

    @RuntimeAnnotation(description = "这个参数的意思是年龄")
    public int age;
}
