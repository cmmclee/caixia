package com.caixia.entity;

import java.util.Date;

public class DateEvent {
    private Long id;

    private String dateTime;

    private String dateCity;

    private String dateAct;

    private Date createTime;

    private Date updateTime;

    private Integer score;

    private String remark;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 约会时间
     * @return date_time 约会时间
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 约会时间
     * @param dateTime 约会时间
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime == null ? null : dateTime.trim();
    }

    /**
     * 城市
     * @return date_city 城市
     */
    public String getDateCity() {
        return dateCity;
    }

    /**
     * 城市
     * @param dateCity 城市
     */
    public void setDateCity(String dateCity) {
        this.dateCity = dateCity == null ? null : dateCity.trim();
    }

    /**
     * 活动
     * @return date_act 活动
     */
    public String getDateAct() {
        return dateAct;
    }

    /**
     * 活动
     * @param dateAct 活动
     */
    public void setDateAct(String dateAct) {
        this.dateAct = dateAct == null ? null : dateAct.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 评价；分数
     * @return score 评价；分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 评价；分数
     * @param score 评价；分数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 备注；评价
     * @return remark 备注；评价
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注；评价
     * @param remark 备注；评价
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}