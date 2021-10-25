package com.dlpsolutions.controller;

import com.dlpsolutions.api.CreateDLPTestMessageApi;
import com.dlpsolutions.api.model.CreateDLPTestMessageApiRequest;
import com.dlpsolutions.domain.DlpFile;
import com.dlpsolutions.domain.repository.DlpFileRepository;
import com.dlpsolutions.domain.repository.DlpMessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("dlp/mock")
@Slf4j
public class CreateDLPTestFileMockController implements CreateDLPTestMessageApi {

    private DlpFileRepository dlpFileRepository;

    public CreateDLPTestFileMockController(DlpFileRepository dlpFileRepository) {
        this.dlpFileRepository = dlpFileRepository;
    }

    @Override
    public String execute(@Valid CreateDLPTestMessageApiRequest request) {

        this.dlpFileRepository.save(new DlpFile(request.getText(), request.getCreatedAt()));

        return "Sua requisição POST foi um sucesso! Se você está tentando bloquear esta ação via DLP, tente novamente.";

    }
}
