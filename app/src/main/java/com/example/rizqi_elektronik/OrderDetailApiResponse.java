package com.example.rizqi_elektronik;

import com.google.gson.annotations.SerializedName;

public class OrderDetailApiResponse {
    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private OrderDetailResponse data;

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public OrderDetailResponse getData() { return data; }
}