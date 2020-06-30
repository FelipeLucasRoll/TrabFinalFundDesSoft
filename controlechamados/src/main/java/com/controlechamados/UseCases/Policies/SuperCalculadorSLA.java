package com.controlechamados.UseCases.Policies;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA {
    

    public SuperCalculadorSLA() {
        
    }

    public Date addDias(int dias){
        Date data = new Date();
        data = new Date(data.getTime() + TimeUnit.DAYS.toMillis(dias));
        return data;
    }

    public Date getTime(){
        return new Date();
    }

}