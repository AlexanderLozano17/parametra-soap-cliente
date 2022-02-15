package com.parametra.prueba.service;

import java.util.List;

import com.parametra.prueba.entity.EmpleadoEntity;
import com.parametra.ws.com.parametra.service.Tiempos;

public interface EmpleadoService {

	public List<EmpleadoEntity> findAll();
	
	public EmpleadoEntity findById(int id);
	
	public Tiempos add(EmpleadoEntity entity);
	
	public Boolean delete(int id);
}
