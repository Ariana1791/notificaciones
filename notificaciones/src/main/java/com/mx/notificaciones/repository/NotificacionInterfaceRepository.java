package com.mx.notificaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.notificaciones.model.Notificacion;

public interface NotificacionInterfaceRepository extends JpaRepository<Notificacion, Integer> {
 
}
