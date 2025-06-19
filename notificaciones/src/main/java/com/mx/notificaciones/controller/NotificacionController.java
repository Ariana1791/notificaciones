package com.mx.notificaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.notificaciones.model.Notificacion;
import com.mx.notificaciones.service.NotificacionInterfaceService;

@RestController
public class NotificacionController {

    @Autowired
    NotificacionInterfaceService service;

    @PostMapping(value = "/guardarNotificacion")
    public Notificacion guardarNotificacion(@RequestBody Notificacion notificacion) {
        Notificacion crear = null;
        try {
            crear = service.crearNotificacion(notificacion);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return crear;
    }

    @GetMapping(value = "/buscarNotificacion")
    public Notificacion buscarNotificacion(@RequestBody Notificacion notificacion) {
        Notificacion buscar = null;
        try {
            buscar = service.buscarNotificacion(notificacion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "actualizarNotificacion/{idNotificacion}")
    public Notificacion actualizarNotificacion(@RequestBody Notificacion notificacion, @PathVariable int idNotificacion) {
        Notificacion actualizar = null;
        try {
            actualizar = service.actualizarNotificacion(notificacion, idNotificacion);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;

    }

    @DeleteMapping(value = "/eliminarNotificacion/{idNotificacion}")
    public void eliminarLogin(@PathVariable int idNotificacion) {
        try {
            service.eliminarNotificacion(idNotificacion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
