
package com.iauro.expensetracker;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
 private final ExpenseRepository repo;
 public ExpenseController(ExpenseRepository r){this.repo=r;}

 @GetMapping
 public List<Expense> all(){ return repo.findAll(); }

 @PostMapping
 public Expense add(@RequestBody Expense e){ return repo.save(e); }
}
