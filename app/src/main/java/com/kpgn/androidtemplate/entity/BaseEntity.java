package com.kpgn.androidtemplate.entity;


public abstract class BaseEntity {

    private long rowUpdated;

    public long getRowUpdated() {
        return rowUpdated;
    }

    public void setRowUpdated(long rowUpdated) {
        this.rowUpdated = rowUpdated;
    }

}
