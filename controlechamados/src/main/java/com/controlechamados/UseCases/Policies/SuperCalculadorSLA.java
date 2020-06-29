package com.controlechamados.UseCases.Policies;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA implements InterfaceCalculaSLA{
    Date data = new Date();

    public SuperCalculadorSLA(Date data) {
        this.data = data;
    }


  

    @Override
    public Date addDias(int dias){
    data = new Date(data.getTime() + TimeUnit.DAYS.toMillis(dias));
    return data;
}

    @Override
    public Date getTime(){
    return data;

 }

}