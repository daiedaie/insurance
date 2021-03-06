package com.mrbt.insurance.webset.model;

import java.util.Date;

public class TrafficProduct {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column traffic_product.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column traffic_product.browse_number
     *
     * @mbggenerated
     */
    private String browseNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column traffic_product.browse_id
     *
     * @mbggenerated
     */
    private String browseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column traffic_product.p_id
     *
     * @mbggenerated
     */
    private String pId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column traffic_product.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column traffic_product.id
     *
     * @return the value of traffic_product.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column traffic_product.id
     *
     * @param id the value for traffic_product.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column traffic_product.browse_number
     *
     * @return the value of traffic_product.browse_number
     *
     * @mbggenerated
     */
    public String getBrowseNumber() {
        return browseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column traffic_product.browse_number
     *
     * @param browseNumber the value for traffic_product.browse_number
     *
     * @mbggenerated
     */
    public void setBrowseNumber(String browseNumber) {
        this.browseNumber = browseNumber == null ? null : browseNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column traffic_product.browse_id
     *
     * @return the value of traffic_product.browse_id
     *
     * @mbggenerated
     */
    public String getBrowseId() {
        return browseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column traffic_product.browse_id
     *
     * @param browseId the value for traffic_product.browse_id
     *
     * @mbggenerated
     */
    public void setBrowseId(String browseId) {
        this.browseId = browseId == null ? null : browseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column traffic_product.p_id
     *
     * @return the value of traffic_product.p_id
     *
     * @mbggenerated
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column traffic_product.p_id
     *
     * @param pId the value for traffic_product.p_id
     *
     * @mbggenerated
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column traffic_product.create_time
     *
     * @return the value of traffic_product.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column traffic_product.create_time
     *
     * @param createTime the value for traffic_product.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}