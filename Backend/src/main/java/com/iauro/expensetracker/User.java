
package com.iauro.expensetracker;
import jakarta.persistence.*;

@Entity
public class User {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long id;
 public String email;
 public String password;
}
