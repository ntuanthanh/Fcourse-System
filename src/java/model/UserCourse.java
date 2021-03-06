/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author thand
 */
public class UserCourse {
    private int userCourseId;
    private User user;
    private Course course;
    private Date startDate;
    private Date endDate;
    private PricePackage pricePackage;
    private Status registration_status;
    private User createBy; 
    private User updateBy; 

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }
    
    public UserCourse() {
    }

    public int getUserCourseId() {
        return userCourseId;
    }

    public void setUserCourseId(int userCourseId) {
        this.userCourseId = userCourseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PricePackage getPricePackage() {
        return pricePackage;
    }

    public void setPricePackage(PricePackage pricePackage) {
        this.pricePackage = pricePackage;
    }

    public Status getRegistration_status() {
        return registration_status;
    }

    public void setRegistration_status(Status registration_status) {
        this.registration_status = registration_status;
    }

   
    
    
}
