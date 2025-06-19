package com.mx.notificaciones.service;



import com.mx.notificaciones.model.Notificacion;

public interface NotificacionInterfaceService {

Notificacion crearNotificacion(Notificacion notificacion);

    Notificacion buscarNotificacion(Notificacion notificacion);

    Notificacion actualizarNotificacion(Notificacion notificacion, int idNotificacion);

    void eliminarNotificacion(int idNotificacion);
}
