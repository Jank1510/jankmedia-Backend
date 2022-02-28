package com.jankmedia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jankmedia.ModeloEntidad.usuarios;
import com.jankmedia.DaoRepository.usuariosRepository;

@Service
public class usuarioServiceImpl implements usuarioService{

	@Autowired
	private usuariosRepository usuariosRepository;
	
	@Override
	public Iterable<usuarios> findAll() {
		return usuariosRepository.findAll();
	}

	@Override
	public Optional<usuarios> findById(Integer id) {
		return usuariosRepository.findById(id);
	}

	@Override
	public usuarios save(usuarios usuario) {
		return usuariosRepository.save(usuario);
	}

	@Override
	public void deleteById(Integer id) {
		usuariosRepository.deleteById(id);
	}

}
