package AvInd4;

public abstract class DadosClimaticosBuilder {
    protected DadosProduct dados = new DadosProduct();
    public abstract void buildNome();
    public abstract void buildTemperatura();
    public abstract void buildPrevisaoDeChuva();
    public abstract void buildDensidadeAr();
    public abstract void buildDiaNublado();
    public DadosProduct getDados(){
        return dados;
    }
}
