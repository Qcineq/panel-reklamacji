package pl.coderslab.servicepanel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity(name = "reports")
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String producer;

    @NotEmpty
    private String model;

    @NotEmpty
    private String customerName;

    @NotEmpty
    private String customerPhoneNumber;

    @NotEmpty
    private String customerEmail;

    @NotEmpty
    private String problemDescription;


}
