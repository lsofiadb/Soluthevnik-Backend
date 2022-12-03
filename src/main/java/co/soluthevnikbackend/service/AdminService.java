package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.Admin;
import co.soluthevnikbackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin save(Admin admin){
        return adminRepository.save(admin);
    }

    public Boolean login(Long k_id, String password){

        if(!adminRepository.findById(k_id).isEmpty() ){
            Admin admin = adminRepository.findById(k_id).get();
            if(admin.getO_password().equals(password)){
                return true;
            }
            else {
                return false;
            }
        } else{
            return false;
        }
    }


}
