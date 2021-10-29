package org.example.domain;

import java.util.Date;

public class Mechanism {
    private int id;
    private String name;
    private String pinyin_name;
    private Date create_time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin_name() {
        return pinyin_name;
    }

    public void setPinyin_name(String pinyin_name) {
        this.pinyin_name = pinyin_name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }


    @Override
    public String toString() {
        return "mechanism{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pinyin_name='" + pinyin_name + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
