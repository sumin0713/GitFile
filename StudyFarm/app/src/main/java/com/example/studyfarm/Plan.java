package com.example.studyfarm;

import java.util.Date;

public class Plan  {
    private String st_id;
    private String st_name;
    private int st_startTime;
    private int st_goalTime;
    private int st_isState;
    private Date st_date;
    private String plant_id;
    private String user_id;

    public Plan(String st_name, String plant_id) {
        this.st_name = st_name;
        this.plant_id = plant_id;
    }

    public Plan(String st_id, String st_name, int st_startTime, int st_goalTime, int st_isState, Date st_date, String plant_id, String user_id) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_startTime = st_startTime;
        this.st_goalTime = st_goalTime;
        this.st_isState = st_isState;
        this.st_date = st_date;
        this.plant_id = plant_id;
        this.user_id = user_id;
    }

    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public int getSt_startTime() {
        return st_startTime;
    }

    public void setSt_startTime(int st_startTime) {
        this.st_startTime = st_startTime;
    }

    public int getSt_goalTime() {
        return st_goalTime;
    }

    public void setSt_goalTime(int st_goalTime) {
        this.st_goalTime = st_goalTime;
    }

    public int getSt_isState() {
        return st_isState;
    }

    public void setSt_isState(int st_isState) {
        this.st_isState = st_isState;
    }

    public Date getSt_date() {
        return st_date;
    }

    public void setSt_date(Date st_date) {
        this.st_date = st_date;
    }

    public String getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(String plant_id) {
        this.plant_id = plant_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
