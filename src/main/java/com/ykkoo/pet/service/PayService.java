package com.ykkoo.pet.service;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface PayService
{
  public abstract String tenPayCallback(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse)
    throws IOException;
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/PayService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */