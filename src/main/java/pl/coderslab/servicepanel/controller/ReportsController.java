package pl.coderslab.servicepanel.controller;

import org.springframework.stereotype.Controller;
import pl.coderslab.servicepanel.repository.CustomerRepository;
import pl.coderslab.servicepanel.repository.ReportRepository;

@Controller
class ReportsController {

    private CustomerRepository customerRepository;
    private ReportRepository reportRepository;

    public ReportsController(CustomerRepository customerRepository, ReportRepository reportRepository) {
        this.customerRepository = customerRepository;
        this.reportRepository = reportRepository;
    }


}
