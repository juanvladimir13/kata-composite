package com.juanvladimir13.solve1;

/**
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
  private String name;
  private List<MenuComponent> components = new ArrayList<>();

  public Menu(String name) {
    this.name = name;
  }

  public void addComponent(MenuComponent component) {
    components.add(component);
  }

  @Override
  public double getPrice() {
    double total = 0;
    for (MenuComponent component : components) {
      total += component.getPrice();
    }
    return total;
  }

  @Override
  public void showDetails() {
    for (MenuComponent component : components) {
      component.showDetails();
    }
    System.out.println("Menú: " + name + ", Precio Total: $" + getPrice());
  }
}
