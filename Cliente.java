package AvInd4;

public class Cliente {

    public static void main(String[] args) {
        meteorologiaDirector dadosMeteorologicos = new meteorologiaDirector(new regiaoBuilder());
        
        dadosMeteorologicos.construirDados();
        DadosProduct dados = dadosMeteorologicos.getDadosProduct();
        System.out.println("Região: " + dados.nome);
        System.out.println("Temperatura:" + dados.temperatura + "°C");
        System.out.println("Previsão de chuva: " + dados.previsaoDeChuva);
        System.out.println("Densidade do Ar:" + dados.densidadeAr);
        System.out.println("Dia nublado: " + dados.diaNublado);
        
        System.out.println();
        
        dadosMeteorologicos = new meteorologiaDirector(new estadoBuilder());
        dadosMeteorologicos.construirDados();
        dados = dadosMeteorologicos.getDadosProduct();
        System.out.println("Estado: " + dados.nome);
        System.out.println("Temperatura:" + dados.temperatura + "°C");
        System.out.println("Previsão de chuva: " + dados.previsaoDeChuva);
        System.out.println("Densidade do Ar:" + dados.densidadeAr);
        System.out.println("Dia nublado: " + dados.diaNublado);
        
        System.out.println();
        
        dadosMeteorologicos = new meteorologiaDirector(new cidadeBuilder());
        dadosMeteorologicos.construirDados();
        dados = dadosMeteorologicos.getDadosProduct();
        System.out.println("Cidade: " + dados.nome);
        System.out.println("Temperatura:" + dados.temperatura + "°C");
        System.out.println("Previsão de chuva: " + dados.previsaoDeChuva);
        System.out.println("Densidade do Ar:" + dados.densidadeAr);
        System.out.println("Dia nublado: " + dados.diaNublado);
    }
}
