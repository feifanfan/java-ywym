package com.hackerff.code.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class YwymAction implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "权限英文")
    private String action;

    @ApiModelProperty(value = "权限链接")
    private String actionlink;

    @ApiModelProperty(value = "权限名称")
    private String actionname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionlink() {
        return actionlink;
    }

    public void setActionlink(String actionlink) {
        this.actionlink = actionlink;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action=").append(action);
        sb.append(", actionlink=").append(actionlink);
        sb.append(", actionname=").append(actionname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}