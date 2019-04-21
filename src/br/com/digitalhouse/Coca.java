package br.com.digitalhouse;

import java.awt.event.ComponentAdapter;
import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private Double preco;

    public Coca(){
    }

    public Coca(Integer tamanho,Double preco){
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Integer getTamanho(){
        return tamanho;
    }

    public void setTamanho(Integer tamanho){
        this.tamanho = tamanho;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    @Override
    public boolean equals(Object outraCoca) {
        if (!(outraCoca instanceof Coca)){
            return false;
            /*instanceof usamos para verificar se um objeto passa na relação 'é um' para aquela classe.
            nesse caso usamos operador ! para negar e pedimos o retorno false.
            (ou seja, se o objeto é um tipo daquela classe diretamente ou por herança)
             */
        }
        if (((Coca) outraCoca).getTamanho().equals(this.getTamanho())){
            return true;
            /*o método equals verifica se um objeto é signifcativamente equivalente ao
            passado pelo parametro do metodo no caso(outraCoca), ou seja, nao tem nada a ver com endereço
            de memoria serem iguais, que aliás não são. Por exemplo na classe String o metodo equals será true
            se elas tiverem o mesmo valor, mas elas podem ter endereços de memoria diferentes.
             */
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanho, preco);
    }

    @Override
    public String toString() {
        return "Temos Coca em lata e Garrafa: " +
                "\ntamanho: " + tamanho + "ml"+
                "\npreco: R$ " + preco ;
    }



}
