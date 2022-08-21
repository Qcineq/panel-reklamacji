package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.servicepanel.entity.ReportEntity;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

}
