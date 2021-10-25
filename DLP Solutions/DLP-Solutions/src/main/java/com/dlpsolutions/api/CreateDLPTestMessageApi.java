package com.dlpsolutions.api;

import com.dlpsolutions.api.model.CreateDLPTestMessageApiRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/dlp/message")
public interface CreateDLPTestMessageApi {

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    String execute(@Valid @RequestBody final CreateDLPTestMessageApiRequest createDLPTestMessageApiRequest);


}
