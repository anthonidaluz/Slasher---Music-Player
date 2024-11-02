package Classes;

import java.io.Serializable;

public class Contas implements Serializable  {
    
    private String Nome;
    private String Senha;
    private String numero;

    public Contas() {
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contas{" + "Nome=" + Nome + ", Senha=" + Senha + ", numero=" + numero + '}';
    }
    
    
                
    
    
}
