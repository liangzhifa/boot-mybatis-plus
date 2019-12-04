package com.zhifa.bootmybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "wx_more_info")
public class WxMoreInfo {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 图片地址
     */
    @TableField(value = "picUrl")
    private String picurl;

    /**
     * url
     */
    @TableField(value = "url")
    private String url;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_PICURL = "picUrl";

    public static final String COL_URL = "url";
}