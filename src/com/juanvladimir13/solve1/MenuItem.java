package com.juanvladimir13.solve1;

/**
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */

public class MenuItem implements MenuComponent {
  private String name;
  private double price;

  public MenuItem(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void showDetails() {
    System.out.println("Elemento: " + name + ", Precio: " + price);
  }
}

