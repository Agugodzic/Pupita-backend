package com.back.tienda.Model;

import org.hibernate.annotations.Any;

public class Notificacion {
  private Long id;
  private boolean live_mode;
  private String type;
  private String date_created;
  private Long user_id;
  private String api_version;
  private String action;
  private Any data;
}
