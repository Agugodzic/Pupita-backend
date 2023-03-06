package com.back.tienda.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Any;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notificacion {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;
  private Long id;
  private Boolean live_mode;
  private String type;
  private String date_created;
  private Long user_id;
  private String api_version;
  private String action;
  private String  data;
}
