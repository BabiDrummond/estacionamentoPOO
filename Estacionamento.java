package Estacionamento;
/**
 *
 * @author Barbara Moreira Drummond de Almeida
 */
public class Estacionamento {
    public static void main(String[] args) {
        //Instanciar 3 guaritas de entrada
        Entrada G1 = new Entrada();
        Entrada G2 = new Entrada();
        Entrada G3 = new Entrada();
        //Instanciar guarita de saida
        Saida GS = new Saida();
        //Instanciar 4 carros grandes, com os nomes Doblo, Blazer, Corolla e S10
        Veiculo Doblo = new CarroGrande("Doblo");
        Veiculo Blazer = new CarroGrande("Blazer");
        Veiculo Corolla = new CarroGrande("Corolla");
        Veiculo S10 = new CarroGrande("S10");
        //Instanciar 3 carros pequenos, com os nomes Corsa, Palio e Fiesta
        Veiculo Corsa = new CarroPequeno("Corsa");
        Veiculo Palio = new CarroPequeno("Palio");
        Veiculo Fiesta = new CarroPequeno("Fiesta");
        //Instanciar 2 motos, com os nomes Honda e Suzuki
        Veiculo Honda = new Moto("Honda");
        Veiculo Suzuki = new Moto("Suzuki");
        
        //Abrir as entradas G1 e G2
        G1.AbrirEntrada();
        G2.AbrirEntrada();
        //Abrir a saida
        GS.AbrirSaida();
        //Receber Doblo pela entrada G1
        G1.ReceberCarro(Doblo.nome);
        
    }
}
