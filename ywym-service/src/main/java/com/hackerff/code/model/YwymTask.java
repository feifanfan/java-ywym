package com.hackerff.code.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class YwymTask implements Serializable {
    private Integer id;

    private Integer codeCount;

    private Integer gid;

    private String isvApplicationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeCount() {
        return codeCount;
    }

    public void setCodeCount(Integer codeCount) {
        this.codeCount = codeCount;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getIsvApplicationId() {
        return isvApplicationId;
    }

    public void setIsvApplicationId(String isvApplicationId) {
        this.isvApplicationId = isvApplicationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", codeCount=").append(codeCount);
        sb.append(", gid=").append(gid);
        sb.append(", isvApplicationId=").append(isvApplicationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}