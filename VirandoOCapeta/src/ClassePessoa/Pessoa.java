package ClassePessoa;

import virandoocapeta.Contato;

/**
 *
 * @author João Pedro
 */
public class Pessoa extends Contato{
    private String nome, endereco, bairro, cidade, estado;
    private int cep;

    public Pessoa(){
        this.nome = nome;
        this.cep = cep;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCep() {
        return cep;
    }
    
}
