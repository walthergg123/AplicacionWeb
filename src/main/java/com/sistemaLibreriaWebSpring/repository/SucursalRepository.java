package com.sistemaLibreriaWebSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaLibreriaWebSpring.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal,Integer>{
	List<Sucursal> findByNombreContains(String nombre);
	Sucursal findByCodigo(int codigo);

	Sucursal findByNombre ( String nombre);
	void deleteByCodigo(int codigo);
}
