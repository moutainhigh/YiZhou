package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCompany<M extends BaseCompany<M>> extends Model<M> implements IBean {

    public void setPkId(Integer pkId) {
        set("pk_id", pkId);
    }

    public Integer getPkId() {
        return get("pk_id");
    }

    public void setId(Integer id) {
        set("id", id);
    }

    public Integer getId() {
        return get("id");
    }

    public void setName(String name) {
        set("name", name);
    }

    public String getName() {
        return get("name");
    }

    public void setProvince(String province) {
        set("province", province);
    }

    public String getProvince() {
        return get("province");
    }

    public void setCounty(String county) {
        set("county", county);
    }

    public String getCounty() {
        return get("county");
    }

    public void setCity(String city) {
        set("city", city);
    }

    public String getCity() {
        return get("city");
    }

    public void setPhone(String phone) {
        set("phone", phone);
    }

    public String getPhone() {
        return get("phone");
    }

    public void setDescription(String description) {
        set("description", description);
    }

    public String getDescription() {
        return get("description");
    }

    public void setAddress(String address) {
        set("address", address);
    }

    public String getAddress() {
        return get("address");
    }

    public void setLongitude(Double longitude) {
        set("longitude", longitude);
    }

    public Double getLongitude() {
        return get("longitude");
    }

    public void setLatitude(Double latitude) {
        set("latitude", latitude);
    }

    public Double getLatitude() {
        return get("latitude");
    }

    public void setPicture(String picture) {
        set("picture", picture);
    }

    public String getPicture() {
        return get("picture");
    }

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        set("last_update_time", lastUpdateTime);
    }

    public java.util.Date getLastUpdateTime() {
        return get("last_update_time");
    }

    public void setWebsite(String website) {
        set("website", website);
    }

    public String getWebsite() {
        return get("website");
    }

    public void setQq(String qq) {
        set("qq", qq);
    }

    public String getQq() {
        return get("qq");
    }

    public void setCreateTime(java.util.Date createTime) {
        set("create_time", createTime);
    }

    public java.util.Date getCreateTime() {
        return get("create_time");
    }
}
