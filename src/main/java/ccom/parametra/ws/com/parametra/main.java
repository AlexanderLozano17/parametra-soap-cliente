package ccom.parametra.ws.com.parametra;

import java.util.ArrayList;
import java.util.List;

import com.parametra.prueba.entity.EmpleadoEntity;
import com.parametra.ws.com.parametra.impl.EmpleadoImplService;
import com.parametra.ws.com.parametra.impl.Exception;
import com.parametra.ws.com.parametra.impl.IEmpleadoService;
import com.parametra.ws.com.parametra.service.Tiempos;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmpleadoImplService empleadoWS = new EmpleadoImplService();
		
		IEmpleadoService iempleadoWS = empleadoWS.getEmpleadoImplPort();
		
		/**
		 * Listar todo
		 */
		List<com.parametra.ws.com.parametra.service.EmpleadoEntity> empleados = iempleadoWS.findAll();	
		
		for (com.parametra.ws.com.parametra.service.EmpleadoEntity emplead1 : empleados) {
			System.out.println(emplead1.getNombres() + " | " + emplead1.getApellidos() + " | " + emplead1.getFechaNacimineto() + " | " + emplead1.getFechaVinculacionEmp());
		}
		
		
		List<EmpleadoEntity> empleadoconsumer = new ArrayList<EmpleadoEntity>();
		if (empleados.size() > 0) {
			for (com.parametra.ws.com.parametra.service.EmpleadoEntity mapEmpleado : empleados) {
				empleadoconsumer.add(new EmpleadoEntity(mapEmpleado.getId(), 
														mapEmpleado.getNombres(), 
														mapEmpleado.getApellidos(),
														mapEmpleado.getTipoDocumento(),
														null, 
														null, 
														mapEmpleado.getCargo(), 
														mapEmpleado.getSalario()));
			}
			
		}
		System.out.println("-------------------------------");
		System.out.println("CAMBIANDO EL TIPO DE DATO");
		System.out.println("-------------------------------");
		if (empleadoconsumer.size() > 0) {
			for(EmpleadoEntity empleenty: empleadoconsumer) {
				System.out.println(empleenty.getNombres() + " " + empleenty.getApellidos() + " " + empleenty.getFecha_nacimineto() + " " + empleenty.getFecha_vinculacion_emp());
			}
		}
		System.out.println("-------------------------------");
		
		
		System.out.println("");
		
		/**
		 * Listar por ID
		 */
		com.parametra.ws.com.parametra.service.EmpleadoEntity empleadoId = iempleadoWS.findById(19);		
		System.out.println(empleadoId.getId());
		
		System.out.println("");
		
		/**
		 * Listar por ID
		 */
		Boolean empleadoeelimina = iempleadoWS.delete(4);
		System.out.println(empleadoeelimina);
		
		/**
		 * Adiciona
		 */
		Tiempos empleadoesave = iempleadoWS.add("Alexander", "caceres", "CC", "1993-01-06", "2000-05-08", "TAXISTA", 7800000);
		System.out.println(empleadoesave.getPuedeTrabajar());
	}

}
