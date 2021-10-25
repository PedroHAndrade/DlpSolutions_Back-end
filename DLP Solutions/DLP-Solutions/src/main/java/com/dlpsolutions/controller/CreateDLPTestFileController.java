package com.dlpsolutions.controller;


import com.dlpsolutions.api.CreateDLPTestFileApi;
import com.dlpsolutions.api.model.CreateDLPTestFileApiRequest;
import com.dlpsolutions.domain.DlpFile;
import com.dlpsolutions.domain.repository.DlpFileRepository;
import com.dlpsolutions.domain.repository.DlpMessageRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
public class CreateDLPTestFileController implements CreateDLPTestFileApi {

    private DlpFileRepository dlpFileRepository;

    public CreateDLPTestFileController(DlpFileRepository dlpFileRepository) {
        this.dlpFileRepository = dlpFileRepository;
    }


    @Override
    public String execute(MultipartFile file) {

        DlpFile dlpFile = new DlpFile(file.getOriginalFilename(), LocalDateTime.now());

        this.dlpFileRepository.save(dlpFile);

        return "Sua requisição POST foi um sucesso! Se você está tentando bloquear esta ação via DLP, tente novamente. " +file.getOriginalFilename();
    }
}
