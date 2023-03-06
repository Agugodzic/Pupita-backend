package com.back.tienda.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.Any;
import org.hibernate.type.ObjectType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notificacion {
  @Id
  private Long id;
  private String live_mode;
  private Boolean type;
  private String date_created;
  private Long user_id;
  private String api_version;
  private String action;
  private Data data;
}
