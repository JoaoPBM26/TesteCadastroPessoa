package ClassePrincipal;

import ClassePessoa.Pessoa;

/**
 *
 * @author João Pedro
 */
public class VirandoOCapeta {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao Pedro");
        String novoNome = pessoa.getNome();
        System.out.println("Novo nome: " + novoNome);

    }

}
