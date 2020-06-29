package com.controlechamados.UseCases.Policies;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA implements InterfaceCalculaSLA{


    public SuperCalculadorSLA(Date data) {
        this.data = data;
    }


    Date data = new Date();

    @Override
    public Date addDias(int dias){
    data = new Date(data.getTime() + TimeUnit.DAYS.toMillis(10));
    return data;
}

    @Override
    public Date getTime(){
    return data;

 }

}