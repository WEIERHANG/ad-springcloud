package com.imooc.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description: 创意实体类  最终要展现给用户的广告数据
 * @Author: w
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative")
public class Creative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // 名称
    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 创意的主类型  是什么  文本 图片 还是什么
     */
    @Basic
    @Column(name = "type", nullable = false)
    private Integer type;

    /** 物料的类型, 比如图片可以是 bmp, jpg等等 */
    @Basic
    @Column(name = "material_type", nullable = false)
    private Integer materialType;

    @Basic
    @Column(name = "height", nullable = false)
    private Integer height;

    @Basic
    @Column(name = "width", nullable = false)
    private Integer width;

    /** 物料大小 */
    @Basic
    @Column(name = "size", nullable = false)
    private Long size;

    /** 持续时长, 只有视频不为0 */
    @Basic
    @Column(name = "duration", nullable = false)
    private Integer duration;

    /** 审核状态 */
    @Basic
    @Column(name = "audit_status", nullable = false)
    private Integer auditStatus;

    // 是谁上传的
    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    // 地址信息 物料在哪
    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "updateTime", nullable = false)
    private Date updateTime;

}
