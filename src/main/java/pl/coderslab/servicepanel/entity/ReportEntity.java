package pl.coderslab.servicepanel.entity;

import javax.persistence.*;

@Entity
@Table(name = "reports")
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "producer")
    private String producer;
    @Column(name = "model")
    private String model;
    @Column(name = "customer_first_name")
    private String customerFirstName;
    @Column(name = "customer_lirst_name")
    private String customerLastName;
    @Column(name = "customer_phone_number")
    private String customerPhoneNumber;
    @Column(name = "problem_description")
    private String problemDescription;
    @Column(name = "reportDiagnosis")
    private String reportDiagnosis;
    @Column(name = "reportState")
    private String reportState;

    public ReportEntity() {

    }
    public ReportEntity(String producer, String model, String customerFirstName, String customerLastName, String customerPhoneNumber, String problemDescription, String reportDiagnosis, String reportState) {
        this.producer = producer;
        this.model = model;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.problemDescription = problemDescription;
        this.reportDiagnosis = reportDiagnosis;
        this.reportState = reportState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getReportDiagnosis() {
        return reportDiagnosis;
    }

    public void setReportDiagnosis(String reportDiagnosis) {
        this.reportDiagnosis = reportDiagnosis;
    }

    public String getReportState() {
        return reportState;
    }

    public void setReportState(String reportState) {
        this.reportState = reportState;
    }
}