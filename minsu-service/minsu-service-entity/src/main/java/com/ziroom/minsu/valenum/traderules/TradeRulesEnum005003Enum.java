package com.ziroom.minsu.valenum.traderules;

/**
 * <p>灵活退订政策</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on 2016/4/3.
 * @version 1.0
 * @since 1.0
 */
public enum TradeRulesEnum005003Enum {

    TradeRulesEnum005003001("TradeRulesEnum005003001","按天收取");

    private final String value;

    private final String name;

    TradeRulesEnum005003Enum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
