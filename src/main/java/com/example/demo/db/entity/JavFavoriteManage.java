package com.example.demo.db.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.demo.enums.FavoriteType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * <p>
 * 喜爱内容管理
 * </p>
 *
 * @author mybatis-plus-generator
 * @since 2026-01-27
 */
@Getter
@Setter
@ToString
@TableName("jav_favorite_manage")
public class JavFavoriteManage {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 内容
     */
    private String label;

    /**
     * URL地址
     */
    private String url;

    /**
     * 类型
     */
    private FavoriteType type;

    /**
     * 是否喜爱标记
     */
    private Boolean isFavorite;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;
}
