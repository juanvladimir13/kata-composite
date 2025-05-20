package com.juanvladimir13;

import com.juanvladimir13.solve1.Menu;
import com.juanvladimir13.solve1.MenuItem;
import com.juanvladimir13.solve2.Document;
import com.juanvladimir13.solve2.DocumentComponent;
import com.juanvladimir13.solve2.DocumentFolder;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.kataMenuRestaurant();
        m.kataSistemaDocumentos();
    }

    private void kataMenuRestaurant(){
        MenuItem pizza = new MenuItem("Pizza", 10);
        MenuItem ensalada = new MenuItem("Ensalada", 5);

        Menu almuerzo = new Menu("Almuerzo");
        almuerzo.addComponent(pizza);
        almuerzo.addComponent(ensalada);
        almuerzo.showDetails();
    }

    private void kataSistemaDocumentos(){
        DocumentComponent doc1 = new Document("Informe.docx", 5);
        DocumentComponent doc2 = new Document("Presentación.pptx", 10);

        // Carpeta con documentos
        DocumentFolder carpetaProyectos = new DocumentFolder("Proyectos");
        carpetaProyectos.add(doc1);
        carpetaProyectos.add(doc2);

        // Mostrar estructura
        carpetaProyectos.showDetails();
    }
}
