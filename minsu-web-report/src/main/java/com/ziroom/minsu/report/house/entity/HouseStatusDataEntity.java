package com.ziroom.minsu.report.house.entity;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

 /**
  * 
  * <p>房源状态周期entity</p>
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
public class HouseStatusDataEntity extends BaseEntity{
    /**
	 * 序列化id
	 */
	private static final long serialVersionUID = 4972792193418757910L;
	
	/**
	 * 逻辑fid
	 */
	private String fid;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.id
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.house_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private String houseFid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.room_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private String roomFid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.landlord_uid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private String landlordUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.city_code
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.city_name
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.rent_way
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Integer rentWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.old_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Integer oldStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.new_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Integer newStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.old_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Date oldStatusStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.new_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Date newStatusStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.statistics_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Date statisticsDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house_status_data.create_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.id
     *
     * @return the value of t_house_status_data.id
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.id
     *
     * @param id the value for t_house_status_data.id
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.house_fid
     *
     * @return the value of t_house_status_data.house_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public String getHouseFid() {
        return houseFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.house_fid
     *
     * @param houseFid the value for t_house_status_data.house_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setHouseFid(String houseFid) {
        this.houseFid = houseFid == null ? null : houseFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.room_fid
     *
     * @return the value of t_house_status_data.room_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public String getRoomFid() {
        return roomFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.room_fid
     *
     * @param roomFid the value for t_house_status_data.room_fid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setRoomFid(String roomFid) {
        this.roomFid = roomFid == null ? null : roomFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.landlord_uid
     *
     * @return the value of t_house_status_data.landlord_uid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public String getLandlordUid() {
        return landlordUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.landlord_uid
     *
     * @param landlordUid the value for t_house_status_data.landlord_uid
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setLandlordUid(String landlordUid) {
        this.landlordUid = landlordUid == null ? null : landlordUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.city_code
     *
     * @return the value of t_house_status_data.city_code
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.city_code
     *
     * @param cityCode the value for t_house_status_data.city_code
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.city_name
     *
     * @return the value of t_house_status_data.city_name
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.city_name
     *
     * @param cityName the value for t_house_status_data.city_name
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.rent_way
     *
     * @return the value of t_house_status_data.rent_way
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Integer getRentWay() {
        return rentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.rent_way
     *
     * @param rentWay the value for t_house_status_data.rent_way
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setRentWay(Integer rentWay) {
        this.rentWay = rentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.old_status
     *
     * @return the value of t_house_status_data.old_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Integer getOldStatus() {
        return oldStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.old_status
     *
     * @param oldStatus the value for t_house_status_data.old_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setOldStatus(Integer oldStatus) {
        this.oldStatus = oldStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.new_status
     *
     * @return the value of t_house_status_data.new_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Integer getNewStatus() {
        return newStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.new_status
     *
     * @param newStatus the value for t_house_status_data.new_status
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.old_status_start
     *
     * @return the value of t_house_status_data.old_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Date getOldStatusStart() {
        return oldStatusStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.old_status_start
     *
     * @param oldStatusStart the value for t_house_status_data.old_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setOldStatusStart(Date oldStatusStart) {
        this.oldStatusStart = oldStatusStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.new_status_start
     *
     * @return the value of t_house_status_data.new_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Date getNewStatusStart() {
        return newStatusStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.new_status_start
     *
     * @param newStatusStart the value for t_house_status_data.new_status_start
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setNewStatusStart(Date newStatusStart) {
        this.newStatusStart = newStatusStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.statistics_date
     *
     * @return the value of t_house_status_data.statistics_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Date getStatisticsDate() {
        return statisticsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.statistics_date
     *
     * @param statisticsDate the value for t_house_status_data.statistics_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house_status_data.create_date
     *
     * @return the value of t_house_status_data.create_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house_status_data.create_date
     *
     * @param createDate the value for t_house_status_data.create_date
     *
     * @mbggenerated Wed Sep 28 11:39:54 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
	/**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}

	/**
	 * @param fid the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}
}