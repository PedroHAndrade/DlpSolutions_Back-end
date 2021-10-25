package com.dlpsolutions.domain.repository;

import com.dlpsolutions.domain.DlpMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DlpMessageRepository extends JpaRepository<DlpMessage,Long> {

}
