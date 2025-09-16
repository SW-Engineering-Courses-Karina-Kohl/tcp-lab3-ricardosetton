import java.lang.Math;

public class TrianguloEquilatero extends FiguraGeometrica{

  private double lado;

  public TrianguloEquilatero(String cor, double lado){
    super(cor);
    this.lado = lado;
  }

  public double getLado(){
    return this.lado;
  }
  public void setLado(double lado){
    this.lado = lado;
  }
  public double calcularArea(){
    return Math.pow(3, 0.5) * Math.pow(this.lado, 2) / 4;
  }
  public double calcularPerimetro(){
    return 3 * this.lado;
  }
  public String getTipoFigura(){
    return "Triângulo Equilátero";
  }
  public String getDetalhes(){
    return "Lados: " + String.format("%.2f", this.lado);
  }
  public String getInfo(){
    return "ID: " + this.getID() + ", Cor: " + this.getCor() + ", Tipo: " + this.getTipoFigura() + ", " + getDetalhes() + ", Área: " + String.format("%.2f", this.calcularArea()) + ", Perímetro: " + String.format("%.2f", this.calcularPerimetro());
  }
  
}
