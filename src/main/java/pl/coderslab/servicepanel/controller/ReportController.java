package pl.coderslab.servicepanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.servicepanel.entity.ReportEntity;
import pl.coderslab.servicepanel.service.ReportService;

@Controller
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/reports")
    public String reportList(Model model) {
        model.addAttribute("reports", reportService.getAllReports());
        return "reports";
    }

    @GetMapping("/reports/new")
    public String createReportForm(Model model) {
        ReportEntity report = new ReportEntity();
        model.addAttribute("report", report);
        return "create_report";
    }
}
