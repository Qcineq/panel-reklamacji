package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.servicepanel.entity.ReportEntity;

import java.util.List;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

    List<ReportEntity> findByCustomerEmail(String email);

}
