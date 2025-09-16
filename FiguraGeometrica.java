public abstract class FiguraGeometrica implements CalculosGeometricos{

  private String cor;
  private int  id;
  private static int totalFiguras = 0;

  public FiguraGeometrica(String cor){
    this.cor = cor;
    this.id = ++this.totalFiguras;
  }

  public String getCor(){
    return this.cor;
  }
  public void setCor(String cor){
    this.cor = cor;
  }
  public int getID(){
    return this.id;
  }
  public static int getTotalFiguras(){
    return totalFiguras;
  }
  public String getInfo(){
    return "ID: " + this.id + ", Cor: " + this.cor;
  }
  public abstract String getDetalhes();
  
}
