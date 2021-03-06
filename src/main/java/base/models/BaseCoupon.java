package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCoupon<M extends BaseCoupon<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setCouponTitle(String couponTitle) {
		set("coupon_title", couponTitle);
	}

	public String getCouponTitle() {
		return get("coupon_title");
	}

	public void setCouponDesc(String couponDesc) {
		set("coupon_desc", couponDesc);
	}

	public String getCouponDesc() {
		return get("coupon_desc");
	}

	public void setOneFlag(Boolean oneFlag) {
		set("one_flag", oneFlag);
	}

	public Boolean getOneFlag() {
		return get("one_flag");
	}

	public void setPriceFlag(Boolean priceFlag) {
		set("price_flag", priceFlag);
	}

	public Boolean getPriceFlag() {
		return get("price_flag");
	}

	public void setMiniPrice(java.math.BigDecimal miniPrice) {
		set("mini_price", miniPrice);
	}

	public java.math.BigDecimal getMiniPrice() {
		return get("mini_price");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setStatus(Integer status) {
		set("status", status);
	}

	public Integer getStatus() {
		return get("status");
	}

	public void setAuditTime(java.util.Date auditTime) {
		set("audit_time", auditTime);
	}

	public java.util.Date getAuditTime() {
		return get("audit_time");
	}

	public void setCreater(Integer creater) {
		set("creater", creater);
	}

	public Integer getCreater() {
		return get("creater");
	}

	public void setCompany(Integer company) {
		set("company", company);
	}

	public Integer getCompany() {
		return get("company");
	}

	public void setServiceType(Integer serviceType) {
		set("service_type", serviceType);
	}

	public Integer getServiceType() {
		return get("service_type");
	}

	public void setCouponType(Integer couponType) {
		set("coupon_type", couponType);
	}

	public Integer getCouponType() {
		return get("coupon_type");
	}

	public void setBaseAmount(java.math.BigDecimal baseAmount) {
		set("base_amount", baseAmount);
	}

	public java.math.BigDecimal getBaseAmount() {
		return get("base_amount");
	}

	public void setPercent(java.math.BigDecimal percent) {
		set("percent", percent);
	}

	public java.math.BigDecimal getPercent() {
		return get("percent");
	}

	public void setPercenAmount(java.math.BigDecimal percenAmount) {
		set("percent_amount", percenAmount);
	}

	public java.math.BigDecimal getPercenAmount() {
		return get("percent_amount");
	}

}
