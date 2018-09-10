package com.example.apt_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Korining on 2018/9/10.
 *
 */
/**
 * @Retention 定义自定义注解的生命长短
 * RetentionPolicy.SOURCE : 在源文件中有效（即源文件保留）
 * RetentionPolicy.CLASS : 在class文件中有效（即class保留）
 * RetentionPolicy.RUNTIME : 时有效（即运行时保留）
 *
 * @Target 说明自定义注解的说明类型
 * ElementType.CONSTRUCTOR : 用于描述构造器
 * ElementType.FIELD : 用于描述域
 * ElementType.LOCAL_VARIABLE : 用于描述局部变量
 * ElementType.METHOD : 用于描述方法
 * ElementType.PACKAGE : 用于描述包
 * ElementType.PARAMETER : 用于描述参数
 * ElementType.TYPE : 用于描述类、接口(包括注解类型) 或enum声明
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {
    int value();
}