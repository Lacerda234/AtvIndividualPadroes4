package AvInd4;

public class cidadeBuilder extends DadosClimaticosBuilder{
    
    @Override
    public void buildNome(){
        dados.nome = "Cajazeiras";
    }  
    @Override
    public void buildTemperatura(){
        dados.temperatura = 30;
    }
    @Override
    public void buildPrevisaoDeChuva(){
        dados.previsaoDeChuva = "Sim";
    }
    @Override
    public void buildDensidadeAr(){
        dados.densidadeAr = "Seco";
    }
    @Override
    public void buildDiaNublado(){
        dados.diaNublado = "Sim";
    }
}
