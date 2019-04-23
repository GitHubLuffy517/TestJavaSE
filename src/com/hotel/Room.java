package com.hotel;

public class Room {
    private int id;
    private String type;
    private Boolean isUse;
    public Room(){

    }

    public Room(int id, String type, Boolean isUse) {
        this.id = id;
        this.type = type;
        this.isUse = isUse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUse() {
        return isUse;
    }

    public void setUse(Boolean use) {
        isUse = use;
    }
}
