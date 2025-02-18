/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula1;

/**
 *
 * @author lab53
 */

public class Aluno {
    String nome;
    Curso curso;
    
    Aluno(String nome, Curso curso){
    this.curso = curso;
    this.nome = nome;
    }


void MostraInfos(){
System.out.println(nome);

    switch (curso) {
    case ADS:
        System.out.println("CURSO ADS ");
        break;
        case LOG:
        System.out.println("CURSO Logistica ");
        break;


    default:
        break;
}

}
}