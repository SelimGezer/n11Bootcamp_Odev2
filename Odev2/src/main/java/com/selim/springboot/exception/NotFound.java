package com.selim.springboot.exception;

public class NotFound {

    private String mesaj;

    public NotFound(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

}
