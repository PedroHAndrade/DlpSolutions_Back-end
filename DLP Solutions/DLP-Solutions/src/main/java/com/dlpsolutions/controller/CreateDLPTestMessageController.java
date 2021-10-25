package com.dlpsolutions.controller;

import com.dlpsolutions.api.CreateDLPTestMessageApi;
import com.dlpsolutions.api.model.CreateDLPTestMessageApiRequest;
import com.dlpsolutions.domain.repository.DlpMessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class CreateDLPTestMessageController implements CreateDLPTestMessageApi {

    private DlpMessageRepository dlpMessageRepository;

    public CreateDLPTestMessageController(DlpMessageRepository dlpMessageRepository) {
        this.dlpMessageRepository = dlpMessageRepository;
    }

    @Override
    public String execute(@Valid CreateDLPTestMessageApiRequest createDLPTestMessageApiRequest) {

        this.dlpMessageRepository.save(createDLPTestMessageApiRequest.toDomain());


        return "Sua requisição POST foi um sucesso! Se você está tentando bloquear esta ação via DLP, tente novamente.";

    }
}
