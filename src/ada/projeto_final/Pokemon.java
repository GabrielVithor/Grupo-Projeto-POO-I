package ada.projeto_final;

public class Pokemon {
    private final String nome;
    private float vida;
    private final String[] ataques;

    // Cria um pokémon com o nome e os ataques especificados
    public Pokemon(String nome, String[] ataques) {
        this.nome = nome;
        this.ataques = ataques;
        this.vida = 1000; // Valor padrão de vida para todos os pokémons
    }

    public String getNome() {
        return nome;
    }

    // Retorna se o pokémon ainda está vivo (se a vida ainda é maior que 0)
    public boolean estaVivo() {
        return vida > 0;
    }

    // Aplica o dano especificado ao pokémon
    public void aplicarDano(int damage) {
        vida = Math.max(0, vida - damage);
    }

    // Exibe os ataques do pokémon
    public void mostrarAtaques() {
        for (int i = 0; i < ataques.length; i++) {
            System.out.println((i + 1) + " - " + ataques[i]);
        }
    }
}

