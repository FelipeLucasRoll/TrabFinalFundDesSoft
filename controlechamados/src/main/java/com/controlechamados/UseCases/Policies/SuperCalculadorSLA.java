package com.controlechamados.UseCases.Policies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;




public abstract class SuperCalculadorSLA implements InterfaceCalculaSLA{

    Date data = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );

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