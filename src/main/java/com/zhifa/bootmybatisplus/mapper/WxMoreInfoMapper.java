package com.zhifa.bootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.bootmybatisplus.domain.WxMoreInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxMoreInfoMapper extends BaseMapper<WxMoreInfo> {
    List<WxMoreInfo> selectByTitle(@Param("title") String title);
}
