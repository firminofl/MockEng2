package com.example.filipefirmino.mockitoaula.control;

import com.example.filipefirmino.mockitoaula.model.MoradorRepublica;

public class CadastroMorador {

    public CadastroMorador() {
    }

    public MoradorRepublica cadastraMorador() {

        MoradorRepublica moradorRepublica = new MoradorRepublica();

        moradorRepublica.setNome("Filipe");
        moradorRepublica.setIdade(20);
        moradorRepublica.setCidadeNatal("SGS");
        moradorRepublica.setCurso("Computação");

        return moradorRepublica;
    }

}
