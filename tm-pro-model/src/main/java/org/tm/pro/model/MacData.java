package org.tm.pro.model;

import java.io.Serializable;

public class MacData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String dmac;
	private Integer rssi;
	private Long ts;

	public String getDmac() {
		return dmac;
	}

	public void setDmac(String dmac) {
		this.dmac = dmac;
	}

	public Integer getRssi() {
		return rssi;
	}

	public void setRssi(Integer rssi) {
		this.rssi = rssi;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "MacData [dmac=" + dmac + ", rssi=" + rssi + ", ts=" + ts + "]";
	}

}
