package com.imran.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private int customerId;
    private String customerName;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    private Set<Item> item = new HashSet<>();
}
