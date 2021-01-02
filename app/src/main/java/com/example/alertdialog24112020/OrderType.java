package com.example.alertdialog24112020;

public enum OrderType {
    SEND_NOTIFICATION(1) , USER_SEND_MESS(2) , NEW_VERSION(3);
    private final int  value;

    OrderType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 1 : Gui push notification
    // 2 : User gui tin nhan
    // 3 : Thong bao co version moi
}
