package com.dlpsolutions.api;


import com.dlpsolutions.api.model.CreateDLPTestFileApiRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RequestMapping(value = "dlp/file")
public interface CreateDLPTestFileApi {

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    String execute(@RequestParam("file")MultipartFile file);

}
