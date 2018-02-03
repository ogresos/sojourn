package com.ziroom.minsu.entity.order;

import java.util.Date;

import com.asura.framework.base.entity.BaseEntity;
/**
 * 
 * <p>新旧订单关联表实体</p>
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
public class OrderRelationEntity extends BaseEntity{
	/**
	 * 序列id
	 */
	private static final long serialVersionUID = -8962009121928967527L;

	/**
	 * 编号
	 */
	private Integer id;

	/**
	 * 业务编号
	 */
	private String fid;

	/**
	 * 新订单编号
	 */
	private String newOrderSn;

	/**
	 * 旧订单编号
	 */
	private String oldOrderSn;

	/**
	 * 新旧订单差额 取差额的绝对值
	 */
	private Integer orderBalance;

	/**
	 * 审核状态 1=待审批 2=人工审核通过 3=系统审核通过 4=已拒绝 5=已付款
	 */
	private Integer checkedStatus;

	/**
	 * 创建人fid
	 */
	private String createdFid;

	/**
	 * 创建时间
	 */
	private Date createdTime;

	/**
	 * 最后修改时间
	 */
	private Date lastModifyDate;

	/**
	 * 审核人fid
	 */
	private String auditPersonFid;
	
	/**
	 * 关联人uid
	 */
	private String reUserUid;


	/**
	 * 客服恢复强制取消订单时间
	 */
	private Date recoveryTime;

	/**
	 * 客服同意强制取消订单时间
	 */
	private Date agreeTime;

	/**
	 * 强制取消申请时间
	 */
	private Date applyTime;



	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.id
	 *
	 * @return the value of t_order_relation.id
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.id
	 *
	 * @param id the value for t_order_relation.id
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.fid
	 *
	 * @return the value of t_order_relation.fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getFid() {
		return fid;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.fid
	 *
	 * @param fid the value for t_order_relation.fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setFid(String fid) {
		this.fid = fid == null ? null : fid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.new_order_sn
	 *
	 * @return the value of t_order_relation.new_order_sn
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getNewOrderSn() {
		return newOrderSn;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.new_order_sn
	 *
	 * @param newOrderSn the value for t_order_relation.new_order_sn
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setNewOrderSn(String newOrderSn) {
		this.newOrderSn = newOrderSn == null ? null : newOrderSn.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.old_order_sn
	 *
	 * @return the value of t_order_relation.old_order_sn
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getOldOrderSn() {
		return oldOrderSn;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.old_order_sn
	 *
	 * @param oldOrderSn the value for t_order_relation.old_order_sn
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setOldOrderSn(String oldOrderSn) {
		this.oldOrderSn = oldOrderSn == null ? null : oldOrderSn.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.order_balance
	 *
	 * @return the value of t_order_relation.order_balance
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Integer getOrderBalance() {
		return orderBalance;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.order_balance
	 *
	 * @param orderBalance the value for t_order_relation.order_balance
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setOrderBalance(Integer orderBalance) {
		this.orderBalance = orderBalance;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.checked_status
	 *
	 * @return the value of t_order_relation.checked_status
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Integer getCheckedStatus() {
		return checkedStatus;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.checked_status
	 *
	 * @param checkedStatus the value for t_order_relation.checked_status
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setCheckedStatus(Integer checkedStatus) {
		this.checkedStatus = checkedStatus;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.re_user_uid
	 *
	 * @return the value of t_order_relation.re_user_uid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getReUserUid() {
		return reUserUid;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.re_user_uid
	 *
	 * @param reUserUid the value for t_order_relation.re_user_uid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setReUserUid(String reUserUid) {
		this.reUserUid = reUserUid == null ? null : reUserUid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.created_fid
	 *
	 * @return the value of t_order_relation.created_fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getCreatedFid() {
		return createdFid;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.created_fid
	 *
	 * @param createdFid the value for t_order_relation.created_fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setCreatedFid(String createdFid) {
		this.createdFid = createdFid == null ? null : createdFid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.created_time
	 *
	 * @return the value of t_order_relation.created_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.created_time
	 *
	 * @param createdTime the value for t_order_relation.created_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.last_modify_date
	 *
	 * @return the value of t_order_relation.last_modify_date
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.last_modify_date
	 *
	 * @param lastModifyDate the value for t_order_relation.last_modify_date
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.recovery_time
	 *
	 * @return the value of t_order_relation.recovery_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Date getRecoveryTime() {
		return recoveryTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.recovery_time
	 *
	 * @param recoveryTime the value for t_order_relation.recovery_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.agree_time
	 *
	 * @return the value of t_order_relation.agree_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Date getAgreeTime() {
		return agreeTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.agree_time
	 *
	 * @param agreeTime the value for t_order_relation.agree_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setAgreeTime(Date agreeTime) {
		this.agreeTime = agreeTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.apply_time
	 *
	 * @return the value of t_order_relation.apply_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public Date getApplyTime() {
		return applyTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.apply_time
	 *
	 * @param applyTime the value for t_order_relation.apply_time
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column t_order_relation.audit_person_fid
	 *
	 * @return the value of t_order_relation.audit_person_fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public String getAuditPersonFid() {
		return auditPersonFid;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column t_order_relation.audit_person_fid
	 *
	 * @param auditPersonFid the value for t_order_relation.audit_person_fid
	 *
	 * @mbggenerated Tue Apr 26 14:09:12 CST 2016
	 */
	public void setAuditPersonFid(String auditPersonFid) {
		this.auditPersonFid = auditPersonFid == null ? null : auditPersonFid.trim();
	}
}