public class Produto {

    //private é chamado de encapsulamento se vai permitir alterar ou não as propriedades
    private String nome;

    private double valor;



// ele nao seta e nao pega produto ele so joga produto na memoria para depois colocar valores para ele
    public Produto() {
    }

// ele seta um objeto na memoria com os valores ja definidos
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }





















    public String getNome() {
        return nome;
    }


    //
    public void setNome(String nome) {
        this.nome = nome;
    }





    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    //isso vai tranformar todos os valores que dei pro produto em texto, pra printar pro usuario
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
