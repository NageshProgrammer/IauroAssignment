
package com.iauro.expensetracker;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Expense {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long id;
 public String category;
 public double amount;
 public String comments;
 public LocalDateTime createdAt = LocalDateTime.now();
}
