package com.portfolioap.backendportfolioap.Security.Service;

import com.portfolioap.backendportfolioap.Security.Entity.Rol;
import com.portfolioap.backendportfolioap.Security.Enums.RolNombre;
import com.portfolioap.backendportfolioap.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getRolByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
