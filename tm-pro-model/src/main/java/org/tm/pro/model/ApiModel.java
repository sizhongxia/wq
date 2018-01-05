package org.tm.pro.model;

import java.io.Serializable;
import java.util.List;

public class ApiModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String smac;
	private Integer count;
	private List<MacData> data;

	public String getSmac() {
		return smac;
	}

	public void setSmac(String smac) {
		this.smac = smac;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<MacData> getData() {
		return data;
	}

	public void setData(List<MacData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApiModel [smac=" + smac + ", count=" + count + ", data=" + data + "]";
	}

}
