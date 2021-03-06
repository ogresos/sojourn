package com.ziroom.minsu.entity.cms;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

/**
 * 
 * <p>城市专栏商圈景点</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
public class ColumnRegionEntity extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5023973819683811379L;

	/**
     * 自增id
     * This field corresponds to the database column t_column_region.id
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private Integer id;

    /**
     * 逻辑fid
     * This field corresponds to the database column t_column_region.fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String fid;
    
    /**
     * 城市专栏fid
     * This field corresponds to the database column t_column_region.column_city_fid 
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String columnCityFid;

	/**
     * 景点商圈fid
     * This field corresponds to the database column t_column_region.region_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String regionFid;

    /**
     * 展示房源fid
     * This field corresponds to the database column t_column_region.house_fids
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String houseFids;

    /**
     * 覆盖半径显示房源数量
     * This field corresponds to the database column t_column_region.show_house_num
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private Integer showHouseNum;

    /**
     * 扩展字段
     * This field corresponds to the database column t_column_region.standby_field
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String standbyField;

	/**
     * 排序字段
     */
    private Integer orderSort;

    /**
     * 创建人fid
     * This field corresponds to the database column t_column_region.create_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private String createFid;

    /**
     * 创建时间
     * This field corresponds to the database column t_column_region.create_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private Date createDate;

    /**
     * 最后更新时间
     * This field corresponds to the database column t_column_region.last_modify_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private Date lastModifyDate;

    /**
     * 是否删除 0：否，1：是
     * This field corresponds to the database column t_column_region.is_del
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.id
     *
     * @return the value of t_column_region.id
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.id
     *
     * @param id the value for t_column_region.id
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.fid
     *
     * @return the value of t_column_region.fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.fid
     *
     * @param fid the value for t_column_region.fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.region_fid
     *
     * @return the value of t_column_region.region_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public String getRegionFid() {
        return regionFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.region_fid
     *
     * @param regionFid the value for t_column_region.region_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setRegionFid(String regionFid) {
        this.regionFid = regionFid == null ? null : regionFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.house_fids
     *
     * @return the value of t_column_region.house_fids
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public String getHouseFids() {
        return houseFids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.house_fids
     *
     * @param houseFids the value for t_column_region.house_fids
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setHouseFids(String houseFids) {
        this.houseFids = houseFids == null ? null : houseFids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.show_house_num
     *
     * @return the value of t_column_region.show_house_num
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public Integer getShowHouseNum() {
        return showHouseNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.show_house_num
     *
     * @param showHouseNum the value for t_column_region.show_house_num
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setShowHouseNum(Integer showHouseNum) {
        this.showHouseNum = showHouseNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.standby_field
     *
     * @return the value of t_column_region.standby_field
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public String getStandbyField() {
        return standbyField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.standby_field
     *
     * @param standbyField the value for t_column_region.standby_field
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setStandbyField(String standbyField) {
        this.standbyField = standbyField == null ? null : standbyField.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.create_fid
     *
     * @return the value of t_column_region.create_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public String getCreateFid() {
        return createFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.create_fid
     *
     * @param createFid the value for t_column_region.create_fid
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.create_date
     *
     * @return the value of t_column_region.create_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.create_date
     *
     * @param createDate the value for t_column_region.create_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.last_modify_date
     *
     * @return the value of t_column_region.last_modify_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.last_modify_date
     *
     * @param lastModifyDate the value for t_column_region.last_modify_date
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column_region.is_del
     *
     * @return the value of t_column_region.is_del
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column_region.is_del
     *
     * @param isDel the value for t_column_region.is_del
     *
     * @mbggenerated Thu Nov 10 15:42:12 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    
    /**
	 * @return the columnCityFid
	 */
	public String getColumnCityFid() {
		return columnCityFid;
	}

	/**
	 * @param columnCityFid the columnCityFid to set
	 */
	public void setColumnCityFid(String columnCityFid) {
		this.columnCityFid = columnCityFid;
	}
	
    /**
	 * @return the orderSort
	 */
	public Integer getOrderSort() {
		return orderSort;
	}

	/**
	 * @param orderSort the orderSort to set
	 */
	public void setOrderSort(Integer orderSort) {
		this.orderSort = orderSort;
	}
}