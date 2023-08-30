package entities;

import java.time.LocalDate;

public class Client {
    private String nome;
    private String email;
    private LocalDate date;
    
    public Client() {
    }

    public Client(String nome, String email, LocalDate date) {
        this.nome = nome;
        this.email = email;
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    

    
    
}
