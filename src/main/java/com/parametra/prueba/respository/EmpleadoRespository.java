package com.parametra.prueba.respository;

import java.util.ArrayList;
import java.util.List;

import javax.management.MXBean;

import com.parametra.prueba.entity.EmpleadoEntity;
import com.parametra.ws.com.parametra.impl.EmpleadoImplService;
import com.parametra.ws.com.parametra.impl.Exception;
import com.parametra.ws.com.parametra.impl.IEmpleadoService;
import com.parametra.ws.com.parametra.service.Tiempos;

public class EmpleadoRespository {
	
	EmpleadoImplService empleadoWS = new EmpleadoImplService();
	IEmpleadoService iempleadoWS = empleadoWS.getEmpleadoImplPort();
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<EmpleadoEntity> findAll() throws Exception {
		
		List<EmpleadoEntity> empleadoList = new ArrayList<EmpleadoEntity>();
		List<com.parametra.ws.com.parametra.service.EmpleadoEntity> empleadoListWS = iempleadoWS.findAll();
		
		if (empleadoListWS.size() > 0) {
			
			for (com.parametra.ws.com.parametra.service.EmpleadoEntity empleadoWS : empleadoListWS) {
				empleadoList.add(new EmpleadoEntity(empleadoWS.getId(), 
													empleadoWS.getNombres(), 
													empleadoWS.getApellidos(),
													empleadoWS.getTipoDocumento(),
													null, 
													null, 
													empleadoWS.getCargo(), 
													empleadoWS.getSalario()));
			}		
		}		
		return empleadoList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public EmpleadoEntity findById(int id) throws Exception {
		
		com.parametra.ws.com.parametra.service.EmpleadoEntity empleado = iempleadoWS.findById(id);		
		
		return new EmpleadoEntity(empleado.getId(), 
								empleado.getNombres(), 
								empleado.getApellidos(),
								empleado.getTipoDocumento(),
								null, 
								null, 
								empleado.getCargo(), 
								empleado.getSalario());
	}
	
	/**
	 * 
	 * @param nombres
	 * @param apellidos
	 * @param tipo_documento
	 * @param fecha_nacimineto
	 * @param fecha_vinculacion_emp
	 * @param cargo
	 * @param salario
	 * @return
	 * @throws Exception
	 */
	public Tiempos add(String nombres, String apellidos, String tipo_documento, String fecha_nacimineto,
			String fecha_vinculacion_emp, String cargo, double salario) throws Exception {
		
		if (validaCampo(nombres) || validaCampo(apellidos) || validaCampo(tipo_documento) || validaCampo(cargo) ||
				validaCampo(fecha_nacimineto) ||  validaCampo(fecha_vinculacion_emp)) {
			return iempleadoWS.add(nombres, apellidos, tipo_documento, fecha_nacimineto, fecha_vinculacion_emp, cargo, salario);
		} else {
			return null;
		}
		
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Boolean delete(int id) throws Exception {
		return iempleadoWS.delete(id);
	}
	
	public boolean validaCampo(String campo) {
		if (campo == "" || campo == null) {
			return false;
		}
		return true;
	}
}
