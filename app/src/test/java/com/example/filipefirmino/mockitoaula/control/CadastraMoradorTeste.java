package com.example.filipefirmino.mockitoaula.control;

import com.example.filipefirmino.mockitoaula.model.MoradorRepublica;

import org.junit.Test;
import org.mockito.Mockito;

public class CadastraMoradorTeste {

    MoradorRepublica cm = Mockito.mock(MoradorRepublica.class);

    @Test
    public void setCadastroMorador_Verifica_When_Test() {
        MoradorRepublica morador1 = new MoradorRepublica();

        morador1.setNome("Teste1");
        morador1.setIdade(15);
        morador1.setCidadeNatal("Teste2");
        morador1.setCurso("Teste3");
    }
}
