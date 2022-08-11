package pl.coderslab.servicepanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.servicepanel.entity.ReportEntity;
import pl.coderslab.servicepanel.service.ReportsService;

import java.awt.print.Book;

@Controller
public class ReportsController {

    private final ReportsService reportsService;

    public ReportsController(ReportsService reportsService) {
        this.reportsService = reportsService;
    }

    @GetMapping(path = "/reports/add")
    String showAddReportForm(Model model) {

        ReportEntity reportEntity = new ReportEntity();
        model.addAttribute("report", reportEntity);

        return "reports/add";
    }


}
