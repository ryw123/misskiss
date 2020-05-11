package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author yanwei.ren
 * @date Created in 13:58 2020/4/20
 * @Description:
 */
@Entity
@Setter
@Getter
public class BannerItem extends BaseEntity {
    @Id
    private Long id;
    private String img;
    private String keyword;
    private short type;
    private Long bannerId;
    private String name;

}
