package com.ziroom.minsu.entity.conf;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;

/**
 * 
 * <p>TODO</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author yd
 * @since 1.0
 * @version 1.0
 */
public class GuardAreaEntity extends BaseEntity{
    /**
	 *序列id
	 */
	private static final long serialVersionUID = -4217771200840816768L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.id
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.nation_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String nationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.province_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.city_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.area_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.emp_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String empCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.emp_phone
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String empPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.emp_name
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.create_fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private String createFid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.create_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.last_modify_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private Date lastModifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guard_area.is_del
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.id
     *
     * @return the value of t_guard_area.id
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.id
     *
     * @param id the value for t_guard_area.id
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.fid
     *
     * @return the value of t_guard_area.fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.fid
     *
     * @param fid the value for t_guard_area.fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.nation_code
     *
     * @return the value of t_guard_area.nation_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.nation_code
     *
     * @param nationCode the value for t_guard_area.nation_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.province_code
     *
     * @return the value of t_guard_area.province_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.province_code
     *
     * @param provinceCode the value for t_guard_area.province_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.city_code
     *
     * @return the value of t_guard_area.city_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.city_code
     *
     * @param cityCode the value for t_guard_area.city_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.area_code
     *
     * @return the value of t_guard_area.area_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.area_code
     *
     * @param areaCode the value for t_guard_area.area_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.emp_code
     *
     * @return the value of t_guard_area.emp_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.emp_code
     *
     * @param empCode the value for t_guard_area.emp_code
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setEmpCode(String empCode) {
        this.empCode = empCode == null ? null : empCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.emp_phone
     *
     * @return the value of t_guard_area.emp_phone
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getEmpPhone() {
        return empPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.emp_phone
     *
     * @param empPhone the value for t_guard_area.emp_phone
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.emp_name
     *
     * @return the value of t_guard_area.emp_name
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.emp_name
     *
     * @param empName the value for t_guard_area.emp_name
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.create_fid
     *
     * @return the value of t_guard_area.create_fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public String getCreateFid() {
        return createFid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.create_fid
     *
     * @param createFid the value for t_guard_area.create_fid
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.create_date
     *
     * @return the value of t_guard_area.create_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.create_date
     *
     * @param createDate the value for t_guard_area.create_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.last_modify_date
     *
     * @return the value of t_guard_area.last_modify_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.last_modify_date
     *
     * @param lastModifyDate the value for t_guard_area.last_modify_date
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guard_area.is_del
     *
     * @return the value of t_guard_area.is_del
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guard_area.is_del
     *
     * @param isDel the value for t_guard_area.is_del
     *
     * @mbggenerated Tue Jul 05 14:51:00 CST 2016
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}