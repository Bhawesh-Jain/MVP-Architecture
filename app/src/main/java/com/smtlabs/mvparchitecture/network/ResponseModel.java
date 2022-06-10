package com.smtlabs.mvparchitecture.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("_token")
    @Expose
    private String token;
    @SerializedName("data")
    @Expose
    private ResponseData ResponseData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ResponseData getData() {
        return ResponseData;
    }

    public void setData(ResponseData ResponseData) {
        this.ResponseData = ResponseData;
    }

}