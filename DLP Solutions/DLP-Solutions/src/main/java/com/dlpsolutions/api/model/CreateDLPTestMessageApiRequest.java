package com.dlpsolutions.api.model;

import com.dlpsolutions.domain.DlpMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


public class CreateDLPTestMessageApiRequest {

    private String text;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public DlpMessage toDomain(){
        return new DlpMessage(this.text,this.createdAt);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateDLPTestMessageApiRequest() {
    }

    public CreateDLPTestMessageApiRequest(String text, LocalDateTime createdAt) {
        this.text = text;
        this.createdAt = createdAt;
    }
}
