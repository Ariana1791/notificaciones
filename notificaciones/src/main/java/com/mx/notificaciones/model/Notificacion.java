package com.mx.notificaciones.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "notificacion")
public class Notificacion {


    @Id
    @Column(name ="id_notificacion")
    private int idNotificacion;
    @Column(name = "fecha_guardado")
    private Date fechaGuardado;
    @Column(name = "tipo_notificacion")
    private String tipoNotificacion;
    @Column(name = "mensaje_notificacion")
    private String mensajeNotificacion;
    
    public Notificacion(){

    }

    public Notificacion(int idNotificacion, Date fechaGuardado, String tipoNotificacion, String mensajeNotificacion) {
        this.idNotificacion = idNotificacion;
        this.fechaGuardado = fechaGuardado;
        this.tipoNotificacion = tipoNotificacion;
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Date getFechaGuardado() {
        return fechaGuardado;
    }

    public void setFechaGuardado(Date fechaGuardado) {
        this.fechaGuardado = fechaGuardado;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }
    
    
}
