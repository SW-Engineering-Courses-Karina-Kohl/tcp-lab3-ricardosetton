public class Retangulo extends FiguraGeometrica{

  private double largura;
  private double altura;

  public Retangulo(String cor, double largura, double altura){
    super(cor);
    this.largura = largura;
    this.altura = altura;
  }

  public double getLargura(){
    return this.largura;
  }
  public void setLargura(double largura){
    this.largura = largura;
  }
  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double altura){
    this.altura = altura;
  }
  public double calcularArea(){
    return this.largura * this.altura;
  }
  public double calcularPerimetro(){
    return 2 * (this.largura + this.altura);
  }
  public String getTipoFigura(){
    return "Retângulo";
  }
  public String getDetalhes(){
    return "Largura: " + String.format("%.2f", this.largura) + ", Altura: " + String.format("%.2f", this.altura);
  }
  
  public String getInfo(){
    return "ID: " + this.getID() + ", Cor: " + this.getCor() + ", Tipo: " + this.getTipoFigura() + ", " +  getDetalhes() + ", Área: " + String.format("%.2f", this.calcularArea()) + ", Perímetro: " + String.format("%.2f", this.calcularPerimetro());
  }
  
}
