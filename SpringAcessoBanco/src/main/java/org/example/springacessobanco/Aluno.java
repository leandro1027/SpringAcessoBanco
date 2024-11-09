package org.example.springacessobanco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Getter
    @Setter

    public class Aluno {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nome;

        private String endereco;
    }
