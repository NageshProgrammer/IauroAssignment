
package com.iauro.expensetracker;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
 private final UserRepository repo;
 public AuthController(UserRepository r){this.repo=r;}

 @PostMapping("/signup")
 public String signup(@RequestBody User u){
  if(repo.findByEmail(u.email)!=null) return "User already exists";
  repo.save(u);
  return "Signup successful";
 }

 @PostMapping("/login")
 public String login(@RequestBody User u){
  User db=repo.findByEmail(u.email);
  if(db!=null && db.password.equals(u.password)) return "Login successful";
  return "Invalid credentials";
 }
}
