public class Ingrediente {
    private String nome;
    private Integer caloriasPorPorcao;


    public Ingrediente(String nome,Integer caloriasPorPorcao){
        this.nome = nome;
        this.caloriasPorPorcao = caloriasPorPorcao;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String valor){
        this.nome = valor;
    }
    public Integer getCaloriasPorPorcao(){
        return this.caloriasPorPorcao;
    }
    public void setCaloriasPorPorcao(Integer valor){
        this.caloriasPorPorcao = valor;
    }
}
