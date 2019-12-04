package com.zhifa.bootmybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhifa.bootmybatisplus.domain.WxMoreInfo;
import com.zhifa.bootmybatisplus.mapper.WxMoreInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootMybatisPlusApplicationTests {

    @Autowired
    WxMoreInfoMapper wxMoreInfoMapper;

    @Test
    void contextLoads() {
        QueryWrapper wrapper = new QueryWrapper();
        List<WxMoreInfo> wxMoreInfos = wxMoreInfoMapper.selectList(wrapper);
        System.out.println();
    }

}
