package com.softtek.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.modelo.Medico;
import com.softtek.servicio.IMedicoServicio;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {

	@Autowired
	private IMedicoServicio medico;

	@GetMapping
	public List<Medico> listar() throws Exception {
		return medico.listar();
	}

	@GetMapping("/{id}")
	public Medico listarPorId(@PathVariable("id") Integer id) throws Exception {
		return medico.listarPorId(id);
	}

	@PostMapping
	public Medico registrar(@RequestBody Medico m) throws Exception {
		return medico.registrar(m);
	}

	@PutMapping
	public Medico modificar(@RequestBody Medico m) throws Exception {
		return medico.modificar(m);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) throws Exception {
		medico.eliminar(id);
	}
}
