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
public class Conecta4conmaquina
{
    public static void main (String[] args) {

        //Inicializar el buffer
        BufferedReader recibir= new BufferedReader(new InputStreamReader(System.in));

        //Declarar la matriz
        String juego[][];

        //Definir el tamaño de la matriz 
        juego= new String [6][7];

        //Inicializar variables
        int tiros=0,fila,columna;

        //Llenar la matriz con ? (denota que estan vacías) 
        for(int FilaM=0;FilaM<=5;FilaM=FilaM+1){
            for (int ColumnaM=0; ColumnaM<=6; ColumnaM=ColumnaM+1){
                juego [FilaM][ColumnaM]="?";
            }
        }

        //Preguntar nombre del jugador
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del jugador?");
        String nombre= sc.next();

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
            posicionC=posicionC-1;
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
            int ganar3=0;
            
            //Cabe destacar que, i=fila y j= columnas
            for (int i=0; i<juego.length-3; i++){
                for (int j=0; j<juego[0].length-3; j++){
                    if(juego[i][j].equals("X")&& juego[i+1][j+1].equals("X")&&juego[i+2][j+2].equals("X")&&juego[i+3][j+3].equals("X")){
                        System.out.println("Ganó el jugador  " +nombre);
                        System.exit(0);
                    }else{
                        ganar3=0; 
                    }

                }
            }

            for (int filas=5; filas>=3; filas--){
                for (int columnas=0; columnas<=3; columnas++){
                    if(juego[filas][columnas].equals("X")&& juego[filas-1][columnas+1].equals("X")&&juego[filas-2][columnas+2].equals("X")&&juego[filas-3][columnas+3].equals("X")){
                        System.out.println("Ganó el jugador  " +nombre);
                        System.exit(0);

                    }
                }
            }
            //Avizar que es el turno de la maquina virtual
            System.out.println("Es el turno de la maquina");

            //Determinar la fila como la ultima. 
            posicionF= 5;

            //Elegir Columna Aleatoriamente
            posicionC=(int)(Math.random()*6)+0;
            int columnademaquina=posicionC+1;
            System.out.println("Columna elegida: " +columnademaquina);

            //Verificamos si no hay una letra ya ocupando en el espacio elegido, si es así le restamos a la fila.
            while(juego[posicionF][posicionC]=="O"||juego[posicionF][posicionC]=="X")
            {
                posicionF=posicionF-1;
                if(posicionF<0){
                    System.out.println("La columna esta llena, por favor ingresa otra columna");
                    posicionC=(int)(Math.random()*6)+0;
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
                            System.out.println("Ganó la maquina");
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
                            System.out.println("Ganó la maquina");
                            System.exit(0);
                        }
                    }else{
                        ganar2S=0; 
                    }
                }
            }

            //Revisar columnas
            for (int Fila=5; Fila>=3; Fila--){
                for (int Columna=0; Columna<=3; Columna++){
                    if(juego[Fila][Columna].equals("X")&& juego[Fila-1][Columna+1].equals("X")&&juego[Fila-2][Columna+2].equals("X")&&juego[Fila-3][Columna+3].equals("X")){
                        System.out.println("Ganó la maquina");
                        System.exit(0);

                    }
                }
            }
            for (int Fila=0; Fila<juego.length-3; Fila++){
                for (int Columna=0; Columna<juego[0].length-3; Columna++){
                    if(juego[Fila][Columna].equals("O")&& juego[Fila+1][Columna+1].equals("O")&&juego[Fila+2][Columna+2].equals("O")&&juego[Fila+3][Columna+3].equals("O")){
                        System.out.println("Ganó la maquina");
                        System.exit(0);
                    }
                }

            }

        }
        System.out.println("EMPATEE");
    }
}

