package diccionarioLPD10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> diccionarioEspIng = new HashMap<>();
		diccionarioEspIng.put("gato", "cat");
        diccionarioEspIng.put("corazon", "heart");
        diccionarioEspIng.put("comida", "food");
        diccionarioEspIng.put("cantar", "sing");
        diccionarioEspIng.put("cama", "bed");
        diccionarioEspIng.put("celular", "phone");
        diccionarioEspIng.put("ventana", "window");
        diccionarioEspIng.put("mano", "hand");
        diccionarioEspIng.put("falda", "skirt");
        diccionarioEspIng.put("avena", "oatmeal");
        diccionarioEspIng.put("silla", "chair");
        diccionarioEspIng.put("piso", "floor");
        diccionarioEspIng.put("cuarto", "room");
        diccionarioEspIng.put("maquillaje", "makeup");
        diccionarioEspIng.put("aguacate", "avocado");
        diccionarioEspIng.put("platano", "banana");
        diccionarioEspIng.put("rojo", "red");
        diccionarioEspIng.put("azul", "blue");
        diccionarioEspIng.put("uno", "one");
        diccionarioEspIng.put("mesa", "table");

        List<String> palabrasSpain = new ArrayList<>(diccionarioEspIng.keySet());
        Collections.shuffle(palabrasSpain);

        Scanner scanner = new Scanner(System.in);
        int PalabrasCorrectas = 0;

        for (int i = 0; i < 5; i++) {
            String palabraSpain = palabrasSpain.get(i);
            System.out.print("Traduce al ingles'" + palabraSpain + "': ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            if (respuestaUsuario.equals(diccionarioEspIng.get(palabraSpain))) {
                PalabrasCorrectas++;
            } 
        }

        System.out.println("Tus respuestas correctas fueron: " + PalabrasCorrectas);
        System.out.println("Tus respuestas incorrectas fueron: " + ( 5 - PalabrasCorrectas));
        scanner.close();
	}

}
