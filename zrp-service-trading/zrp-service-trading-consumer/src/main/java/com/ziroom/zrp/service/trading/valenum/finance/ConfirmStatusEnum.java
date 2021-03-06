package com.ziroom.zrp.service.trading.valenum.finance;

/**
 * <p>财务审核状态枚举</p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lusp
 * @version 1.0
 * @Date Created in 2017年11月21日 20:00
 * @since 1.0
 */

public enum ConfirmStatusEnum {

    WSH(0,"未审核"),
    SHTG(1,"审核通过"),
    SHWTG(2,"审核未通过"),
    WTJ(3,"未提交"),
    SHZ(4,"审核中");

    ConfirmStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private int code;

    private String name;
}
