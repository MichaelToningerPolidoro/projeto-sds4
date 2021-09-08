package com.michael.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dsvendas.dto.SellerDTO;
import com.michael.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		return repository.findAll().stream()
				.map(seller -> new SellerDTO(seller)).toList();
	}
}
