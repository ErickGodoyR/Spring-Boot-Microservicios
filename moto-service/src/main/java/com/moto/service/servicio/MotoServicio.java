package com.moto.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moto.service.entidades.Moto;
import com.moto.service.repositorio.MotoRepositorio;

@Service
public class MotoServicio {

	@Autowired
	private MotoRepositorio motoRepo;

	public List<Moto> getAll(){
		return motoRepo.findAll();
	}
	
	public Moto getMotoById(int id){
		return motoRepo.findById(id).orElse(null);
	}
	
	public Moto save(Moto moto) {
		Moto nuevoMoto = motoRepo.save(moto);
		return nuevoMoto;
	}

	public List<Moto> byUsuarioId(int usuarioId){
		return motoRepo.findByUsuarioId(usuarioId);
	}
	

}
