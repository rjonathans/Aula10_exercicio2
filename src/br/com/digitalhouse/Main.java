package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Coca latinha = new Coca(300,3.50D);
        Coca garrafa = new Coca(300,8.00);

        Set<Coca> refrigerante = new HashSet<>();{
            refrigerante.add(latinha);
            refrigerante.add(garrafa);
        }
        System.out.println(
                //latinha
                /*RESULTADO DA IMPRESSAO DO OBJETO latinha:
                    1) antes do toString:
                br.com.digitalhouse.Coca@1b6d3586
                    2) depois do toString:
                Temos Coca em lata e Garrafa:
                tamanho: 300ml
                preco: R$ 3.5*/

                //refrigerante
                /*RESULTADO DA IMPRESSAO DO ARRAY LIST:
                    Depois do toString:
                [Temos Coca em lata e Garrafa:
                tamanho: 300ml
                preco: R$ 3.5, Temos Coca em lata e Garrafa:
                tamanho: 500ml
                preco: R$ 8.0]*/

                latinha.equals(garrafa)
                /*RESULTADO DOS TESTES:
                    1) Quando comparamos o equals antes de
                sobrescreve-lo na classe Coca o resultado é false.
                    2) Quando comparamos o equals depois de
                sobrescreve-lo na classe Coca o resultado é True.

                Isso ocorre pq somente depois de sobrescrever o equals que
                o objeto passa a ter atributos*/


                );
    }
}
