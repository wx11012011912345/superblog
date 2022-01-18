package com.zhike.blogpojo.DTO;

import lombok.Data;

import javax.validation.constraints.Min;

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
 * PagedQueryDto at 2022/1/16 21:04,code by JeffreyHu
 * You can contact author with zhikecore@foxmail.com.
 */
@Data
public class PagedQueryDto {

    @Min(value = 1, message = "页码不能小于1")
    protected Integer page;

    @Min(value = 10, message = "分页不能小于10")
    protected Integer limit;
}
