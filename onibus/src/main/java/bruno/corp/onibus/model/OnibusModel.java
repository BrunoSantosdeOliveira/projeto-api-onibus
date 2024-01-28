package bruno.corp.onibus.model;


import jakarta.persistence.*;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

@Entity
@Table(name="onibus")
public class OnibusModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name = "viacao")
private  String viacao;


@Column(name = "destino")
private String destino;

@Column(name = "parti")
private  String parti;

@Column(name = "hora_partida")
private Time horaPartida;

@Column(name = "hora_chegada")
private   Time horaChegada;

public int getId(){
    return id;
}

public void  setId(int id){
    this.id=id;
}

public String getViacao(){
    return viacao;
}

public  void  setViacao(String viacao)
{
    this.viacao=viacao;
}

public String getDestino(){
    return  destino;
}

public  void  setDestino(String destino){
    this.destino=destino;
}

public  String getParti(){
    return parti;
}

public  void  setParti(String parti){
    this.parti=parti;
}

public   Time getHoraPartida(){
    return horaPartida;
}

public  void  setHoraPartida( Time horaPartida){
    this.horaPartida=horaPartida;
}

public Time getHoraChegada(){
    return horaChegada;
}

public  void  setHoraChegada( Time horaChegada){
    this.horaChegada=horaChegada;
}

}
