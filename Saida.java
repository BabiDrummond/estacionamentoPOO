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
public class Saida extends Guarita {
    public Saida(){
    }
    void AbrirSaida(){
        System.out.println("Saida aberta!");
    }
    void LiberarCarro(Veiculo nomeVeiculo){
    }
    void FecharSaida(){
        if (EntradasAbertas == 0){
            System.out.println("Estacionamento fechado! Total do dia: t reais.");
        }else{
            System.out.println("Erro ao fechar saida: verifique se ha alguma entrada em funcionamento.");
        }
    }
}
