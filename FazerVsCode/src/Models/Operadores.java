package Models;

public class Operadores {
    private float p1;
    private float p2;

    // Construtor
    public Operadores(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getter
    public float getP1() {
        return p1;
    }
    public float getP2() {
        return p2;
    }

    // operações básicas
    public float adicao(float v1, float v2){
        return v1+v2;
    }
    public float subtracao(float v1, float v2){
        return v1-v2;
    }
    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }
    public float divisao(float v1, float v2){
        return v1/v2;
    }

    // Desafio da Atividade
    // Operadores de atribuição
    public float atribuicao(){
        float valor = p1;
        valor += p2;
        return valor;
    }
    // Operadores de comparação
    public String comparacao(){
        if(p1 == p2){
            return "Os valores são iguais;";
        } else if(p1 > p2){
            return "O primeiro valor é maior que o segundo.";
        } else{
            return "O segundo valor é maior que o primeiro";
        }
    }
    // Operadores lógico
    public String logigo(){
        if (p1 > 0 && p2 > 0){
            return "Ambos os valores são positivos.";
        } else  if (p1 > 0 || p2 > 0){
            return "Pelo menos um valor é positivo.";
        } else{
            return "Nenhum valor positivo.";
        }
    }
}
