package br.restapp.app.model;

public class Candidato {
    private Long Id;
    private String Numero;
    private String Nome;
    private String Tipo_Candidato;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getTipo_Candidato() {
        return Tipo_Candidato;
    }
    public void setTipo_Candidato(String tipo_Candidato) {
        Tipo_Candidato = tipo_Candidato;
    }


}
