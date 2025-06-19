package com.mx.notificaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.notificaciones.model.Notificacion;
import com.mx.notificaciones.repository.NotificacionInterfaceRepository;

@Service
public class NotificacionServiceImpl implements NotificacionInterfaceService {

    @Autowired
    NotificacionInterfaceRepository repository;

    @Override
    public Notificacion crearNotificacion(Notificacion notificacion) {
        Notificacion result = null;
        try {
            result = repository.save(notificacion);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Notificacion buscarNotificacion(Notificacion notificacion) {
        Notificacion resultado = null;
        try {
            resultado = (Notificacion) repository.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Notificacion actualizarNotificacion(Notificacion notificacion, int idNotificacion) {
        Notificacion guardar = new Notificacion();
        try {
            boolean recuperado = repository.existsById(idNotificacion);
            if (recuperado == true) {
                guardar.setIdNotificacion(idNotificacion);
                guardar.setFechaGuardado(notificacion.getFechaGuardado());
                guardar.setTipoNotificacion(notificacion.getTipoNotificacion());
                guardar.setMensajeNotificacion(notificacion.getMensajeNotificacion());
                guardar = repository.save(guardar);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return guardar;
    }

    @Override
    public void eliminarNotificacion(int idNotificacion) {
        int id = (int) idNotificacion;
        try {
            repository.deleteById(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
