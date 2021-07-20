package com.hackerff.code.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class YwymCompanyRole implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "公司id")
    private Integer cid;

    @ApiModelProperty(value = "角色名称")
    private Integer rolename;

    @ApiModelProperty(value = "角色权限，字符串 逗号分隔")
    private String roleaction;

    private Integer createtime;

    private Integer updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRolename() {
        return rolename;
    }

    public void setRolename(Integer rolename) {
        this.rolename = rolename;
    }

    public String getRoleaction() {
        return roleaction;
    }

    public void setRoleaction(String roleaction) {
        this.roleaction = roleaction;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", rolename=").append(rolename);
        sb.append(", roleaction=").append(roleaction);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}