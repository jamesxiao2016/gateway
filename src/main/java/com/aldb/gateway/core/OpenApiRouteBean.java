/**
 * 
 */
package com.aldb.gateway.core;

import java.util.Map;
import java.util.Properties;

/**
 * @author Administrator
 *
 */
public class OpenApiRouteBean {

    private String reqId; // 内部定义的请求id

    private String apiId;
    private String requestMethod;
    private String version; // api_version
    private String timeStamp;

    private Map<String, String> reqHeader;

    private String operationType;

    private String serviceReqData;//post请求方法参数
    private String queryString; // 请求string
    private Properties thdApiUrlParams;// 第三方接口所需传入的url参数

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public Properties getThdApiUrlParams() {
        return this.thdApiUrlParams;
    }

    public void addThdApiUrlParams(String key, String value) {
        if (thdApiUrlParams == null) {
            this.thdApiUrlParams = new Properties();
        }
        this.thdApiUrlParams.put(key, value);
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getServiceReqData() {
        return serviceReqData;
    }

    public void setServiceReqData(String serviceReqData) {
        this.serviceReqData = serviceReqData;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Map<String, String> getReqHeader() {
        return reqHeader;
    }

    public void setReqHeader(Map<String, String> reqHeader) {
        this.reqHeader = reqHeader;
    }

}