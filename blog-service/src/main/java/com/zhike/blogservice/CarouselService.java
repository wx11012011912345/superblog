package com.zhike.blogservice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhike.blogdao.mapper.ArticleMapper;
import com.zhike.blogdao.mapper.CarouselMapper;
import com.zhike.blogpojo.DO.Article;
import com.zhike.blogpojo.DO.Carousel;
import com.zhike.blogpojo.VO.CarouselVO;

import java.util.List;

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
 * CarouselService at 2022/1/16 21:04,code by JeffreyHu
 * You can contact author with zhikecore@foxmail.com.
 */

public interface CarouselService extends IService<Carousel> {
    List<CarouselVO> getCarousels();
}
