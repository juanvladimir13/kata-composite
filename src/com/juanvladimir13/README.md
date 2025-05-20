## Kata 2: Menú de Restaurante

### Problema
Crea un sistema para representar un menú de restaurante. Cada elemento del menú tiene un nombre y un precio. Los menús pueden contener submenús y elementos individuales.

### Instrucciones
1. Crea una interfaz `MenuComponent` con métodos `getPrice()` y `showDetails()`.
2. Implementa una clase `MenuItem` para representar un elemento individual.
3. Implementa una clase `Menu` para representar un menú que contenga otros `MenuComponent`.
4. En el cliente, crea un menú con submenús y calcula el precio total.

### Salida Esperada

```
Elemento: Pizza, Precio: 10
Elemento: Ensalada, Precio: 5 
Menú: Almuerzo, Precio Total: $15
```

---

## Kata 10: Sistema de Documentos

### Problema
Crea un sistema para representar documentos y carpetas de documentos. Cada documento tiene un nombre y un tamaño. Las carpetas pueden contener documentos y otras carpetas.

### Instrucciones
1. Crea una interfaz `DocumentComponent` con métodos `getSize()` y `showDetails()`.
2. Implementa una clase `Document` para documentos individuales.
3. Implementa una clase `DocumentFolder` para carpetas de documentos.
4. En el cliente, crea una estructura de documentos y carpetas y calcula el tamaño total.

### Salida Esperada

```
Documento: Informe.docx, Tamaño: 5MB
Documento: Presentación.pptx, Tamaño: 10MB
Carpeta: Proyectos, Tamaño Total: 15MB
```