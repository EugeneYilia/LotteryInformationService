package com.eugenestudio.EugeneWechatServer.model;

public class SportsBLOB {

    private String processWinJsonArray;

    private String processDrawJsonArray;

    private String processLoseJsonArray;

    public String getProcessWinJsonArray() {
        return processWinJsonArray;
    }

    public void setProcessWinJsonArray(String processWinJsonArray) {
        this.processWinJsonArray = processWinJsonArray == null ? null : processWinJsonArray.trim();
    }

    public String getProcessDrawJsonArray() {
        return processDrawJsonArray;
    }

    public void setProcessDrawJsonArray(String processDrawJsonArray) {
        this.processDrawJsonArray = processDrawJsonArray == null ? null : processDrawJsonArray.trim();
    }

    public String getProcessLoseJsonArray() {
        return processLoseJsonArray;
    }

    public void setProcessLoseJsonArray(String processLoseJsonArray) {
        this.processLoseJsonArray = processLoseJsonArray == null ? null : processLoseJsonArray.trim();
    }

}
