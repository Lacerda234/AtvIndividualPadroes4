package AvInd4;

public class estadoBuilder extends DadosClimaticosBuilder{
    
    @Override
    public void buildNome(){
        dados.nome = "Paraíba";
    }
    @Override
    public void buildTemperatura(){
        dados.temperatura = 32;
    }
    @Override
    public void buildPrevisaoDeChuva(){
        dados.previsaoDeChuva = "Sim";
    }
    @Override
    public void buildDensidadeAr(){
        dados.densidadeAr = "Úmido";
    }
    @Override
    public void buildDiaNublado(){
        dados.diaNublado = "Não";
    }
}
