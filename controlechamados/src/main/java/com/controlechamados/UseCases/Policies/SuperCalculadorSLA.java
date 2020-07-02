package com.controlechamados.UseCases.Policies;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA {
    

    public SuperCalculadorSLA() {
        
    }

    public Date addDias(Date datainicial, int dias){
 
        Date datafinal = new Date(datainicial.getTime() + TimeUnit.DAYS.toMillis(dias));
        return datafinal;
    }

    public Date getTime(){
        return new Date();
    }

}