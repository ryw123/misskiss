package com.lin.missyou.service;

import com.lin.missyou.model.Theme;

import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 13:28 2020/4/25
 * @Description:
 */
public interface ThemeService {
    List<Theme> findByNames(List<String> names);
}
