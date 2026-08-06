import java.util.ArrayList;

public class Prato {
    private String nomePrato;
    private ArrayList<Ingrediente> ingredientes;

    public Prato(String nomePrato){
        this.nomePrato = nomePrato;
        this.ingredientes = new ArrayList<>();
    }
    public void inserirIngrediente(Ingrediente e){
        this.ingredientes.add(e);
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public Integer caloriasTotais(){
        Integer valorTotal = 0;

        for (int i = 0;i<=ingredientes.size()-1;i++){

            Ingrediente ingre = this.ingredientes.get(i);
            valorTotal += ingre.getCaloriasPorPorcao();
        }
        return valorTotal;
    }
    public Boolean verificarNivelCalorico(){
        Integer somaCalorica = 0;

        for (int i = 0;i<=this.ingredientes.size()-1;i++){

            Ingrediente ingre = this.ingredientes.get(i);

            somaCalorica += ingre.getCaloriasPorPorcao();
        }
        if (somaCalorica < 500){
            return false;
        }else{
            return true;
        }
    }
}
