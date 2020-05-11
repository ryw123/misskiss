package com.lin.missyou.repository;

import com.lin.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 14:13 2020/4/20
 * @Description:
 */
public interface BannerRepository extends JpaRepository<Banner, Long> {
     List<Banner> findAll();
     Banner findOneByName(String name);
}
