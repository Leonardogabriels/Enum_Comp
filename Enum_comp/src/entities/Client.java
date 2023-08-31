package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat frmts = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private Date date;

    
    
    public Client() {
    }

    public Client(String nome, String email, Date frmt) {
        this.nome = nome;
        this.email = email;
        this.date = frmt;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  nome + ", " + email + ", date " + frmts.format(getDate()) ;
    }
    
    

    
    
}
