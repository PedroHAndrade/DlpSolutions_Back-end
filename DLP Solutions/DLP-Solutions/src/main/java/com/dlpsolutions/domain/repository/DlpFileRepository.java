package com.dlpsolutions.domain.repository;

import com.dlpsolutions.domain.DlpFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DlpFileRepository extends JpaRepository<DlpFile, Long> {
}
