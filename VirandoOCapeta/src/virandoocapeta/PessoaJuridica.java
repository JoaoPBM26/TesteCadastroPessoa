
package virandoocapeta;

import ClassePessoa.Pessoa;

/**
 *
 * @author João Pedro
 */
public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String tipo;
    
    public PessoaJuridica(){
       this.cnpj = cnpj;
       this.tipo = tipo;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getTipo() {
        return tipo;
    }
}
