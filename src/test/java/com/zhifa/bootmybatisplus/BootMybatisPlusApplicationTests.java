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
        WxMoreInfo wxMoreInfo = new WxMoreInfo();
        wxMoreInfo.setId(2);
        QueryWrapper wrapper = new QueryWrapper(wxMoreInfo);
        List<WxMoreInfo> wxMoreInfos = wxMoreInfoMapper.selectList(wrapper);
        System.out.println();
        List<WxMoreInfo> infos = wxMoreInfoMapper.selectByTitle("小学教课资源");
    }



}
