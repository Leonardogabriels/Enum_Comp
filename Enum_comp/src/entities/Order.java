package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.entitiens_enum.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    List<OrderItem> orderItems = new ArrayList<>();
    Client client = new Client();
    
    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem intem){
        orderItems.add(intem);
    }
    public void removeItem(OrderItem intem){
        orderItems.remove(intem);
    }
    public Double total(){
        double total =0;
        for(OrderItem obj : orderItems ){
            total += obj.subTotal();  
        }
        return total;
        
    }


    }
    

    

    

