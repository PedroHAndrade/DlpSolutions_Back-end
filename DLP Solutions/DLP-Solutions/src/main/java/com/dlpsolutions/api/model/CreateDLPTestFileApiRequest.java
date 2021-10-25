package com.dlpsolutions.api.model;

import com.dlpsolutions.domain.DlpMessage;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

public class CreateDLPTestFileApiRequest {

    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public CreateDLPTestFileApiRequest() {
    }

    public CreateDLPTestFileApiRequest(MultipartFile file) {
        this.file = file;
    }
}