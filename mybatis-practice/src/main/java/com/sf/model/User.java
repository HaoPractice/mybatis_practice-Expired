package com.sf.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.username
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.email
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.password
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.create_time
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.username
     *
     * @return the value of user_1.username
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.username
     *
     * @param username the value for user_1.username
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.email
     *
     * @return the value of user_1.email
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.email
     *
     * @param email the value for user_1.email
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.password
     *
     * @return the value of user_1.password
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.password
     *
     * @param password the value for user_1.password
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.create_time
     *
     * @return the value of user_1.create_time
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.create_time
     *
     * @param createTime the value for user_1.create_time
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}