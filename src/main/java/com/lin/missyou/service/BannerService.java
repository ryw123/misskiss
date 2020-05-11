package com.lin.missyou.service;

import com.lin.missyou.model.Banner;

import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 14:12 2020/4/20
 * @Description:
 */
public interface BannerService {
    List<Banner> getBanner();

    Banner getBannerByName(String name);
}
