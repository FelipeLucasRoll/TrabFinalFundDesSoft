package com.controlechamados.UseCases.Policies;

import java.util.Date;
import com.controlechamados.Entity.Chamado;

public interface InterfaceCalculaSLA{
    
public Date addDias(int dias);

public Date getTime();

public Chamado calculaSLA(Chamado chamado);

}