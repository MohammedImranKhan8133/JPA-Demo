package com.imran.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "employee")
public class Amount {
    @Id
    @SequenceGenerator(
            name = "amount_sequence",
            sequenceName = "amount_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "amount_sequence"
    )
    private int amt_id;
    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "emp_id",
            referencedColumnName = "emp_id"
    )
    private Employee employee;
    private int emp_amount;

}
