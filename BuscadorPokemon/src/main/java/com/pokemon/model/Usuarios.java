/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aprendiz
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id"),
    @NamedQuery(name = "Usuarios.findByNombreCompleto", query = "SELECT u FROM Usuarios u WHERE u.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Usuarios.findByTipoDocumento", query = "SELECT u FROM Usuarios u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuarios.findByNumeroIdentificacion", query = "SELECT u FROM Usuarios u WHERE u.numeroIdentificacion = :numeroIdentificacion"),
    @NamedQuery(name = "Usuarios.findByFechaNacimiento", query = "SELECT u FROM Usuarios u WHERE u.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuarios.findByNumeroCelular", query = "SELECT u FROM Usuarios u WHERE u.numeroCelular = :numeroCelular"),
    @NamedQuery(name = "Usuarios.findByPais", query = "SELECT u FROM Usuarios u WHERE u.pais = :pais"),
    @NamedQuery(name = "Usuarios.findByCiudad", query = "SELECT u FROM Usuarios u WHERE u.ciudad = :ciudad"),
    @NamedQuery(name = "Usuarios.findByPoliticaDatos", query = "SELECT u FROM Usuarios u WHERE u.politicaDatos = :politicaDatos"),
    @NamedQuery(name = "Usuarios.findByPass", query = "SELECT u FROM Usuarios u WHERE u.pass = :pass"),
    @NamedQuery(name = "Usuarios.findByFechaRegistro", query = "SELECT u FROM Usuarios u WHERE u.fechaRegistro = :fechaRegistro")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero_celular")
    private Integer numeroCelular;
    @Column(name = "pais")
    private String pais;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "politica_datos")
    private Boolean politicaDatos;
    @Column(name = "pass")
    private String pass;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @OneToMany(mappedBy = "usuariosId")
    private Collection<Mochila> mochilaCollection;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getPoliticaDatos() {
        return politicaDatos;
    }

    public void setPoliticaDatos(Boolean politicaDatos) {
        this.politicaDatos = politicaDatos;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Collection<Mochila> getMochilaCollection() {
        return mochilaCollection;
    }

    public void setMochilaCollection(Collection<Mochila> mochilaCollection) {
        this.mochilaCollection = mochilaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pokemon.model.Usuarios[ id=" + id + " ]";
    }
    
}
