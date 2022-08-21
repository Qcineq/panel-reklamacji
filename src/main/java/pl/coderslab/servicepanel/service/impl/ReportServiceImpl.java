package pl.coderslab.servicepanel.service.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.servicepanel.entity.ReportEntity;
import pl.coderslab.servicepanel.repository.ReportRepository;
import pl.coderslab.servicepanel.service.ReportService;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public List<ReportEntity> getAllReports() {
        return reportRepository.findAll();
    }

    @Override
    public ReportEntity saveReport(ReportEntity report) {
        return reportRepository.save(report);
    }

    @Override
    public ReportEntity getReportById(Long id) {
        return reportRepository.findById(id).get();
    }

    @Override
    public ReportEntity reportDetails(ReportEntity report) {
        return reportRepository.save(report);
    }

}
