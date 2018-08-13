package com.imooc.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration   //配置，引用资源文件
@ConfigurationProperties(prefix = "com.imooc.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsiete() {
        return websiete;
    }

    public void setWebsiete(String websiete) {
        this.websiete = websiete;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String websiete;
    private String language;
}
