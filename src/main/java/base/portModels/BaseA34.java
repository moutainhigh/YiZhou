package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA34<M extends BaseA34<M>> extends Model<M> implements IBean {

	/*public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}*/

	@JSONField(name = "CompanyId")
	public void setCompanyId(String CompanyId) {
		set("CompanyId", CompanyId);
	}
	@JSONField(name = "CompanyId")
	public String getCompanyId() {
		return get("CompanyId");
	}

	@JSONField(name = "Address")
	public void setAddress(Integer Address) {
		set("Address", Address);
	}
	@JSONField(name = "Address")
	public Integer getAddress() {
		return get("Address");
	}

	@JSONField(name = "OrderId")
	public void setOrderId(String OrderId) {
		set("OrderId", OrderId);
	}
	@JSONField(name = "OrderId")
	public String getOrderId() {
		return get("OrderId");
	}

	@JSONField(name = "Longitude")
	public void setLongitude(Long Longitude) {
		set("Longitude", Longitude);
	}
	@JSONField(name = "Longitude")
	public Long getLongitude() {
		return get("Longitude");
	}

	@JSONField(name = "Latitude")
	public void setLatitude(Long Latitude) {
		set("Latitude", Latitude);
	}
	@JSONField(name = "Latitude")
	public Long getLatitude() {
		return get("Latitude");
	}

	@JSONField(name = "Encrypt")
	public void setEncrypt(Integer Encrypt) {
		set("Encrypt", Encrypt);
	}
	@JSONField(name = "Encrypt")
	public Integer getEncrypt() {
		return get("Encrypt");
	}

	@JSONField(name = "LicenseId")
	public void setLicenseId(String LicenseId) {
		set("LicenseId", LicenseId);
	}
	@JSONField(name = "LicenseId")
	public String getLicenseId() {
		return get("LicenseId");
	}

	@JSONField(name = "DriverPhone")
	public void setDriverPhone(String DriverPhone) {
		set("DriverPhone", DriverPhone);
	}
	@JSONField(name = "DriverPhone")
	public String getDriverPhone() {
		return get("DriverPhone");
	}

	@JSONField(name = "VehicleNo")
	public void setVehicleNo(String VehicleNo) {
		set("VehicleNo", VehicleNo);
	}
	@JSONField(name = "VehicleNo")
	public String getVehicleNo() {
		return get("VehicleNo");
	}

	@JSONField(name = "DistributeTime")
	public void setDistributeTime(Long DistributeTime) {
		set("DistributeTime", DistributeTime);
	}
	@JSONField(name = "DistributeTime")
	public Long getDistributeTime() {
		return get("DistributeTime");
	}

}
