package com.controlechamados.UseCases.Policies;

import java.util.Date;
import com.controlechamados.Entity.Chamado;

public interface CalculadorSLA{
    
public Date addDias(Date datainicial, int dias);

public Date getTime();

public Chamado calculaSLA(Chamado chamado);

}