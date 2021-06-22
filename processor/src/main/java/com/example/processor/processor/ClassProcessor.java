package com.example.processor.processor;

import com.example.annotation.annotation.CompileAnnotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * @author hejinhua
 * @date 2021/6/22
 */
@SupportedAnnotationTypes("com.example.annotation.annotation.CompileAnnotation")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ClassProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager = processingEnv.getMessager();
        for (Element element : roundEnvironment.getElementsAnnotatedWith(CompileAnnotation.class)) {
            if (element.getKind() == ElementKind.FIELD) {
                messager.printMessage(Diagnostic.Kind.NOTE, "printMessage:" + element.toString());
            }
        }
        return true;
    }
}
