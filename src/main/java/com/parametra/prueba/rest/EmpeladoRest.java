package com.parametra.prueba.rest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.parametra.prueba.entity.EmpleadoEntity;
import com.parametra.prueba.respository.EmpleadoRespository;
import com.parametra.prueba.service.EmpleadoService;
import com.parametra.ws.com.parametra.impl.Exception;
import com.parametra.ws.com.parametra.service.Tiempos;

@Path("/empleados")
public class EmpeladoRest implements EmpleadoService {

	private EmpleadoRespository empleadoRespository;
	
	public EmpeladoRest(EmpleadoRespository empleadoRespository) {
		this.empleadoRespository = empleadoRespository;	
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<EmpleadoEntity> findAll() {
		try {
			return empleadoRespository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return null;
	}

	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public EmpleadoEntity findById(@PathParam("id") int id) {
		try {
			return empleadoRespository.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return null;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public Tiempos add(EmpleadoEntity entity) {
		try {
			return empleadoRespository.add(entity.getNombres(), 
											entity.getApellidos(), 
											entity.getTipo_documento(), 
											dateSQLAString(entity.getFecha_nacimineto()), 
											dateSQLAString(entity.getFecha_vinculacion_emp()), 
											entity.getCargo(), 
											entity.getSalario());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;
	}

	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public Boolean delete(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		try {
			return empleadoRespository.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String dateSQLAString(Date date) {	
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");        
		String dateToStr = dateFormat.format(date);
		return dateToStr;  	
	}

	
}
