package com.user.lanhu.galaxy.result;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    private int code;
    private String msg = "successful";
    private T data;

    public Response(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response(int code, String msg){
        this.code = code;
        this.msg  = msg;
    }

    public Response(int code){
        this.code = code;
    }

    public Response(){}

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static Response success(){
        return new Response(0);
    }
}
