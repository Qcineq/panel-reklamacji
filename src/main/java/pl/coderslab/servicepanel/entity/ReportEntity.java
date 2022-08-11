package pl.coderslab.servicepanel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Reports_Table")
@Getter
@Setter
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String producer;
    @NotEmpty
    private String model;

    @ManyToOne
    @NotEmpty
    private CustomerEntity customerEntity;
    @NotEmpty
    private String description;



    @Override
    public String toString() {
        return "ReportEntity{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
