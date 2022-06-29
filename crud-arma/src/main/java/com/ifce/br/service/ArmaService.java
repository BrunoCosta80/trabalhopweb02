package com.ifce.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifce.br.model.Arma;
import com.ifce.br.repository.ArmaRepository;


@Service
public class ArmaService {
	@Autowired
	private ArmaRepository armaRepo;
	public void cadastrarArma(Arma arma) {
		armaRepo.save(arma);
	}

}
