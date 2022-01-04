package com.kuang.demo01;

public class Test1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(()->{
            for(int i=0;i<20;i--){
                if(ticket.tickets>0){
                    ticket.grabVotes();
                }

            }
        },"1").start();

        new Thread(()->{
            for(int i=0;i<20;i--){
                if(ticket.tickets>0){
                    ticket.grabVotes();
                }

            }

        },"2").start();
    }
}
class Ticket{
    int tickets = 20;
    public synchronized void grabVotes(){
        System.out.println(tickets--+"-------"+Thread.currentThread().getName());
    }
}
