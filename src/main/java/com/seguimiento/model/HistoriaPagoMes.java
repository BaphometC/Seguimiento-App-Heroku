package com.seguimiento.model;
import javax.persistence.*;
@Entity
@Table(name = "historiaPagoMes")
public class HistoriaPagoMes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int idMes;
    private int idSuscripcion;
    private String estado;
    private String fechaRecordatorio;
    private String fechaVencimiento;
    private int montoPagado;
    private int montoDeuda;

    public long getIdHistoriaPagoMes() {
        return id;
    }

    public void setIdHistoriaPagoMes(long id) {
        this.id = id;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(String fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }
    
    public int getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(int montoDeuda) {
        this.montoDeuda = montoDeuda;
    }
}
