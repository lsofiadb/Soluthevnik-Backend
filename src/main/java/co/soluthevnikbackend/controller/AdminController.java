package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.Admin;
import co.soluthevnikbackend.service.AdminService;
import co.soluthevnikbackend.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public ResponseEntity<Admin> save(@RequestBody Admin admin){
        Utils utils = new Utils();
        admin.setO_password(utils.getEncodedPassword(admin.getO_password()));
        return ResponseEntity.ok(adminService.save(admin));
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestParam(name = "k_id") Long id, @RequestParam(name = "password") String password){
        return ResponseEntity.ok(adminService.login(id, password));
    }

}
