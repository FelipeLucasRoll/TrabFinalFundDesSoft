package com.controlechamados.UseCases.Policies;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA {
    Date data = new Date();

    public SuperCalculadorSLA(Date data) {
        this.data = data;
    }

    public Date addDias(int dias){
        data = new Date(data.getTime() + TimeUnit.DAYS.toMillis(dias));
        return data;
    }

    public Date getTime(){
        return data;
    }

}