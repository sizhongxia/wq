package org.tm.pro.entity;

import java.io.Serializable;

public class AnalysisData implements Serializable {
    private Integer id;

    private String smac;

    private String dmac;

    private Integer rssi;

    private Long ts;

    private Long ct;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSmac() {
        return smac;
    }

    public void setSmac(String smac) {
        this.smac = smac == null ? null : smac.trim();
    }

    public String getDmac() {
        return dmac;
    }

    public void setDmac(String dmac) {
        this.dmac = dmac == null ? null : dmac.trim();
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

    public Long getCt() {
        return ct;
    }

    public void setCt(Long ct) {
        this.ct = ct;
    }
}