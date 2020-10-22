import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Se encarga de inicializar la matriz, nombrar al jugador y reyenar la matriz con "O".
 * 
 * @author Hannsell Solís Ramírez
 * @version 04/10/2020
 */
public class Conecta4con2
{
    /**
     * Método main
     *
     * @param args Un parámetro
     */
    public static void main (String[] args) {

        //Inicializar el buffer
        BufferedReader recibir= new BufferedReader(new InputStreamReader(System.in));

        //Declarar la matriz
        String juego[][];

        //Definir el tamaño de la matriz 
        juego= new String [6][7];

        //Inicializar tiros
        int tiros=0;

        //Llenar la matriz con ? (denota que estan vacías) 
        for(int filaM=0;filaM<=5;filaM=filaM+1){
            for (int columnaM=0; columnaM<=6; columnaM=columnaM+1){
                juego [filaM][columnaM]="?";
            }
        }

        //Preguntar nombre del jugador 1 
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del jugador 1?");
        String nombre= sc.next();

        //Preguntar nombre del jugador 2. 
        System.out.println("¿Cuál es el nombre del jugador 2?");
        String nombre2= sc.next();

        //TABLERO
        System.out.println("    1   2   3   4   5   6   7");
        System.out.println("0   " + juego[0][0]+" | "+ juego [0][1]+" | "+ juego [0][2]+" | "+ juego [0][3]+" | "+ juego [0][4]+" | "+ juego [0][5]+" | " + juego [0][6]);
        System.out.println("    _________________________");
        System.out.println("1   " + juego[1][0]+" | "+ juego [1][1]+" | "+ juego [1][2]+" | "+ juego [1][3]+" | "+ juego [1][4]+" | "+ juego [1][5]+" | " + juego [1][6]);
        System.out.println("    _________________________");
        System.out.println("2   " + juego[2][0]+" | "+ juego [2][1]+" | "+ juego [2][2]+" | "+ juego [2][3]+" | "+ juego [2][4]+" | "+ juego [2][5]+" | " + juego [2][6]);
        System.out.println("    _________________________");
        System.out.println("3   " + juego[3][0]+" | "+ juego [3][1]+" | "+ juego [3][2]+" | "+ juego [3][3]+" | "+ juego [3][4]+" | "+ juego [3][5]+" | " + juego [3][6]);
        System.out.println("    _________________________");
        System.out.println("4   " + juego[4][0]+" | "+ juego [4][1]+" | "+ juego [4][2]+" | "+ juego [4][3]+" | "+ juego [4][4]+" | "+ juego [4][5]+" | " + juego [4][6]);
        System.out.println("    _________________________");
        System.out.println("5   " + juego[5][0]+" | "+ juego [5][1]+" | "+ juego [5][2]+" | "+ juego [5][3]+" | "+ juego [5][4]+" | "+ juego [5][5]+" | " + juego [5][6]);
        System.out.println("    _________________________");

        //Para evitar más tiros de lo debido y declarar empate, si fuera el caso. 7*6=42 Entonces si sobrepasa los 42 tiros, significa empate.
        while(tiros<42){

            System.out.println("Le toca tirar a: " +nombre);
            System.out.println("Columna en la que deseas poner tu ficha");
            int posicionC=sc.nextInt();
            posicionC= posicionC-1;

            //Determinar fila como 5, para que se coloque hasta el fondo.
            int posicionF=5;

            //Verificamos si no hay una letra ya ocupando en el espacio elegido, si es así le restamos a la fila.
            while(juego[posicionF][posicionC]=="X"||juego[posicionF][posicionC]=="O"){
                posicionF=posicionF-1;
                if(posicionF<0){
                    System.out.println("La columna esta llena, por favor ingresa otra columna");
                    posicionC=sc.nextInt();
                    posicionC=posicionC-1;
                    posicionF=5;
                }
            }

            //Se coloca la X
            juego[posicionF][posicionC]="X";

            //Sumar un tiro, pues ya lanzó el jugador1.

            tiros=tiros+1;

            //TABLERO
            System.out.println("    1   2   3   4   5   6   7");
            System.out.println("0   " + juego[0][0]+" | "+ juego [0][1]+" | "+ juego [0][2]+" | "+ juego [0][3]+" | "+ juego [0][4]+" | "+ juego [0][5]+" | " + juego [0][6]);
            System.out.println("    _________________________");
            System.out.println("1   " + juego[1][0]+" | "+ juego [1][1]+" | "+ juego [1][2]+" | "+ juego [1][3]+" | "+ juego [1][4]+" | "+ juego [1][5]+" | " + juego [1][6]);
            System.out.println("    _________________________");
            System.out.println("2   " + juego[2][0]+" | "+ juego [2][1]+" | "+ juego [2][2]+" | "+ juego [2][3]+" | "+ juego [2][4]+" | "+ juego [2][5]+" | " + juego [2][6]);
            System.out.println("    _________________________");
            System.out.println("3   " + juego[3][0]+" | "+ juego [3][1]+" | "+ juego [3][2]+" | "+ juego [3][3]+" | "+ juego [3][4]+" | "+ juego [3][5]+" | " + juego [3][6]);
            System.out.println("    _________________________");
            System.out.println("4   " + juego[4][0]+" | "+ juego [4][1]+" | "+ juego [4][2]+" | "+ juego [4][3]+" | "+ juego [4][4]+" | "+ juego [4][5]+" | " + juego [4][6]);
            System.out.println("    _________________________");
            System.out.println("5   " + juego[5][0]+" | "+ juego [5][1]+" | "+ juego [5][2]+" | "+ juego [5][3]+" | "+ juego [5][4]+" | "+ juego [5][5]+" | " + juego [5][6]);
            System.out.println("    _________________________");

            //REVISAR FILAS
            int ganar1=0;
            for (int fila1=0; fila1<6; fila1++){
                for (int columna2=0; columna2<7;columna2++){
                    if(juego[fila1][columna2].equals("X")){
                        ganar1=(ganar1+1);
                        if(ganar1==4){
                            System.out.println("Ganó el jugador  " +nombre);
                            System.exit(0);
                        }
                    }else{
                        ganar1=0; 
                    }
                }
            }

            //Revisar columnas 
            int ganar2=0;
            for (int fila1=0; fila1<7; fila1++){
                for (int columna2=0; columna2<6;columna2++){
                    if(juego[columna2][fila1].equals("X")){
                        ganar2=(ganar2+1);
                        if(ganar2==4){
                            System.out.println("Ganó el jugador  " +nombre);
                            System.exit(0);
                        }
                    }else{
                        ganar2=0; 
                    }
                }
            }

            //Revisar diagonales

            for (int fila=0; fila<juego.length-3; fila++){
                for (int columna=0; columna<juego[0].length-3; columna++){
                    if(juego[fila][columna].equals("X")&& juego[fila+1][columna+1].equals("X")&&juego[fila+2][columna+2].equals("X")&&juego[fila+3][columna+3].equals("X")){
                        System.out.println("Ganó el jugador  " +nombre);
                        System.exit(0);

                    }
                }
            }

            for (int fila=5; fila>=3; fila--){
                for (int columna=0; columna<=3; columna++){
                    if(juego[fila][columna].equals("X")&& juego[fila-1][columna+1].equals("X")&&juego[fila-2][columna+2].equals("X")&&juego[fila-3][columna+3].equals("X")){
                        System.out.println("Ganó el jugador  " +nombre);
                        System.exit(0);

                    }
                }
            }

            //Avizar que es el turno del jugador 2
            System.out.println("Es el turno de: " +nombre2);

            //Preguntar columna al jugador 2
            System.out.println("Columna en la que deseas poner tu ficha");
            posicionC=sc.nextInt();
            posicionC=posicionC-1;
            //Determinar fila como 5, para que se coloque hasta el fondo.
            posicionF=5;

            //Verificamos si no hay una letra ya ocupando en el espacio elegido, si es así le restamos a la fila.
            while(juego[posicionF][posicionC]=="X"||juego[posicionF][posicionC]=="O"){
                posicionF=posicionF-1;
                if(posicionF<0){
                    System.out.println("La columna esta llena, por favor ingresa otra columna");
                    posicionC=sc.nextInt();
                    posicionC=posicionC-1;
                    posicionF=5;
                }
            }

            //Se coloca la O
            juego[posicionF][posicionC]="O";

            //Sumar un tiro, pues ya lanzó el jugador1.
            tiros=tiros+1;

            //TABLERO
            System.out.println("    1   2   3   4   5   6   7");
            System.out.println("0   " + juego[0][0]+" | "+ juego [0][1]+" | "+ juego [0][2]+" | "+ juego [0][3]+" | "+ juego [0][4]+" | "+ juego [0][5]+" | " + juego [0][6]);
            System.out.println("    _________________________");
            System.out.println("1   " + juego[1][0]+" | "+ juego [1][1]+" | "+ juego [1][2]+" | "+ juego [1][3]+" | "+ juego [1][4]+" | "+ juego [1][5]+" | " + juego [1][6]);
            System.out.println("    _________________________");
            System.out.println("2   " + juego[2][0]+" | "+ juego [2][1]+" | "+ juego [2][2]+" | "+ juego [2][3]+" | "+ juego [2][4]+" | "+ juego [2][5]+" | " + juego [2][6]);
            System.out.println("    _________________________");
            System.out.println("3   " + juego[3][0]+" | "+ juego [3][1]+" | "+ juego [3][2]+" | "+ juego [3][3]+" | "+ juego [3][4]+" | "+ juego [3][5]+" | " + juego [3][6]);
            System.out.println("    _________________________");
            System.out.println("4   " + juego[4][0]+" | "+ juego [4][1]+" | "+ juego [4][2]+" | "+ juego [4][3]+" | "+ juego [4][4]+" | "+ juego [4][5]+" | " + juego [4][6]);
            System.out.println("    _________________________");
            System.out.println("5   " + juego[5][0]+" | "+ juego [5][1]+" | "+ juego [5][2]+" | "+ juego [5][3]+" | "+ juego [5][4]+" | "+ juego [5][5]+" | " + juego [5][6]);
            System.out.println("    _________________________");

            //Saber gane
            //REVISAR FILAS
            int ganar1S=0;
            for (int fila1=0; fila1<6; fila1++){
                for (int columna2=0; columna2<7;columna2++){
                    if(juego[fila1][columna2].equals("O")){
                        ganar1S=(ganar1S+1);
                        if(ganar1S==4){
                            System.out.println("Ganó el jugador  " +nombre2);
                            System.exit(0);
                        }
                    }else{
                        ganar1S=0; 
                    }
                }
            }

            //Revisar columnas 
            int ganar2S=0;
            for (int fila1=0; fila1<7; fila1++){
                for (int columna2=0; columna2<6;columna2++){
                    if(juego[columna2][fila1].equals("O")){
                        ganar2S=(ganar2S+1);
                        if(ganar2S==4){
                            System.out.println("Ganó el jugador  " +nombre2);
                            System.exit(0);
                        }
                    }else{
                        ganar2S=0; 
                    }
                }
            }

            //Revisar diagonales

            for (int fila=0; fila<juego.length-3; fila++){
                for (int columna=0; columna<juego[0].length-3; columna++){
                    if(juego[fila][columna].equals("O")&& juego[fila+1][columna+1].equals("O")&&juego[fila+2][columna+2].equals("O")&&juego[fila+3][columna+3].equals("O")){
                        System.out.println("Ganó el jugador  " +nombre2);
                        System.exit(0);
                    }
                }

            }

            for (int fila=5; fila>=3; fila--){
                for (int columna=0; columna<=3; columna++){
                    if(juego[fila][columna].equals("O")&& juego[fila-1][columna+1].equals("O")&&juego[fila-2][columna+2].equals("O")&&juego[fila-3][columna+3].equals("O")){
                        System.out.println("Ganó el jugador  " +nombre2);
                        System.exit(0);

                   }
                }
            }

        }
        //Si se cumplen 42 tiros, y niguno ha ganado, significa que el tablero está lleno y hay un empate. 
        System.out.println("EMPATEE, fin del juego");
    }
}

