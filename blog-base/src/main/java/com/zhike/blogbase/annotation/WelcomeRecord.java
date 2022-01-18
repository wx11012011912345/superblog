package com.zhike.blogbase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright (C) 2022  智客工坊(52interview.com)
 * The SpringBoot Super-blog Project.
 * All rights reserved.
 * <p>
 * > Github地址: https://github.com/zhikecore/superblog.git
 * > 教程地址: https://www.52interview.com/book/36
 * > 智客工坊社区：https://www.52interview.com/
 * <p>
 * 智客工坊(52interview.com) - 经验创造价值,分享成就未来。
 * <p>
 * WelcomeRecord at 2022/1/16 21:20,code by JeffreyHu
 * You can contact author with zhikecore@foxmail.com.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WelcomeRecord {
}
