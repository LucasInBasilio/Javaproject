
package rpgjava;

public class Cliente {
    
        public String nome;
    public String email;
    public String senha;
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void imprimiCliente(){

        System.out.println(
                "Nome: " + nome + " | " + 
                    "Email: " + email + " | " + 
                        "Senha: " + senha + " | ");
}
    }
