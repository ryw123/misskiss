package com.lin.missyou.dto;

import com.lin.missyou.model.BannerItem;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 11:01 2020/4/21
 * @Description:
 */
@Getter
@Setter
public class BannerDTO {
    private Long id;
    private String name;
    private String description;
    private String title;
    private String img;

    private List<BannerItem> items;
}
