package org.devsjavagirl.meetupmvc.service;

import java.util.List;

import org.devsjavagirl.meetupmvc.dao.ContaRepository;
import org.devsjavagirl.meetupmvc.model.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

	@Autowired
    private ContaRepository contaRepository;
	
	public List<Conta> getAll() {
		return contaRepository.findAll();
	}
}
