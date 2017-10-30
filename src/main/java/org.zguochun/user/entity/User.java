package org.zguochun.user.entity;

/**
 * decri:这是一个user表的实体类
 * @author zhengguocchun
 * @date: 2017/8/15
 */
public class User {
    //用户信息的主键id
    private int userId;
    //用户登录的账户名
    private String account;
    //用户登录的密码
    private String pwd;
    //用户的昵称或者实际的姓名
    private String nickName;
    //用户的性别
    private String sex;
    //用户的QQ
    private long qq;
    //用户所提供的邮箱地址
    private String email;
    //用户的签名
    private String label;
    //用户的兴趣爱好
    private String interest;

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int user_id) {
        this.userId = user_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick_name() {
        return nickName;
    }

    public void setNick_name(String nick_name) {
        this.nickName = nick_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getUser_iamge() {
        return userImage;
    }

    public void setUser_iamge(String user_iamge) {
        this.userImage = user_iamge;
    }
    //用户上传后头像的地址
    private String userImage;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex='" + sex + '\'' +
                ", qq=" + qq +
                ", email='" + email + '\'' +
                ", label='" + label + '\'' +
                ", interest='" + interest + '\'' +
                ", userImage='" + userImage + '\'' +
                ", roleId=" + roleId +
                '}';
    }
    //用户的角色，与外键与角色表的role_id对应
    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
