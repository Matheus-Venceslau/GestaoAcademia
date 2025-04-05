import models.Academia;
import models.Cliente;
import models.Instrutor;

public class Main {
    public static void main(String[] args) {
        
        Academia academia = new Academia("Java Senai Fitness");

        Cliente clienteSenai01 = new Cliente("Paulo", 20, "Plus++");
        Cliente clienteSenai02 = new Cliente("Pedro", 40, "Basico");
        Cliente clienteSenai03 = new Cliente("Luiz", 28, "Premium");

        Instrutor instrutor01 = new Instrutor("Matheus", 21, "Musculação");
        Instrutor instrutor02 = new Instrutor("João", 21, "Pilates");

        academia.adicionarPessoa(clienteSenai01);
        academia.adicionarPessoa(clienteSenai02);
        academia.adicionarPessoa(clienteSenai03);

        academia.adicionarPessoa(instrutor01);
        academia.adicionarPessoa(instrutor02);

        academia.listarPessoas();
    }
}