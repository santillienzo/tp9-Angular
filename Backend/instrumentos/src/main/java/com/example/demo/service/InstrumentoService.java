package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.example.demo.dto.InstrumentoDTO;
import com.example.demo.entities.Instrumento;
import com.example.demo.repository.InstrumentoRepository;

@Service
public class InstrumentoService {
	
	private InstrumentoRepository repository;

	public InstrumentoService(InstrumentoRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Transactional
	public List <InstrumentoDTO> findAll() throws Exception {
		
		List <Instrumento> entities = repository.findAll();
		List <InstrumentoDTO> dtos = new ArrayList();
		
		try {
			
			for (Instrumento i : entities) {
				InstrumentoDTO unDTO = new InstrumentoDTO();
				unDTO.setId(i.getId());
				unDTO.setInstrumento(i.getInstrumento());
				unDTO.setMarca(i.getMarca());
				unDTO.setModelo(i.getModelo());
				unDTO.setImagen(i.getImagen());
				unDTO.setPrecio(i.getPrecio());
				unDTO.setCostoEnvio(i.getCostoEnvio());
				unDTO.setCantidadVendida(i.getCantidadVendida());
				unDTO.setDescripcion(i.getDescripcion());
				
				dtos.add(unDTO);
			}
			
			return dtos;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	@Transactional
	public InstrumentoDTO findById (int id) throws Exception {
		
		Optional <Instrumento> entityOptional = repository.findById(id);
		InstrumentoDTO dto = new InstrumentoDTO();
		
		try {
			Instrumento entity = entityOptional.get();
			
			dto.setId(entity.getId());
			dto.setInstrumento(entity.getInstrumento());
			dto.setMarca(entity.getMarca());
			dto.setModelo(entity.getModelo());
			dto.setImagen(entity.getImagen());
			dto.setPrecio(entity.getPrecio());
			dto.setCostoEnvio(entity.getCostoEnvio());
			dto.setCantidadVendida(entity.getCantidadVendida());
			dto.setDescripcion(entity.getDescripcion());
			
			return dto;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	@Transactional
	public InstrumentoDTO save (InstrumentoDTO dto) throws Exception {
		
		Instrumento entity = new Instrumento();
		
		entity.setId(dto.getId());
		entity.setInstrumento(dto.getInstrumento());
		entity.setMarca(dto.getMarca());
		entity.setModelo(dto.getModelo());
		entity.setImagen(dto.getImagen());
		entity.setPrecio(dto.getPrecio());
		entity.setCostoEnvio(dto.getCostoEnvio());
		entity.setCantidadVendida(dto.getCantidadVendida());
		entity.setDescripcion(dto.getDescripcion());
		
		try {
			
			entity = repository.save(entity);
			dto.setId(entity.getId());
			dto.setInstrumento(entity.getInstrumento());
			dto.setMarca(entity.getMarca());
			dto.setModelo(entity.getModelo());
			dto.setImagen(entity.getImagen());
			dto.setPrecio(entity.getPrecio());
			dto.setCostoEnvio(entity.getCostoEnvio());
			dto.setCantidadVendida(entity.getCantidadVendida());
			dto.setDescripcion(entity.getDescripcion());
			
			return dto;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	@Transactional
	public InstrumentoDTO update (int id, InstrumentoDTO dto) throws Exception {
		
		Optional <Instrumento> entityOptional = repository.findById(id);
		
		try {
			Instrumento entity = entityOptional.get();
			
			if (repository.existsById(id)) {
				entity.setId(dto.getId());
				entity.setInstrumento(dto.getInstrumento());
				entity.setMarca(dto.getMarca());
				entity.setModelo(dto.getModelo());
				entity.setImagen(dto.getImagen());
				entity.setCostoEnvio(dto.getCostoEnvio());
				entity.setCantidadVendida(dto.getCantidadVendida());
				entity.setDescripcion(dto.getDescripcion());
				
				return dto;
				
			} else {
				throw new Exception();
			}
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	@Transactional
	public boolean delete (int id) throws Exception {
		
		try {
			
			repository.deleteById(id);
			return true;
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
}
