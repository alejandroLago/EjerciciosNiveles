
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;

/**
 *
 * @author Alejandro Lago Ejercicios de aula virtual.
 */
//Ejercicio del numero maximo
public class EjerciciosJava {

    public int[] maximo(int[] listaNumeros) {
        int numeroMaximo = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (numeroMaximo < listaNumeros[i]) {
                numeroMaximo = listaNumeros[i];
            }

        }
        return new int[]{numeroMaximo};
    }

    //Ejercicio de los numeros dos maximos,hecho pero mejorado con ayuda de la clase
    public int[] segundoMayor(int[] listaNumeros) {
        int numeroMaximo = 0;
        int segundoMaximo = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (numeroMaximo < listaNumeros[i]) {
                numeroMaximo = listaNumeros[i];
            } else if (segundoMaximo < listaNumeros[i]) {
                segundoMaximo = listaNumeros[i];
            }

        }

        return new int[]{segundoMaximo, numeroMaximo};
    }

    //Ejercicio de los palindromos,hecho con ayuda del video de jorge
    public boolean palindromo(String parametro) {

        String p1 = "";
        String p2 = "";
        for (int i = 0; i < parametro.length(); i++) {
            if (parametro.charAt(i) != ' ') {
                p1 = p1 + parametro.charAt(i);
            }

        }
        int longitudFrase = p1.length();
        for (int i = 0; i < longitudFrase; i++) {
            p2 = p2 + p1.charAt(longitudFrase - i - 1);

        }
        return p1.equals(p2);

    }

    //ejercicio isograma, hecho sin ayuda
    /*
    Utilizo un axiliar char para guardar la letra que voy a comparar y 
    ver si se repite
     */
    public boolean isograma(String palabra) {
        boolean esIsograma = true;
        char letra = ' ';
        for (int i = 0; i < palabra.length(); i++) {
            if (esIsograma) {
                letra = palabra.charAt(i);
                for (int x = i; x < palabra.length() - 1; x++) {
                    if (letra == palabra.charAt(x + 1)) {
                        esIsograma = false;
                    }
                }
            }
        }
        return esIsograma;

    }

    //ejercicio del calendario
    /*
    Lo primero que hago es que en caso de que me den un numero mayo que 7, dividirlo
    entre 7 y el resto quedarmelo como el numero "numMes".Imprimo las XX correspondientes
    por "numMes".Luego imprimo los 31 dias del mes, de 7 en 7 y por ultimo imprimo las XX 
    del final
     */
    public void imprimeMes(int numMes) {
        int x = 1;
        //la constante "y" es para contar las XX y numero de mes que pongo al principio
        //para leugo poner las XX del final
        int y = 0;
        if (numMes >= 7) {
            numMes = numMes % 7;
        }
        for (int i = 0; i < numMes; i++) {
            System.out.print(" XX");
            y++;
        }
        for (int i = numMes + 1; i < 38; i++) {
            if (x < 32) {
                if (i % 7 == 0) {
                    if (x <= 9) {
                        System.out.println(" 0" + x);
                        x++;
                        y++;
                    } else {
                        System.out.println(" " + x);
                        x++;
                        y++;
                    }
                } else {
                    if (x <= 9) {
                        System.out.print(" 0" + x);
                        x++;
                        y++;
                    } else {
                        System.out.print(" " + x);
                        x++;
                        y++;
                    }
                }
            }
        }
        for (int i = y + 1; i < 36; i++) {
            System.out.print(" XX");
        }
        System.out.println("");
    }

    //Ejercicio del anagrama
    /*
    Lo primero que hago es convertir todas las letras mayusculas en minusculas,
    para evitar errores en las comparaciones.Inicializo una variable booleana
    que determinara si la palabra es anagrama o no.Comparo cada letra de la 
    primera palabra con la segunda palabra,si no encuentra esa letra en la 
    segunda palabra retorna falso, en caso de que la haya comprara la siguiente
    letra de la palabra1.
     */
    public boolean anagrama(String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        boolean SiAnagrama = false;

        for (int i = 0; i < palabra1.length(); i++) {
            SiAnagrama = false;
            for (int x = 0; x < palabra2.length(); x++) {
                if (palabra1.charAt(i) == palabra2.charAt(x)) {
                    SiAnagrama = true;
                }
                //este if es la condicion para que retorne falso en caso de que no encuentre la palabra
                if (SiAnagrama == false && x == palabra2.length() - 1) {
                    return false;
                }
            }
        }
        return SiAnagrama;
    }

    //Ejercicio del Acronimo
    /*
    Comparo cada letra de la palabra con las letras en mayuscula del "String letras",
    cuando las localiza las meto en el "String reusltado"
     */
    public String acronimo(String palabra) {
        String letras = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < letras.length(); j++) {
                if (palabra.charAt(i) == letras.charAt(j)) {
                    resultado += palabra.charAt(i);
                }
            }
        }

        return resultado;

    }

    //Escalera de palabras
    /*
    Comparo las palabras de dos en dos, con un contador "diferencias"
    que me va a llevar el numero de diferencias que hay entre las dos palabras
    que comparo.Si no ha habido mas de 1 diferencia entre las dos palabras 
    comparadas, el contador se vuelve a inicializar a cero para la siguiente
    compàracion.
     */
    public boolean escaleraDePalabras(char[][] listaPalabras) {
        int diferencias = 0;

        for (int i = 0; i < listaPalabras.length - 1; i++) {

            if (diferencias > 1) {
                return false;
            }
            diferencias = 0;
            for (int j = 0; j < listaPalabras[i].length; j++) {

                if (listaPalabras[i][j] != listaPalabras[i + 1][j]) {
                    diferencias++;
                }
            }
        }
        return true;
    }

    //Ejercicio de ADN
    /*
    Comparo cado el primer string con el segundo, poniendo como condicion 
    todas las combinaciones de mutaciones
     */
    public int ejercicioAdn(String uno, String dos) {
        int resultado = 0;
        for (int i = 0; i < uno.length(); i++) {
            if (uno.charAt(i) == 'A' && (dos.charAt(i) == 'C' || dos.charAt(i) == 'G' || dos.charAt(i) == 'A')) {
                resultado += 1;
            }
            if (uno.charAt(i) == 'T' && (dos.charAt(i) == 'C' || dos.charAt(i) == 'G' || dos.charAt(i) == 'T')) {
                resultado += 1;
            }
            if (uno.charAt(i) == 'C' && (dos.charAt(i) == 'A' || dos.charAt(i) == 'T' || dos.charAt(i) == 'C')) {
                resultado += 1;
            }
            if (uno.charAt(i) == 'G' && (dos.charAt(i) == 'A' || dos.charAt(i) == 'T' || dos.charAt(i) == 'G')) {
                resultado += 1;
            }
            if (dos.charAt(i) == '-' && (uno.charAt(i) == 'A' || uno.charAt(i) == 'T' || uno.charAt(i) == 'C' || uno.charAt(i) == 'G')) {
                resultado += 2;
            }
            if (uno.charAt(i) == '-' && (dos.charAt(i) == 'A' || dos.charAt(i) == 'T' || dos.charAt(i) == 'C' || dos.charAt(i) == 'G')) {
                resultado += 2;
            }
        }
        return resultado;
    }
    
    
    //Ejercicio de mudanzas, con video del Lisensiado Jorge Cisneros(no esta terminado)
     public boolean cabeCaja(boolean[][]camion,int ancho,int alto){
        int k=0;
        int m=0;
        for(int i=0;i<camion.length;i++){
            for(int j=0;j<camion[0].length;j++){
                k=0;
                while((i+k)< camion.length && !camion[i+k][j]&& k<alto){
                    m=0;
                    while((j+m)<camion[0].length && !camion[i+k][j+m] && m<ancho){
                        m++;
                    }
                    if(m!= ancho){//significa que no hay hueco del ancho correcto
                        k = alto;
                    }
                    k++;
                }
                if(k == alto){// significa que ha encontrado el hueco correcto
                    System.out.println("La caja cabe en:"+i+" "+j);
                    return true;
                }
            }
        }
        return false;
     }
    
     
     //Ejercicio strStr
     //Aumento en un espacio la cadena1 para evitar un error cuando
     //se busca una palabra que no esta en dicha cadena.
     //Utilizo la variable "termina" para guardar la ultima letra de la
     //palabra que se busca en cadena1, y luego se le resta el tamaño 
     //de la palabra y se le suma 1 para dar la posicion exacta de donde empieza
     //la palabra en la caderna1.
     
     public int strStr(String cadena1,String cadena2){
         int termina=0;
         String palabra="";
         int x=0;
         cadena1+=" ";
         
         for(int i=0;i<cadena1.length();i++){
             if(palabra.equals(cadena2)){
                 
                 return termina-palabra.length()+1;
                 
             }if(cadena2.charAt(x)==cadena1.charAt(i)){
                 termina=i;
                 x++;
                 palabra+=cadena1.charAt(i);
                 
             }else{
                 
                 x=0;
                 palabra="";
             }
             
         }
         return -1;
     }
    
    
    
    
    
    

    //ejemplos String hechos en clase
    /*  public void ejemplosString() {
        String cadena1 = "Acaso hubo buhos aca";
        System.out.println(cadena1.charAt(7));
        System.out.println(cadena1.charAt(0));
        System.out.println(cadena1.charAt(cadena1.length() - 1));

        System.out.println(cadena1.substring(6, 9));
        System.out.println(cadena1.substring(11, 16));
        System.out.println(cadena1.substring(17));

        String[] arrayPalabras = cadena1.split(" ");

        System.out.println(arrayPalabras[2]);

        System.out.println(cadena1.indexOf("buho"));

    }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjerciciosJava ejercicio1 = new EjerciciosJava();
        int[] listaNumeros = {3, 3, 88, 2, 70, 0};
        boolean[][]camion={
	{true,	true,	true,	false,	false,	true,	true,	true},
	{true,	true,	true,	false,	false,	true,	true,	true},
	{true,	true,	true,	false,	false,	true,	true,	true},
	{true,	true,	true,	true,	true,	true,	false,	false },
	{true,	true,	true,	true,	true,	true,	false,	false }
								};
        //ejercicio1.ejemplosString();
        //Ejercicios de consola
        System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));
        System.err.println(Arrays.toString(ejercicio1.segundoMayor(listaNumeros)));
        System.out.println(ejercicio1.palindromo("acaso hubo buhos aca"));
        System.out.println(ejercicio1.isograma("buho"));
        ejercicio1.imprimeMes(0);
        System.out.println(ejercicio1.anagrama("amor", "mora"));
        System.out.println(ejercicio1.acronimo("Tecnología de la Información y de las Comunicaciones"));
        System.out.println(ejercicio1.escaleraDePalabras(new char[][]{{'P', 'A', 'T', 'A'},
        {'P', 'U', 'T', 'O'},
        {'R', 'A', 'T', 'O'},
        {'R', 'A', 'M', 'O'},
        {'G', 'A', 'M', 'O'},
        {'G', 'A', 'T', 'O'},
        {'P', 'A', 'T', 'O'}}));
        System.out.println(ejercicio1.ejercicioAdn("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
        System.out.println(ejercicio1.cabeCaja(camion, 0, 0));
        System.out.println(ejercicio1.strStr("Se juega aqui", "m"));
    }

}
