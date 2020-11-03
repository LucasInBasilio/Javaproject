
package rpgjava;

public class RpgJava {
    public static void main(String[] args) {

        String nome2 = "";
           Cadastrar form = new Cadastrar();
            
           Cliente cliente1 = new Cliente(form.nome,form.email,form.senha);
           
           String emailcli = cliente1.getEmail();
           String senhacli = cliente1.getSenha();
           

             
           
             
    }
    
}
