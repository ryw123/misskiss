package com.lin.missyou.api;

import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.model.Banner;
import com.lin.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 14:11 2020/4/20
 * @Description:
 */
@RestController
@RequestMapping("v1/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("/getList")
    public List<Banner> getBanner(){
        return bannerService.getBanner();
    }

    @GetMapping("/byName/{name}")
    public Banner getBannerByName(@PathVariable @NotBlank String  name){
        Banner banner = bannerService.getBannerByName(name);
        if(banner == null){
            throw new NotFoundException(30005);
        }
        return banner;
    }
}

