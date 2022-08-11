package pl.coderslab.servicepanel.service;

import org.springframework.stereotype.Service;
import pl.coderslab.servicepanel.repository.ReportRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReportsService {

    private ReportRepository reportRepository;
}
