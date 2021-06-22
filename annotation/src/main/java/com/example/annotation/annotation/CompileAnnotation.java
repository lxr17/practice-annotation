package com.example.annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hejinhua
 * @date 2021/6/22
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface CompileAnnotation {
}
