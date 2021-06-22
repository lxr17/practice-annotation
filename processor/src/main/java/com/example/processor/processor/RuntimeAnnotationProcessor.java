package com.example.processor.processor;

import com.example.annotation.annotation.RuntimeAnnotation;
import com.example.processor.test.RuntimeAnnotationTest;

import java.lang.reflect.Field;

/**
 * @author hejinhua
 * @date 2021/6/22
 */
public class RuntimeAnnotationProcessor {

    public static void main(String[] args) {
        try {
            Class clazz = RuntimeAnnotationTest.class;
            Field field = clazz.getDeclaredField("name");
            RuntimeAnnotation annotation = field.getAnnotation(RuntimeAnnotation.class);
            String desc = annotation.description();

            System.out.println(desc);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
