package com.imooc.ad.constant;

import lombok.Getter;

/**
 * @Description: 创意类型
 * @Author: ChengChuanQiang
 * 枚举类
 */
@Getter
public enum CreativeType {

    /**
     * 创意类型
     */
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
