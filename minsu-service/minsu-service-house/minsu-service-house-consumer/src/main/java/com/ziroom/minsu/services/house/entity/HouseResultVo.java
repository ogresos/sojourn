package com.ziroom.minsu.services.house.entity;

import java.util.*;

import com.asura.framework.base.entity.BaseEntity;


/**
 * 
 * <p>特洛伊查询列表vo</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author liujun
 * @since 1.0
 * @version 1.0
 */
public class HouseResultVo extends BaseEntity{
	
	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = -3795606373861275047L;

	// 逻辑id
	private String fid;

	// 房东uid
	private String landlordUid;

	// 房东姓名
	private String landlordName;

	// 房东手机
	private String landlordMobile;
	
	// 管家工号
	@Deprecated 
	private String zoJobNum;//现有管家来自房源管家关系表 下次上线之后可删除

	// 管家姓名
	@Deprecated
	private String zoName;//现有管家来自房源管家关系表 下次上线之后可删除
	
	// 管家手机
	@Deprecated
	private String zoMobile;//现有管家来自房源管家关系表 下次上线之后可删除

	// 摄影师姓名
	private String cameramanName;

	// 摄影师手机号
	private String cameramanMobile;
	
	// 房源详细地址
	private String houseAddr;
	
	// 房源名称
	private String houseName;
	
	// 房间类型 0：房间   1：客厅
	private Integer roomType;
	
	// 房间类型 0：房间   1：客厅
	private String roomTypeStr;
	
	// 是否有图片(0:否，1：是)
	private Integer isPic;
	
	// 房源状态(10:待发布,11:已发布,20:信息审核通过,21:信息审核未通过,30:照片审核未通过,40:上架,41:下架,50:强制下架)
	private Integer houseStatus;
	
	// 房源出租类型
	private Integer rentWay;
	
	// 房源类型
	private Integer houseType;
	
	// 房源权重
	private Integer weight;
	
	//房源编号
	private String houseSn;
	
	//房间编号
	private String roomSn;
	
	//创建时间
	private Date createDate;
	
	//创建时间
	private Date lastModifyDate;
	
	//上架时间
	private Date onlineDate;
	
	//管家审核通过日期
	private Date zoDate;
	
	//地推管家工号
	private String empPushCode;
	
	//地推管家姓名
	private String empPushName;
	
	//地推管家手机
	private String empPushMobile;

	//维护管家工号
	private String empGuardCode;
	
	//维护管家姓名
	private String empGuardName;
	
	//维护管家手机
	private String empGuardMobile;
	
	/**
	 * 房源渠道  0:地推, 1:直营, 2:房东
	 */
	private Integer houseChannel;
	//房源品质审核等级
	private String houseQualityGrade;
	
	@Deprecated //审核说明
	private Integer cause;
	
	//审核说明
	private String auditCause;
	/**
	 * 房源最新发布时间
	 */
	private Date lastDeployDate;
	
	public Integer getHouseChannel() {
		return houseChannel;
	}

	public void setHouseChannel(Integer houseChannel) {
		this.houseChannel = houseChannel;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getHouseSn() {
		return houseSn;
	}

	public void setHouseSn(String houseSn) {
		this.houseSn = houseSn;
	}

	public String getRoomSn() {
		return roomSn;
	}

	public void setRoomSn(String roomSn) {
		this.roomSn = roomSn;
	}

	public String getFid() {
		return fid;
	}
	
	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getLandlordUid() {
		return landlordUid;
	}

	public void setLandlordUid(String landlordUid) {
		this.landlordUid = landlordUid;
	}

	public String getLandlordName() {
		return landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}

	public String getLandlordMobile() {
		return landlordMobile;
	}

	public void setLandlordMobile(String landlordMobile) {
		this.landlordMobile = landlordMobile;
	}

	public String getZoJobNum() {
		return zoJobNum;
	}

	public void setZoJobNum(String zoJobNum) {
		this.zoJobNum = zoJobNum;
	}

	public String getZoName() {
		return zoName;
	}

	public void setZoName(String zoName) {
		this.zoName = zoName;
	}

	public String getZoMobile() {
		return zoMobile;
	}

	public void setZoMobile(String zoMobile) {
		this.zoMobile = zoMobile;
	}

	public String getCameramanName() {
		return cameramanName;
	}

	public void setCameramanName(String cameramanName) {
		this.cameramanName = cameramanName;
	}

	public String getCameramanMobile() {
		return cameramanMobile;
	}

	public void setCameramanMobile(String cameramanMobile) {
		this.cameramanMobile = cameramanMobile;
	}

	public String getHouseAddr() {
		return houseAddr;
	}

	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}
	
	public String getHouseName() {
		return houseName;
	}
	
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public Integer getIsPic() {
		return isPic;
	}

	public void setIsPic(Integer isPic) {
		this.isPic = isPic;
	}

	public Integer getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(Integer houseStatus) {
		this.houseStatus = houseStatus;
	}

	public Integer getRentWay() {
		return rentWay;
	}

	public void setRentWay(Integer rentWay) {
		this.rentWay = rentWay;
	}

	public Integer getHouseType() {
		return houseType;
	}

	public void setHouseType(Integer houseType) {
		this.houseType = houseType;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Date getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}
	
	public Date getZoDate() {
		return zoDate;
	}


	public void setZoDate(Date zoDate) {
		this.zoDate = zoDate;
	}

	public String getEmpPushCode() {
		return empPushCode;
	}

	public void setEmpPushCode(String empPushCode) {
		this.empPushCode = empPushCode;
	}
	
	public String getEmpPushName() {
		return empPushName;
	}
	
	public void setEmpPushName(String empPushName) {
		this.empPushName = empPushName;
	}

	public String getEmpPushMobile() {
		return empPushMobile;
	}

	public void setEmpPushMobile(String empPushMobile) {
		this.empPushMobile = empPushMobile;
	}

	public String getEmpGuardCode() {
		return empGuardCode;
	}

	public void setEmpGuardCode(String empGuardCode) {
		this.empGuardCode = empGuardCode;
	}
	
	public String getEmpGuardName() {
		return empGuardName;
	}
	
	public void setEmpGuardName(String empGuardName) {
		this.empGuardName = empGuardName;
	}

	public String getEmpGuardMobile() {
		return empGuardMobile;
	}

	public void setEmpGuardMobile(String empGuardMobile) {
		this.empGuardMobile = empGuardMobile;
	}

	public Integer getCause() {
		return cause;
	}

	public void setCause(Integer cause) {
		this.cause = cause;
	}

	public String getHouseQualityGrade() {
		return houseQualityGrade;
	}

	public void setHouseQualityGrade(String houseQualityGrade) {
		this.houseQualityGrade = houseQualityGrade;
	}

	public String getAuditCause() {
		return auditCause;
	}

	public void setAuditCause(String auditCause) {
		this.auditCause = auditCause;
	}

	public Date getLastDeployDate() {
		return lastDeployDate;
	}

	public void setLastDeployDate(Date lastDeployDate) {
		this.lastDeployDate = lastDeployDate;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public Integer getRoomType() {
		return roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public String getRoomTypeStr() {
		return roomTypeStr;
	}

	public void setRoomTypeStr(String roomTypeStr) {
		this.roomTypeStr = roomTypeStr;
	}
	
}
