package com.jankmedia.service;

import java.util.Optional;

import com.jankmedia.ModeloEntidad.usuarios;

public interface usuarioService {
	public Iterable<usuarios> findAll();
	public Optional<usuarios> findById(Integer id);
	public usuarios save(usuarios usuario);
	public void deleteById(Integer id);
}
