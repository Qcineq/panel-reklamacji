package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.servicepanel.entity.ReportEntity;

public interface TechnicianEntity extends JpaRepository<ReportEntity, Long> {

}
