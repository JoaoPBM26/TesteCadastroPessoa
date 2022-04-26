package virandoocapeta;

import ClassePessoa.Pessoa;

/**
 *
 * @author João Pedro
 */
public class PessoaFisica extends Pessoa {
    private int rg, cpf;
    private String tipo;

    public PessoaFisica() {
    }
    
    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }
    
    
}
