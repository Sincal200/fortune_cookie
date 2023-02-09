package com.mycompany.fortune_cookie;

import com.mycompany.fortune_cookie.interfaz.Interfaz;
import java.util.Random;
public class Fortune_Cookie {
    
    public void frase(){
        
        String [] frases  = {"Un nuevo par de zapatos te hará mucho bien.",
            "Un momento emocionante está en su futuro inmediato.",
            "Evite hacer apuestas innecesarias.",
            "Hacer o no hacer. Aquí no hay intentos.",
            "¿Sientes que estás caminando en el barro? Tómate tu tiempo hoy.",
            "Cada salida es una entrada a nuevas experiencias.",
            "Ignora la cookie anterior.",
            "El matrimonio te permite molestar a una persona especial por el resto de tu vida.",
            "Quizás puedas vivir en la luna en el próximo siglo.",
            "Nunca se burle de un enano armado chocando los cinco.",
            "Escuche solamente la galleta de la fortuna; ignore todas las demás unidades de adivinación.",
            "Algunas galletas de la fortuna no contienen fortuna.",
            "La fortuna que buscas está en otra galleta.",
            "Las bandas de goma se dirigen en la dirección correcta.",
            "El tiempo cura todas las heridas. Mantener la cabeza en alto.",
            "Hoy es probablemente una gran mejora con respecto a ayer."}; 
    
        Random random = new Random();
        int number = random.nextInt(frases.length);
        Interfaz.jTextField1.setText(frases[number]);
    }

    public static void main(String[] args) {
    }
}
