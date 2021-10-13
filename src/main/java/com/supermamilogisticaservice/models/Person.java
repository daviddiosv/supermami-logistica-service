package com.supermamilogisticaservice.models;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "\"Personas\"", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
  @SequenceGenerator(name = "sequenceGenerator",  sequenceName = "person_id_seq")
  @Column(name = "id", nullable = false)
  private int id;

  @Column(name = "nombre", nullable = false)
  private String first_name;

  @Column(name = "apellido", nullable = false)
  private String last_name;

  @Column(name = "dni", nullable = false)
  private int dni;

  @Column(name = "telefono")
  private int phone_number;

  @Column(name = "email")
  private String email;

  @Column(name = "direccion")
  private String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public int getPhone_number() {
    return phone_number;
  }

  public void setPhone_number(int phone_number) {
    this.phone_number = phone_number;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
