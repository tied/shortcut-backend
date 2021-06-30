package com.samsungds.atlassian.jira.plugin.rest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShortcutRestResourceModel {

  @XmlElement(name = "value")
  private String message;

  public ShortcutRestResourceModel() {
  }

  public ShortcutRestResourceModel(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}