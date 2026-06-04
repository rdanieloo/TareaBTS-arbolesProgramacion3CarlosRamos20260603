# Tarea BTS-Arboles Programacion3
**Estudiante:** Carlos Daniel Ramos Moran
**Carne:**0905-23-14141
**Curso:** Programación 3 — UMG 2026

## ¿Cómo ejecutar?
Abrir el proyecto en Eclipse como Maven Project y ejecutar la clase Principal
**Desde Eclipse:**
1. Debemos de Importar como Maven Project Luego en Existing Maven Projects
2. Debemos seleccionar la carpeta arboles 1
3. Debemos de dar Clic derecho en Principal.java, luego en Run As, luego en Java Application

## Problema 1 — contarNodos
Implementé un método recursivo que recorre todo el árbol contando cada nodo. 
No usa el campo `tamanio` existente, solo recursividad pura.
<img width="1279" height="657" alt="image" src="https://github.com/user-attachments/assets/6ed4cc2e-21db-489b-ae56-64cf1b36c168" />
<img width="589" height="152" alt="image" src="https://github.com/user-attachments/assets/cdd1a6ad-95b5-44b2-9d1b-eaa5456452b8" />

## Problema 2 — esBalanceado
Verifiqué que en cada nodo la diferencia de alturas entre sus dos subárboles 
no supere 1. Usé -2 como valor centinela para propagar el desequilibrio.
<img width="920" height="582" alt="image" src="https://github.com/user-attachments/assets/11dac07b-b60a-4004-9433-18f86ded31ed" />
<img width="563" height="227" alt="image" src="https://github.com/user-attachments/assets/3343ef6f-e478-4be8-b5b4-a2a9c724ac49" />

## Problema 3 — esBSTValido
Comprobé que el árbol cumple la propiedad BST en todos sus nodos, pasando 
un rango (min, max) permitido en cada llamada recursiva.
<img width="920" height="627" alt="image" src="https://github.com/user-attachments/assets/77f9ba7e-44e0-45d6-a8dd-c52a69af3a0f" />
<img width="806" height="470" alt="image" src="https://github.com/user-attachments/assets/dbbc0e23-429d-41ab-baf4-d848b525550e" />

## Problema 4 — ancestroComunMasBajo (LCA)
Encontré el ancestro común más bajo de dos valores aprovechando la propiedad 
del BST para navegar directamente sin recorrer nodos innecesarios.
<img width="921" height="644" alt="image" src="https://github.com/user-attachments/assets/a83e93b3-c859-4c1f-b396-58c8c619e99b" />
<img width="811" height="690" alt="image" src="https://github.com/user-attachments/assets/5fba56e3-80b5-40e1-a7fb-68458626b4b4" />


## Problema 5 — invertir
Reflejé el árbol completo intercambiando izquierdo y derecho en cada nodo. 
Después de invertir, el inOrden produce los valores en orden descendente.
<img width="921" height="584" alt="image" src="https://github.com/user-attachments/assets/b12e09d2-7ea2-4ca6-9aa9-3bc19550b87e" />
<img width="766" height="505" alt="image" src="https://github.com/user-attachments/assets/359b1d67-fefb-402d-83ec-9fc39350536d" />

## Captura de 5 Problemas
<img width="903" height="1120" alt="image" src="https://github.com/user-attachments/assets/f34f0d56-e525-4aeb-af09-bf7d9e34ea50" />

## Problema Extra E1 — kEsimoMenor
Implementé un recorrido inOrden que lleva un contador interno hasta 
llegar al k-ésimo elemento. No necesita guardar todos los valores 
en un arreglo auxiliar.
<img width="921" height="688" alt="image" src="https://github.com/user-attachments/assets/a408eb94-712c-4a42-97ae-419a86d26657" />
<img width="784" height="219" alt="image" src="https://github.com/user-attachments/assets/30c2ba8e-7a22-43b0-b184-e4a9ed8e3a3a" />


## Problema Extra E2 — imprimirRangoOrdenado
Recorro el árbol en inOrden imprimiendo solo los valores dentro del 
rango [min, max]. Descarto subárboles completos cuando sé que no 
pueden contener valores dentro del rango, haciéndolo más eficiente.
<img width="921" height="666" alt="image" src="https://github.com/user-attachments/assets/1ac582de-725e-4dee-bab6-adb50faffda9" />
<img width="900" height="164" alt="image" src="https://github.com/user-attachments/assets/22e68ae9-a941-4273-9f11-b244ac9943c2" />

## Capturas adicionales:
<img width="863" height="1334" alt="image" src="https://github.com/user-attachments/assets/7ca3cac0-9f9b-44f3-8aa8-4b70d7485476" />
<img width="921" height="1212" alt="image" src="https://github.com/user-attachments/assets/2c7e8d6e-f3fe-4022-a594-c087a5005a26" />
<img width="917" height="1080" alt="image" src="https://github.com/user-attachments/assets/9bf91f2c-fb8d-41f2-8c55-db56c96b49ed" />


Muchas Gracias Ing. Walter Cordova,
