package com.lin.missyou.repository;

import com.lin.missyou.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 13:29 2020/4/25
 * @Description:
 */
public interface ThemeRepository extends JpaRepository<Theme,Long> {

    @Query("select t from Theme t where t.name in (:names)")
    List<Theme> findByNames(List<String> names);
}
