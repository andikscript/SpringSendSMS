package com.example.springsendsms.model;

public class MessagePhone {

    private String toPhone;

    private String fromPhone;

    private String message;

    public MessagePhone(String toPhone, String fromPhone, String message) {
        this.toPhone = toPhone;
        this.fromPhone = fromPhone;
        this.message = message;
    }

    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String toPhone) {
        this.toPhone = toPhone;
    }

    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String fromPhone) {
        this.fromPhone = fromPhone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
