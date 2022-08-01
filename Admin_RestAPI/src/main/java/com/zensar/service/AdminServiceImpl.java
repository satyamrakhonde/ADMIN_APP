package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.AdminDTO;
import com.zensar.entity.AdminEntity;
import com.zensar.repo.AdminRepo;
//import com.zensar.exception.InvalidAuthTokenException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	AdminRepo adminRepo;
	
    @Override
    public List<AdminDTO> adminList() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<AdminDTO> searchByCriteria(String name, String username) {
	// TODO Auto-generated method stub
	return null;
    }

	    @Override
	    public AdminDTO updateAdmin(int id, AdminDTO data) {
		
	    	Optional<AdminEntity> opAdminEntity = adminRepo.findById(id);
	    	
	    	if(opAdminEntity.isPresent()) {
	    		AdminEntity adminEntity = opAdminEntity.get();
	    		adminEntity.setEmail(data.getEmail());
	    		adminEntity.setName(data.getName());
	    		adminEntity.setPassword(data.getPassword());
	    		adminEntity.setPhNumber(data.getPhNumber());

	    		
	    	}
	    	return data;
	    }

	    @Override
	    public AdminDTO registerAdmin(AdminDTO admin) {
    	
			AdminEntity adminEntity = convertDTOintoEntity(admin);
			adminEntity = adminRepo.save(adminEntity);

			return convertEntityintoDTO(adminEntity);
    		
    	}

    	private AdminDTO convertEntityintoDTO(AdminEntity adminEntity) {

    		AdminDTO admin = modelMapper.map(adminEntity, AdminDTO.class);
    		return admin;
    	}

    	private AdminEntity convertDTOintoEntity(AdminDTO admin) {

    		AdminEntity adminEntity = modelMapper.map(admin, AdminEntity.class);
    		return adminEntity;
    	}
    }
