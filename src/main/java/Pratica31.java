/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1611810
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class Pratica31 {
    public static void main(String[] args) {
        Date inicio = new Date();
        String meuNome = ("Heitor Derder Trevisol");
        System.out.println(meuNome.toUpperCase());
        System.out.println(meuNome.substring(14,15).toUpperCase() + meuNome.substring(15) +", " + meuNome.substring(0,1).toUpperCase() + ". " + meuNome.substring(7, 8).toUpperCase() + ".");
        
        GregorianCalendar dataNascimento= new GregorianCalendar (1996, 9, 9);
        GregorianCalendar agora = new GregorianCalendar();
        //long dias = agora.computeTime() - dataNascimento.computeTime();
        
        //System.out.println("Dias: " + dias);
        
        Date fim = new Date();
        long dif = fim.getTime() - inicio.getTime();
        System.out.println(dif);
    }
}             

