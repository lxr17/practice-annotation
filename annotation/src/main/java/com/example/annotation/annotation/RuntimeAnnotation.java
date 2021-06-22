package com.example.annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hejinhua
 * @date 2021/6/22
 * @description 运行时注解的例子
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnnotation {
    String description() default "";
}
