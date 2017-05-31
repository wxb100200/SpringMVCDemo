package com.gaussic.util;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
public class ApiResult  {
    private String api;
    private Ret ret;
    private String v;
    private List<Object> data;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Ret getRet() {
        return ret;
    }

    public void setRet(Ret ret) {
        this.ret = ret;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public static ApiResult single(String api,Object obj){
        return list(api, Arrays.asList(new Object[]{obj}));
    }
    public static ApiResult list(String api, List list){
        return multiple(api,list,list.size(),"200",null);
    }
    public static ApiResult error(String api,String errorCode,String errorMessage){
        return multiple(api,null,0,errorCode,errorMessage);
    }
    public static ApiResult error(String api,String errorCode,Throwable exception){
        return multiple(api,null,0,errorCode,exception.getMessage()+"错误详情");
    }
    private static ApiResult multiple(String api,List list,int total,String errorCode,String errorMessage){
        Ret ret=new Ret();
        ret.setCode(errorCode);
        ret.setErrorMessage(errorMessage);

        ApiResult result=new ApiResult();
        result.api=api;
        result.data=list;
        result.ret=ret;
        result.v="";
        return result;
    }
}
