package AvInd4;

public class regiaoBuilder extends DadosClimaticosBuilder{
    
    @Override
    public void buildNome(){
        dados.nome = "Nordeste";
    }
    @Override
    public void buildTemperatura(){
        dados.temperatura = 35;
    }
    @Override
    public void buildPrevisaoDeChuva(){
        dados.previsaoDeChuva = "Não";
    }
    @Override
    public void buildDensidadeAr(){
        dados.densidadeAr = "Seco";
    }
    @Override
    public void buildDiaNublado(){
        dados.diaNublado = "Não";
    }
    
}
