package taller11_ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejecutar_Restaurant {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Aaron Robles");

        Menu menu1 = new MenuACarta("Pollo al ajillo", 25, 5, 3, 10);
        Menu menu2 = new MenuDelDia("Ensalada de atun", 20, 4, 2);
        Menu menu3 = new MenuDeNinos("Hamburguesa", 15, 2, 3);
        Menu menu4 = new MenuEconomico("Dorito", 10, 20);

        cuenta.agregarMenu(menu1);
        cuenta.agregarMenu(menu2);
        cuenta.agregarMenu(menu3);
        cuenta.agregarMenu(menu4);

        cuenta.calcularSubtotal();
        cuenta.calcularIva();
        cuenta.calcularTotal();

        System.out.println(cuenta.toString());
    }
}

class Cuenta {

    public String nombreCliente;
    public List<Menu> menue;
    public double subtotal;
    public double iva;
    public double total;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menue = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        menue.add(menu);
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Menu menu : menue) {
            subtotal += menu.calcularValorMenu();
        }
    }

    public void calcularIva() {
        iva = subtotal * 0.15;
    }

    public void calcularTotal() {
        total = subtotal + iva;
    }

    @Override
    public String toString() {
        String cuentaStr = "Cuenta de " + nombreCliente + "\n";
        cuentaStr += "Menu:\n";
        for (Menu menu : menue) {
            cuentaStr += menu.toString() + "\n";
        }
        cuentaStr += "Subtotal: " + String.format("%.2f", subtotal) + "\n";
        cuentaStr += "IVA: " + String.format("%.2f", iva) + "\n";
        cuentaStr += "Total: " + String.format("%.2f", total) + "\n";
        return cuentaStr;
    }
}

abstract class Menu {

    public String nombrePlato;
    public double valorMenu;
    public double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract double calcularValorMenu();

    @Override
    public String toString() {
        return nombrePlato + " - Valor: " + valorMenu;
    }
}

class MenuACarta extends Menu {

    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeServicio;

    public MenuACarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
    public double calcularValorMenu() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida;
        valorMenu += valorMenu * (porcentajeServicio / 100);
        return valorMenu;
    }
}

class MenuDelDia extends Menu {

    public double valorPostre;
    public double valorBebida;

    public MenuDelDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public double calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
        return valorMenu;
    }
}

class MenuDeNinos extends Menu {

    public double valorHelado;
    public double valorPastel;

    public MenuDeNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public double calcularValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
        return valorMenu;
    }
}

class MenuEconomico extends Menu {

    public double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * (porcentajeDescuento / 100));
        return valorMenu;
    }
}
