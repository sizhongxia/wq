package org.tm.pro.entity;

import java.io.Serializable;

public class RawData implements Serializable {
    private Integer id;

    private String smac;

    private Integer count;

    private String status;

    private String data;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}