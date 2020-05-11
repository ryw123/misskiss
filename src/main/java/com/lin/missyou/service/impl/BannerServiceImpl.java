package com.lin.missyou.service.impl;

import com.lin.missyou.model.Banner;
import com.lin.missyou.repository.BannerRepository;
import com.lin.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 14:12 2020/4/20
 * @Description:
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public List<Banner> getBanner() {
        return bannerRepository.findAll();
    }

    @Override
    public Banner getBannerByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
