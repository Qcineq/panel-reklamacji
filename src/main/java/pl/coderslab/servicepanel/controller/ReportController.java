package pl.coderslab.servicepanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.servicepanel.entity.ReportEntity;
import pl.coderslab.servicepanel.service.ReportService;

@Controller
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    // Seller view
    @GetMapping("/reports")
    public String reportList(Model model) {
        model.addAttribute("reports", reportService.getAllReports());
        return "reports";
    }

    // tech view
    @GetMapping("/tech/reports")
    public String techReportList(Model model) {
        model.addAttribute("reports", reportService.getAllReports());
        return "tech_reports_list";
    }

    @GetMapping("/reports/new")
    public String createReportForm(Model model) {
        ReportEntity report = new ReportEntity();
        model.addAttribute("report", report);
        return "create_report";
    }

    @PostMapping("/reports")
    public String saveReport(@ModelAttribute("report") ReportEntity report) {
        reportService.saveReport(report);
        return "redirect:/reports";
    }

    // Seller view
    @GetMapping("/reports/details/{id}")
    public String reportDetails(@PathVariable Long id, Model model) {
        model.addAttribute("report", reportService.getReportById(id));
        return "report_details";
    }

    // tech view
    @GetMapping("/tech/reports/details/{id}")
    public String techReportDetails(@PathVariable Long id, Model model) {
        model.addAttribute("report", reportService.getReportById(id));
        return "tech_report_details";
    }
    @GetMapping("/reports/edit/{id}")
    public String reportDiagnosis(@PathVariable Long id, Model model) {
        model.addAttribute("report", reportService.getReportById(id));
        return "report_diagnosis";
    }

    @PostMapping("/reports/{id}")
    public String updateReport(@PathVariable Long id, @ModelAttribute("report") ReportEntity report, Model model) {

        // get report from database by id
        ReportEntity existingReport = reportService.getReportById(id);
        existingReport.setId(id);
        existingReport.setReportDiagnosis(report.getReportDiagnosis());
        existingReport.setReportState(report.getReportState());

        // save updated report object
        reportService.reportDiagnosis(existingReport);
        return "redirect:/tech/reports";
    }
}
