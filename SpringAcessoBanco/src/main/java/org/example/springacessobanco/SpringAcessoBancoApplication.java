package org.example.springacessobanco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAcessoBancoApplication implements CommandLineRunner {

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(SpringAcessoBancoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("LeandroSpring");
        aluno.setEndereco("Rua do Spring, número 3");
        alunoRepositorio.save(aluno);
    }
}
