package com.juanvladimir13.solve2;

/**
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */

public class Document implements DocumentComponent {
  private String name;
  private int size; // en MB

  public Document(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void showDetails() {
    System.out.println("Documento: " + name + ", Tamaño: " + size + "MB");
  }
}

