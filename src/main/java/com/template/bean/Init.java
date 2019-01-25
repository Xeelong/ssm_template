package com.template.bean;

public class Init {
    private Integer initId;

    private String initContent;

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
    }

    public String getInitContent() {
        return initContent;
    }

    public void setInitContent(String initContent) {
        this.initContent = initContent == null ? null : initContent.trim();
    }
}