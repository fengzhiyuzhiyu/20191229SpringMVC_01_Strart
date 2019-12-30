package xyz.twilightgleam.domain;

import java.io.Serializable;
import java.util.Date;

public class CustomizeDataType implements Serializable {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CustomizeDataType{" +
                "date=" + date +
                '}';
    }
}
