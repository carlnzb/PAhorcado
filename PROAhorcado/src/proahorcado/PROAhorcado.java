/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proahorcado;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Nuñez
 * @date 16-06-2016 Jueves
 */
public class PROAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new PROAhorcado();
    }
            public PROAhorcado(){
            Scanner scanner = new Scanner(System.in);
            // Metodo para Confirmar si quieres jugar o no.
        int confirmado = JOptionPane.showConfirmDialog(null,"¿Quieres jugar?");//Metodo para confirmar si quieres jugar o no.
        // Metodo para la opcion si o ok del metodo para confirmar.
        if (JOptionPane.OK_OPTION == confirmado){//Metodo para la opcion del si o ok  para confirmar.
        JOptionPane.showMessageDialog(null,"BUENA SUERTE",
                "Inicio",JOptionPane.DEFAULT_OPTION);//Mensaje al usuario.
        }else{//Cilco (else).
            if(confirmado==JOptionPane.OK_CANCEL_OPTION)// Metodo para Confirmar si cancelo o no quieres jugar.
        System.out.println("Cancelo la partida");System.exit(0);//Mensaje de la consila al usaurio.
        }
        int op;//Esta variable se encargara de almacenar los datos del menu.
        String menu=null;//Variable String del menu.
        do{ //Metodo do while para el menu.
            menu="";//Mensaje limpio.
            menu+="    Categorias  \n";//Estas son las categorias a escoger
            menu+="1.- Liga Tica  \n";//La LigaTica es la categoria 1
            menu+="2.- Animales \n";//Los Animales son la segunda categoria
            menu+="3.- Salir \n";//Se tendra la opcion salir para poder salir del juego
            menu+="Escoja una opción";//Se pone esta opcion para que escoja que desea hacer una vez que entra el menu
            String opcion=JOptionPane.showInputDialog(menu);//Metodo para que se introduzca la opcion del menu
            if(opcion==null){ //Metodo de salida si cancelo el menu.  
                op=3;
            }else{//Instruccion (else)
                op=Integer.parseInt(opcion);//Validacion de la variable op para el metodo.
            }
            switch(op){//El siguiente metodo se encarga de clasificar en categorias "switch" 
            case 1://En el caso 1 llama a Liga Tica
                String[] LigaTica={"Saprissa","Heredia","Limon","Alajuelense","Cartago","Perez Zeledon","Santos","Belen","Liberia","San Carlos","Carmelita","UCR"};//Estas son las palabras que seran utilizadas
                 int numeroRandom = 1 + new Random().nextInt(LigaTica.length);//La computadora elije un numero random, que sera el numero de la palabra que eligiremos de la lista de palabras
            String palabraqueescoge = LigaTica[numeroRandom];//Se guarda la palabra que se utilizo en una variable
            System.out.println("Esta palabra tiene "+palabraqueescoge.length()+" letras");//Este System se encarga de escoger la palabra
            String[] palabra = new String[palabraqueescoge.length()];//Si se llena los espacios es que a logrado completar el juego
            imprimirPalabra(palabra);//Se muestra las rayitas
            int vidas = 11;//Contador de vidas

            while(true) {//Ciclo repetitivo hasta formar la palabra.
                System.out.println("Escoja una letra");//Se le dice al usario que escriba una letra
                String letraEligidaPorelUsuario = JOptionPane.showInputDialog("Escriba una letra");//Se le pide al usuario que inserte una letra
                        if (LigaTica==null)//Es para bloquear la opcion de cancelar
                        JOptionPane.showMessageDialog(null, "La eleccion de categorias se ha cancelado");//Es cuando se le da aceptar junto con algun valor
                        else{
                        String[] letras = palabraqueescoge.split("");//Es la palabra que escoje el random
                int contador = 0;//Esta variable almacenara los datos del contador
                boolean acertoAlguna = false;//Metodo para averiguar si la palabra esta correcta
                for (String letra : letras) { //Recorremos cada letra de la palabra para comprobar si hay una igualdad
                    if(letraEligidaPorelUsuario.equals(letra)) {//Compara si son iguales
                        palabra[contador] = letraEligidaPorelUsuario;//La letra elijida por el usario igual al contador
                        acertoAlguna = true;//Es una instruccion si la letra es verdadera.
                    }//Cierra la instruccion.
                    contador++;//Contador con el valor ++ que significa uno mas a los intentos.
                }//Cierra la instruccion.
                if(acertoAlguna) {//Ciclo (if) si acerto una letra.
                    System.out.println("Has acertado una palabra");//Se le dice al usario has acertado una palabra
                    System.out.println("Te quedan "+vidas+" vidas");//Indica las vidas que te quedan
                }//Cierre de instruccion.
                else{//Ciclo (else) por si acaso el ciclo (if) no se cumple.
                    vidas --;//Descuenta las vidas
                    System.out.println("No has acertado aun");//Se le dice al usario que aun no ha acetado 
                    if(vidas == 0) {//Ciclo (if) por si las oportunidades llegan a cero.
                        System.out.println("Has Perdido (");//Indica que Ha Perdico el juego
                        break;//cierre el juego.
                    }//cierre de instruccion.
                    else{//ciclo (else) por si el cilco (if es perdida) no se cumple
                        System.out.println("Te quedan "+vidas+" vidas");//Indica las vidas que te quedan
                    }//cierre de instruccion 
                }//cierre de instruccion 
                System.out.println("Continue : ");//Se le dice al usario que continue aunque acierte la letra o no
                imprimirPalabra(palabra);//Imprime las palabras.
                contador = 0;
                acertoAlguna = false;
                if (gano(palabra)){
                    System.out.println("Has Ganado");//Indica que Ha Ganado el juego
                    break;
                    }
                        }
                }
                break;
                case 2://En el caso 2 llama a Animales
                String[] Animales = {"Perro","Gato","Lora","Conejo","Tucan","Leon","Tigre","Hormiga","Elefante","Serpiente","Mono","Jirafa"};//Estas son las palabras que seran utilizadas
                int numeroRandom2 = 1 + new Random().nextInt(Animales.length);//La computadora elije un numero random, que sera el numero de la palabra que eligiremos de la lista de palabras
            String palabraqueescoge1 = Animales[numeroRandom2];//Se guarda la palabra que se utilizo en una variable
            System.out.println("Esta palabra tiene "+palabraqueescoge1.length()+" letras");//Este System se encaragara de escoger la palabra
            String[] palabra2 = new String[palabraqueescoge1.length()];//Si se llena los espacios es que a logrado completar el juego
            imprimirPalabra(palabra2);//Se muestra las rayitas
            int vida = 11;//Contador de vidas

            while(true) {
                System.out.println("Escoja una letra");//Se le dice al usario que escriba una letra
                String letraEligidaPorelUsuario = JOptionPane.showInputDialog("Escriba una letra");//Se le pide al usuario que inserte una letra
                if (Animales==null)//Es para bloquear la opcion de cancelar
                JOptionPane.showMessageDialog(null, "La eleccion de categorias fue cancelada");//Es cuando se le da aceptar junto con algun valor
                else{
                String[] letras = palabraqueescoge1.split("");//Es la palabra que escoje el random
                int contador = 0;//Esta variable almacenara los datos del contador
                boolean acertoAlguna = false;//Metodo para averiguar si la palabra esta correcta
                for (String letra : letras) {//Recorremos cada letra de la palabra para comprobar si hay una igualdad
                    if(letraEligidaPorelUsuario.equals(letra)) {//Compara si son igualesn
                        palabra2[contador] = letraEligidaPorelUsuario;//La letra elijida por el usario igual al contador
                        acertoAlguna = true;//Es una instruccion si la letra es verdadera.
                    }//cierre de instruccion.
                    contador++;//Contador con el valor ++ que significa uno mas a los intentos.
                }//cierre de instruccion.
                if(acertoAlguna) {//Ciclo (if) si acerto una letra.
                    System.out.println("Has acertado una palabra");//Se le dice al usario has acertado una palabra
                    System.out.println("Te quedan "+vida+" vidas");//Indica las vidas que te quedan
                }//cierre de instruccion.
                else{//Ciclo (else) por si acaso el ciclo (if) no se cumple.
                    vida --;//Descuenta las vidas
                    System.out.println("No has acertado aun");//Se le dice al usario que aun no ha acetado 
                    if(vida == 0) {//Ciclo (if) por si las oportunidades llegan a cero.
                        System.out.println("Has Perdido(");//Indica que Ha Perdico el juego
                        break;//cierre el juego.
                    }
                    else{
                        System.out.println("Te quedan "+vida+" vidas");//Indica las vidas que te quedan
                    }
                }
                System.out.println("Continue : ");//Se le dice al usario que continue aunque acierte la letra o no
                imprimirPalabra(palabra2);//Imprime las palabras
                contador = 0;
                acertoAlguna = false;
                if (gano(palabra2)){
                    System.out.println("Has Ganado");//Indica que Ha Ganado el juego
                    break;
                    }//cierre de instruccion
                }//cierre de instruccion
            }//cierre de instruccion
                    break;//cierre de ciclo.
            }//cierre de instruccion
        }//cierre de instruccion
         while(op!=3);
}
    public void imprimirPalabra(String[] palabra) {//metodo para imprimir las palabras
        //Este metodo imprime las letras que ha acertado el usuario en el momento que se escribe 
        for (String letra : palabra) {
            if(letra != null) {//letra igualada a null por motivo de ya no hay letras
                System.out.print(letra);
            }else{//instruccion del (else)
                System.out.print("-");
            }//cierre de instruccion
        }//cierre de instruccion
        System.out.println("");//espacio de consola
    }//cierre de instruccion
    public boolean gano(String[] palabra) {//metodo para imprimir la palabra
        boolean gano = true;//instruccion para averigaur si las letras del usuario son las de la palabra
        for (String letra : palabra) {//revisa letra por letra.
            if(letra == null) {//por sino encuentra la letra o ya no es necesario encontrarla
                gano = false;//Instruccion de gano igualda a falso o perdio.
                break;//termina el juego
            }//cierre de instruccion   
        }//cierre de instruccion 
        return gano;//metodo de retorno si se cumple el if de perdio. 
    }//cierre de instruccion  
} //cierre de instruccion
        
    
    

