package org.mp.sesion05;

// CONSTRUCCION: con (a) ninguna inicializacion o (b) un entero
//     que especifica el estado inicial del generador
//
// ******************OPERACIONES PUBLICAS*********************
//     Devuelve un numero aleatorio según una distribucion:
// int randomInt( )                     --> Uniforme, 1 a 2^31-1
// double randomReal( )                 --> Uniforme, 0..1
// int randomInt( int linf, int lsup )  --> Uniforme linf..lsup
// Un metodo estatico relacionado:
// void permuta( Object [ ] a )         --> Permutacion aleatoria

/**
 * Clase de numeros aleatorios, usando un
 * generador lineal de congruencias 31-bit.
 * Observese que java.util contiene una clase Random,
 * por lo que se deben vigilar los conflictos de nombre.
 */
public class NumerosAleatorios
{
    
    /** The Constant A. */
    private static final int A = 48271;
    
    /** The Constant M. */
    private static final int M = 2147483647;
    
    /** The Constant Q. */
    private static final int Q = M / A;
    
    /** The Constant R. */
    private static final int R = M % A;

    /** The estado. */
    private int estado;

    /**
     * Construccion de un objeto Random cuyo
     * estado inicial se obtiene del reloj del sistema.
     */
    public NumerosAleatorios( )
    {
        this( (int) ( System.currentTimeMillis( ) % Integer.MAX_VALUE ) );
    }

    /**
     * Construcción de un objeto Random
     * especificando un estado inicial.
     * @param valorInicial el estado inicial.
     */
    public NumerosAleatorios( int valorInicial )
    {
        if( valorInicial < 0 )
            valorInicial += M;

        estado = valorInicial;
        if( estado == 0 )
            estado = 1;
    }

    /**
     * Devuelve un entero pseudoaleatorio, y cambia
     * el estado.
     * @return un entero pseudoaleatorio.
     */
    public int randomInt( )
    {
        int estadoTmp = A * ( estado % Q ) - R * ( estado / Q );
        if( estadoTmp >= 0 )
            estado = estadoTmp;
        else
            estado = estadoTmp + M;

        return estado;
    }

    /**
     * Devuelve un valor de tipo double en (0,1), y
     * cambia el estado interno.
     * @return el double pseudoaleatorio.
     */
    public double randomReal( )
    {
        return randomInt( ) / ( double ) M;
    }

    /**
     * Devuelve un entero en el rango [linf,lsup], y
     * cambia el estado interno.
     * @param linf el valor minimo.
     * @param lsup el valor maximo.
     * @return el entero pseudoaleatorio.
     */
    public int randomInt( int linf, int lsup )
    {
        double tamanyoParticion = (double) M / ( lsup - linf + 1 );

        return (int) ( randomInt( ) / tamanyoParticion ) + linf;
    }


    /**
     * Reordena un vector de forma aletoria.
     * Los numeros aleatorios empleados dependen de la hora y el dia.
     *
     * @param a the a
     */
    public static final void permuta( Object [ ] a )
    {
        NumerosAleatorios r = new NumerosAleatorios( );

        for( int j = 1; j < a.length; j++ )
            swapReferencias( a, j, r.randomInt( 0, j ) );
    }

    /**
     * Swap referencias.
     *
     * @param a the a
     * @param index1 the index 1
     * @param index2 the index 2
     */
    public static void swapReferencias( Object [ ] a, int index1, int index2 )
    {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

}
