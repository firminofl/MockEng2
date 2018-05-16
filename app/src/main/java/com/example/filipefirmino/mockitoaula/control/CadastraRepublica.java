package com.example.filipefirmino.mockitoaula.control;

import com.example.filipefirmino.mockitoaula.model.Republica;

public class CadastraRepublica {

    public CadastraRepublica() {
    }

    public Republica cadastraMorador(Republica republica) {

        republica = new Republica();

        republica.setNomeRepublica("Toca do Bacanal");
        republica.setIdade(24);
        republica.setEndereco("Quito Carneiro");

        return republica;
    }
}
