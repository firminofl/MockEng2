package com.example.filipefirmino.mockitoaula.control;

import com.example.filipefirmino.mockitoaula.model.Republica;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CadastraRepublicaTeste {

    private CadastraRepublica republicaComMockito;
    private CadastraRepublica republicaSemMockito;

    @Before
    public void instancias() {
        republicaComMockito = Mockito.mock(CadastraRepublica.class);
        republicaSemMockito = new CadastraRepublica();
    }

    @Test
    public void cadastraRepublica_Verifica_When_Test() {
        Republica rep = new Republica();

        Mockito.when(republicaComMockito.cadastraMorador(rep)).thenReturn(rep);
    }

    @Test
    public void cadastraRepublica_Verifica_atributos_Test() {
        Republica republica = new Republica();

        republica.setNomeRepublica("Toca do Bacanal");
        republica.setIdade(24);
        republica.setEndereco("Quito Carneiro");

        CadastraRepublica cadastraRepublica2 = new CadastraRepublica();
        Assert.assertEquals(republica.getNomeRepublica(), cadastraRepublica2.cadastraMorador(republica).getNomeRepublica());
    }

    @Test
    public void cadastraRepublica_Verifica_objectos_Test() {
        Republica republica = new Republica();

        republica.setNomeRepublica("Toca do Bacanal");
        republica.setIdade(224);
        republica.setEndereco("Quito Carneiro");

        Assert.assertEquals(republica, republicaSemMockito.cadastraMorador(republica));
    }
}
