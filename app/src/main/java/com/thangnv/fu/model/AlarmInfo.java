package com.thangnv.fu.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ThangNV28 on 5/15/2017.
 */

public class AlarmInfo  extends RealmObject {
    @PrimaryKey
    private int id;
    private String timeAlarm;
    private boolean stateAlarm;

    public AlarmInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeAlarm() {
        return timeAlarm;
    }

    public void setTimeAlarm(String timeAlarm) {
        this.timeAlarm = timeAlarm;
    }

    public boolean isStateAlarm() {
        return stateAlarm;
    }

    public void setStateAlarm(boolean stateAlarm) {
        this.stateAlarm = stateAlarm;
    }

}
