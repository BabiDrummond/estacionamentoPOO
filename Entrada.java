/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

/**
 *
 * @author barbara.almeida
 */
public class Entrada extends Guarita {
    static int contadorEntradas = 0;
    boolean Aberta = false;
    int i = 0;
    public Entrada(){
        contadorEntradas += 1;
        i = contadorEntradas;
    }
    void AbrirEntrada(){
        System.out.println("Entrada G" 
                + i +
                " em funcionamento!");
        EntradasAbertas +=1;
        Aberta = true;
    }
    void ReceberCarro(String nomeVeiculo){
        if(Aberta){
            System.out.println(nomeVeiculo + 
                    " entrando por G" 
                    + i + 
                    "!");
        }else{
            System.out.println("Entrada fechada, tente outra!");
        }
    }

    void FecharEntrada(){
        System.out.println("Fechando entrada G"
                + i +
                " com total de " 
                + i +
                " reais.");
        EntradasAbertas -= 1;
        Aberta = false;
    }
    
}
