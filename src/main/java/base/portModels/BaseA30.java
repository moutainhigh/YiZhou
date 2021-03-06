package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA30<M extends BaseA30<M>> extends Model<M> implements IBean {

//	public void setId(Long id) {
//		set("id", id);
//	}
//
//	public Long getId() {
//		return get("id");
//	}

	@JSONField(name = "CompanyId")
	public void setCompanyId(String CompanyId) {
		set("CompanyId", CompanyId);
	}
	@JSONField(name = "CompanyId")
	public String getCompanyId() {
		return get("CompanyId");
	}

	@JSONField(name = "RegisterDate")
	public void setRegisterDate(Long RegisterDate) {
		set("RegisterDate", RegisterDate);
	}
	@JSONField(name = "RegisterDate")
	public Long getRegisterDate() {
		return get("RegisterDate");
	}

	@JSONField(name = "PassengerPhone")
	public void setPassengerPhone(String PassengerPhone) {
		set("PassengerPhone", PassengerPhone);
	}
	@JSONField(name = "PassengerPhone")
	public String getPassengerPhone() {
		return get("PassengerPhone");
	}

	@JSONField(name = "PassengerName")
	public void setPassengerName(String PassengerName) {
		set("PassengerName", PassengerName);
	}

	@JSONField(name = "PassengerName")
	public String getPassengerName() {
		return get("PassengerName");
	}

	@JSONField(name = "PassengerGender")
	public void setPassengerGender(String PassengerGender) {
		set("PassengerGender", PassengerGender);
	}
	@JSONField(name = "PassengerGender")
	public String getPassengerGender() {
		return get("PassengerGender");
	}

	@JSONField(name = "State")
	public void setState(Integer State) {
		set("State", State);
	}
	@JSONField(name = "State")
	public Integer getState() {
		return get("State");
	}

	@JSONField(name = "Flag")
	public void setFlag(Integer Flag) {
		set("Flag", Flag);
	}
	@JSONField(name = "Flag")
	public Integer getFlag() {
		return get("Flag");
	}

	@JSONField(name = "UpdateTime")
	public void setUpdateTime(Long UpdateTime) {
		set("UpdateTime", UpdateTime);
	}
	@JSONField(name = "UpdateTime")
	public Long getUpdateTime() {
		return get("UpdateTime");
	}

}
