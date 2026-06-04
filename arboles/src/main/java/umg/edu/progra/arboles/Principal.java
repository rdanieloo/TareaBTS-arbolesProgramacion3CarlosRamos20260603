package umg.edu.progra.arboles;

/**
 * Clase principal que demuestra el uso del Arbol Binario de Busqueda (BST)
 * implementado manualmente, sin usar librerias como java.util.
 *
 * Ejecucion sugerida:
 *   1. mvn compile
 *   2. mvn exec:java -Dexec.mainClass="umg.edu.progra.arboles.Principal"
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        /*
         * Insertamos estos valores para formar el siguiente BST:
         *
         *               50
         *              /  \
         *            30    70
         *           /  \   / \
         *          20  40 60  80
         *         /
         *        10
         */
        int[] valores = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : valores) {
            arbol.insertar(v);
        }

        System.out.println("===== Arbol Binario de Busqueda =====");
        System.out.println("Tamanio: " + arbol.tamanio());
        System.out.println("Altura:  " + arbol.altura());
        System.out.println("Minimo:  " + arbol.minimo());
        System.out.println("Maximo:  " + arbol.maximo());
        System.out.println("Hojas:   " + arbol.contarHojas());

        System.out.println("\n--- Representacion visual (rotada 90 grados) ---");
        arbol.imprimirArbol();

        System.out.println("\n--- Recorridos ---");
        System.out.print("InOrden    (ascendente): ");
        arbol.inOrden();

        System.out.print("PreOrden   (raiz primero): ");
        arbol.preOrden();

        System.out.print("PostOrden  (raiz al final): ");
        arbol.postOrden();

        System.out.print("Por niveles (BFS):         ");
        arbol.recorridoPorNiveles();

        System.out.println("\n--- Busquedas ---");
        System.out.println("Contiene 40? " + arbol.contiene(40));
        System.out.println("Contiene 99? " + arbol.contiene(99));

        System.out.println("\n--- Eliminacion ---");
        System.out.println("Eliminando 20 (nodo con 1 hijo)...");
        arbol.eliminar(20);
        System.out.print("InOrden tras eliminar 20: ");
        arbol.inOrden();

        System.out.println("Eliminando 30 (nodo con 2 hijos)...");
        arbol.eliminar(30);
        System.out.print("InOrden tras eliminar 30: ");
        arbol.inOrden();

        System.out.println("Eliminando 50 (raiz)...");
        arbol.eliminar(50);
        System.out.print("InOrden tras eliminar la raiz: ");
        arbol.inOrden();

        System.out.println("\n--- Estado final ---");
        arbol.imprimirArbol();
        System.out.println("Tamanio final: " + arbol.tamanio());
        System.out.println("Altura final:  " + arbol.altura());

        /*
         * Ejercicios
         *
         *  1. Implementar un metodo que devuelva la cantidad TOTAL de nodos
         *     usando recursividad (sin usar el campo 'tamanio').
         *  2. Implementar un metodo 'esBalanceado()' que indique si el arbol
         *     esta balanceado (diferencia de alturas <= 1 en cada nodo).
         *  3. Implementar 'esBSTValido()' que verifique que el arbol cumple
         *     la propiedad de BST recorriendo los nodos.
         *  4. Implementar un metodo para encontrar el ancestro comun mas
         *     bajo (LCA) entre dos valores.
         *  5. Implementar la inversion del arbol (espejo).
         */
        

        //Carlos Ramos 0905 23 14141
        
        // PROBLEMA 1 — contarNodos recursivo

        ArbolBinarioBusqueda arbol1 = new ArbolBinarioBusqueda();
        int[] vals1 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : vals1) arbol1.insertar(v);

        System.out.println("\n========== PROBLEMA 1: contarNodos ==========");
        System.out.println("Nodos (recursivo): " + arbol1.contarNodos());
        System.out.println("Tamanio (campo):   " + arbol1.tamanio());
        arbol1.insertar(5);
        System.out.println("Despues de insertar 5 -> Nodos: " + arbol1.contarNodos() + "  Tamanio: " + arbol1.tamanio());
        arbol1.eliminar(5);
        System.out.println("Despues de eliminar 5 -> Nodos: " + arbol1.contarNodos() + "  Tamanio: " + arbol1.tamanio());
        
        //Carlos Ramos 0905 23 14141
        
        // PROBLEMA 2 — esBalanceado
        
        ArbolBinarioBusqueda arbol2 = new ArbolBinarioBusqueda();
        int[] vals2 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : vals2) arbol2.insertar(v);

        System.out.println("\n========== PROBLEMA 2: esBalanceado ==========");
        System.out.println("Arbol principal balanceado: " + arbol2.esBalanceado());

        ArbolBinarioBusqueda desbalanceado = new ArbolBinarioBusqueda();
        int[] lineales = {1, 2, 3, 4, 5};
        for (int v : lineales) desbalanceado.insertar(v);
        System.out.println("Arbol lineal 1-2-3-4-5 balanceado: " + desbalanceado.esBalanceado());
        System.out.println("Visual del arbol desbalanceado:");
        desbalanceado.imprimirArbol();
        
        //Carlos Ramos 0905 23 14141
        
        // PROBLEMA 3 — esBSTValido
        
        ArbolBinarioBusqueda arbol3 = new ArbolBinarioBusqueda();
        int[] vals3 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : vals3) arbol3.insertar(v);

        System.out.println("\n========== PROBLEMA 3: esBSTValido ==========");
        System.out.println("Arbol original es BST valido: " + arbol3.esBSTValido());

        ArbolBinarioBusqueda roto = new ArbolBinarioBusqueda();
        roto.insertar(50);
        roto.insertar(30);
        roto.insertar(70);
        roto.getRaiz().izquierdo.dato = 99;
        System.out.println("Arbol roto (99 en subarbol izquierdo): " + roto.esBSTValido());
        
        //Carlos Ramos 0905 23 14141
    
        // PROBLEMA 4 — ancestroComunMasBajo
       
        ArbolBinarioBusqueda arbol4 = new ArbolBinarioBusqueda();
        int[] vals4 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : vals4) arbol4.insertar(v);

        System.out.println("\n========== PROBLEMA 4: ancestroComunMasBajo (LCA) ==========");
        System.out.println("LCA(10, 40) = " + arbol4.ancestroComunMasBajo(10, 40));
        System.out.println("LCA(10, 80) = " + arbol4.ancestroComunMasBajo(10, 80));
        System.out.println("LCA(60, 80) = " + arbol4.ancestroComunMasBajo(60, 80));
        try {
            arbol4.ancestroComunMasBajo(10, 99);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }
        
        //Carlos Ramos 0905 23 14141
        
        // PROBLEMA 5 — invertir (espejo)
        
        ArbolBinarioBusqueda arbol5 = new ArbolBinarioBusqueda();
        int[] vals5 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : vals5) arbol5.insertar(v);

        System.out.println("\n========== PROBLEMA 5: invertir (espejo) ==========");
        System.out.println("Antes de invertir:");
        arbol5.imprimirArbol();
        System.out.print("InOrden antes: ");
        arbol5.inOrden();

        arbol5.invertir();

        System.out.println("Despues de invertir:");
        arbol5.imprimirArbol();
        System.out.print("InOrden despues (descendente): ");
        arbol5.inOrden();
        
        //Carlos Ramos 0905 23 14141
        
        //Problema EXTRA E1 — kEsimoMenor
       
        ArbolBinarioBusqueda arbolE1 = new ArbolBinarioBusqueda();
        int[] valsE1 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : valsE1) arbolE1.insertar(v);

        System.out.println("\n========== EXTRA E1: kEsimoMenor ==========");
        System.out.print("InOrden de referencia: ");
        arbolE1.inOrden();
        System.out.println("El 1er menor: " + arbolE1.kEsimoMenor(1));
        System.out.println("El 3er menor: " + arbolE1.kEsimoMenor(3));
        System.out.println("El 8vo menor: " + arbolE1.kEsimoMenor(8));
        try {
            arbolE1.kEsimoMenor(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion para k=0: " + e.getMessage());
        }
        
        //Carlos Ramos 0905 23 14141
        
        //Problema EXTRA E2 — imprimirRangoOrdenado

        ArbolBinarioBusqueda arbolE2 = new ArbolBinarioBusqueda();
        int[] valsE2 = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : valsE2) arbolE2.insertar(v);

        System.out.println("\n========== EXTRA E2: imprimirRangoOrdenado ==========");
        System.out.print("Valores en [20, 60]: ");
        arbolE2.imprimirRangoOrdenado(20, 60);
        System.out.print("Valores en [1, 35]:  ");
        arbolE2.imprimirRangoOrdenado(1, 35);
        System.out.print("Valores en [50, 80]: ");
        arbolE2.imprimirRangoOrdenado(50, 80);
     
    }
}
