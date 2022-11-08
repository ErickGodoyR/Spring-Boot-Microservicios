package com.carro.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entidades.Carro;
import com.carro.service.repositorio.CarroRepositorio;

@Service
public class CarroServicio {

	@Autowired
	private CarroRepositorio carroRepo;

	public List<Carro> getAll(){
		return carroRepo.findAll();
	}
	
	public Carro getCarroById(int id){
		return carroRepo.findById(id).orElse(null);
	}
	
	public Carro save(Carro carro) {
		Carro nuevoCarro = carroRepo.save(carro);
		return nuevoCarro;
	}

	public List<Carro> byUsuarioId(int usuarioId){
		return carroRepo.findByUsuarioId(usuarioId);
	}
	
}
