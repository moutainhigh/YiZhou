package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWechatMenu<M extends BaseWechatMenu<M>> extends Model<M> implements IBean {

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

	public void setType(String type) {
		set("type", type);
	}

	public String getType() {
		return get("type");
	}

	public void setUrl(String url) {
		set("url", url);
	}

	public String getUrl() {
		return get("url");
	}

	public void setMediaId(String mediaId) {
		set("media_id", mediaId);
	}

	public String getMediaId() {
		return get("media_id");
	}

	public void setParent(Integer parent) {
		set("parent", parent);
	}

	public Integer getParent() {
		return get("parent");
	}

	public void setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("last_update_time", lastUpdateTime);
	}

	public java.util.Date getLastUpdateTime() {
		return get("last_update_time");
	}

}
