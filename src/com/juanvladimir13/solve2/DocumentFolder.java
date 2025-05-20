package com.juanvladimir13.solve2;

/**
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */

import java.util.ArrayList;
import java.util.List;

public class DocumentFolder implements DocumentComponent {
  private String name;
  private List<DocumentComponent> contents = new ArrayList<>();

  public DocumentFolder(String name) {
    this.name = name;
  }

  public void add(DocumentComponent component) {
    contents.add(component);
  }

  public void remove(DocumentComponent component) {
    contents.remove(component);
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (DocumentComponent component : contents) {
      totalSize += component.getSize();
    }
    return totalSize;
  }

  @Override
  public void showDetails() {
    System.out.println("Carpeta: " + name + ", Tamaño Total: " + getSize() + "MB");
    for (DocumentComponent component : contents) {
      component.showDetails();
    }
  }
}
