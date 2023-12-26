package com.expense_tracker.expense.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {

    @Id
    private Long id;

    private String name;

}
