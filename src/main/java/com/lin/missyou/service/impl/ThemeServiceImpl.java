package com.lin.missyou.service.impl;

import com.lin.missyou.model.Theme;
import com.lin.missyou.repository.ThemeRepository;
import com.lin.missyou.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NamingSecurityException;
import java.util.List;

/**
 * @author yanwei.ren
 * @date Created in 13:28 2020/4/25
 * @Description:
 */
@Service
public class ThemeServiceImpl implements ThemeService {
    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public List<Theme> findByNames(List<String> names) {
        return themeRepository.findByNames(names);
    }
}
