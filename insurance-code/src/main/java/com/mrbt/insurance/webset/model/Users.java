package com.mrbt.insurance.webset.model;

import java.util.Date;

public class Users {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.u_id
     *
     * @mbggenerated
     */
    private String uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.login_id
     *
     * @mbggenerated
     */
    private String loginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.pass_word
     *
     * @mbggenerated
     */
    private String passWord;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.crate_time
     *
     * @mbggenerated
     */
    private Date crateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.u_id
     *
     * @return the value of users.u_id
     *
     * @mbggenerated
     */
    public String getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.u_id
     *
     * @param uId the value for users.u_id
     *
     * @mbggenerated
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.login_id
     *
     * @return the value of users.login_id
     *
     * @mbggenerated
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.login_id
     *
     * @param loginId the value for users.login_id
     *
     * @mbggenerated
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.login_name
     *
     * @return the value of users.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.login_name
     *
     * @param loginName the value for users.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.pass_word
     *
     * @return the value of users.pass_word
     *
     * @mbggenerated
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.pass_word
     *
     * @param passWord the value for users.pass_word
     *
     * @mbggenerated
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.nick_name
     *
     * @return the value of users.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.nick_name
     *
     * @param nickName the value for users.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.crate_time
     *
     * @return the value of users.crate_time
     *
     * @mbggenerated
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.crate_time
     *
     * @param crateTime the value for users.crate_time
     *
     * @mbggenerated
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }
}