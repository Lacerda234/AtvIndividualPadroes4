package AvInd4;

public class meteorologiaDirector {
    protected DadosClimaticosBuilder dadosClimaticos;
    
    public meteorologiaDirector(DadosClimaticosBuilder dadosClimaticos){
        this.dadosClimaticos = dadosClimaticos;
    }
    
    public void construirDados(){
        dadosClimaticos.buildNome();
        dadosClimaticos.buildTemperatura();
        dadosClimaticos.buildPrevisaoDeChuva();
        dadosClimaticos.buildDensidadeAr();
        dadosClimaticos.buildDiaNublado();
    }
    
    public DadosProduct getDadosProduct(){
        return dadosClimaticos.getDados();
    }
}
