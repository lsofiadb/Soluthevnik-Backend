package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.Admin;
import co.soluthevnikbackend.repository.AdminRepository;
import co.soluthevnikbackend.utils.Utils;
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
            Utils utils = new Utils();
            Admin admin = adminRepository.findById(k_id).get();
            //TO-DO
            System.out.println(admin.getO_password());
            System.out.println(utils.getEncodedPassword(password));
            if(admin.getO_password().equals(utils.getEncodedPassword(password))){
                return true;
            }
            else {
                return false;
            }
        } else{
            return false;
        }
    }

    public Admin findById(Long id){
        return adminRepository.findById(id).get();
    }


}
