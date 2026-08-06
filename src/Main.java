public class Main {
    public static void main(String[] args) {
        Prato p1 = new Prato("Baião de dois");

        Ingrediente i1 = new Ingrediente("Arroz",60);
        Ingrediente i2 = new Ingrediente("Feijão de corda",20);
        Ingrediente i3 = new Ingrediente("Queijo", 130);

        p1.inserirIngrediente(i1);
        p1.inserirIngrediente(i2);
        p1.inserirIngrediente(i3);

        System.out.println("A quantidade total de calorias do prato "+p1.getNomePrato()+" é de "+p1.caloriasTotais());
        System.out.println("O prato "+p1.getNomePrato()+" é muito calórico? "+p1.verificarNivelCalorico());
    }
}