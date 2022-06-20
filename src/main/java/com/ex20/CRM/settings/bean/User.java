package com.ex20.CRM.settings.bean;

/**
 * 创建时间: 2022-03-24 14:43<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
public class User {
    /*
        对于登录:
            验证账号和密码
            执行SQL语句select * from tbl_user where loginAct=? and loginPwd=?
            最后使用User封装
            如果user对象为空则账号密码错误
            如果user对象不为null 说明账号密码正确 但
            仍需要向下验证其他的字段信息
            从user中get到
                expireTime 验证失效时间
                lockState  验证锁定状态
                allowIps   验证浏览器端的IP地址是否有效
     */

    /**
     * 编号 主键
     */
    private String id;
    /**
     * 登录账号
     */
    private String loginAct;
    /**
     * 用户的真实姓名
     */
    private String name;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 邮箱
     */
    private String email;
   /**
    * 失效时间 19/ms
    */
    private String expireTime;
    /**
     * 锁定状态 <br/>0:锁定<br/> 1:启用
     */
    private String lockState;
    /**
     * 部门编号
     */
    private String deptno;
    /**
     * 允许访问的IP地址
     */
    private String allowIps;
    /**
     * 创建时间 19/ms
     */
    private String createTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改时间 19/ms
     */
   private String editTime;
    /**
     * 修改人
     */
   private String editBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }
}
