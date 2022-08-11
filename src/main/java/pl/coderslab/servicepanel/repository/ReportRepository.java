package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.servicepanel.entity.ReportEntity;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

    @Query("SELECT r FROM ReportEntity r WHERE r.id = :id")
    List<ReportEntity> findByLastName(@Param("id") Long id);

}
