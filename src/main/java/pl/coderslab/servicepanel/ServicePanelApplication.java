package pl.coderslab.servicepanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.coderslab.servicepanel.entity.ReportEntity;
import pl.coderslab.servicepanel.repository.ReportRepository;

@SpringBootApplication
public class ServicePanelApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServicePanelApplication.class, args);
    }

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public void run(String... args) throws Exception {

        ReportEntity report1 = new ReportEntity("GoPro", "HERO10", "Jan", "Kowalski","123456789", "Nie działa");
        reportRepository.save(report1);
        ReportEntity report2 = new ReportEntity("GoPro", "HERO9", "Adam", "Nowak","987654321", "Zawiesza się");
        reportRepository.save(report2);
        ReportEntity report3 = new ReportEntity("GoPro", "HERO8", "Piotr", "Adamiak","567987123", "Nie nagrywa");
        reportRepository.save(report3);
    }

}
