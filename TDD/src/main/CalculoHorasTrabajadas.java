package main;

public class CalculoHorasTrabajadas {

    /**
     * Método para realizar el cálculo de horas a pagar. Para la primera prueba sólo se desea verificar que la prueba
     * aprueba o falla, comprobando así que la prueba es correcta.
     * @param turno El turno del empleado bajo el cual se hace el cálculo.
     * @param horas Número de otras trabajadas en la semana laboral.
     * @return Número cualquiera. Sólo se usará para verificar el funcionamiento de la prueba.
     */
    public float calcularHorasAPagar(String turno, float horas) {
        return (float) 50.0;
    }

    /**
     * Recibe el número de horas trabajadas durante la semana laboral en el turno diurno y calcula el número total de horas
     * a pagar, mutiplicando por 2 las horas dobles trabajadas y por 3 las horas triples trabajadas. Así queda una suma
     * del total de horas.
     * @param horasTrabajadas Número de horas trabajadas en el turno.
     * @return La suma del total de horas a pagar.
     */
    public float calcularHorasAPagarTurnoDiurno(float horasTrabajadas) {
        float horasActualesTrabajadas = horasTrabajadas;
        float horasAPagar = 0;

        //Cantidade horas obligatorias a cumplir en el turno
        final float HORAS_NORMALES_OBLIGATORIAS = 48;
        
        //Cantidad de horas máxima que se pueden laborar al cubrir el máximo de horas dobles
        final float MAXIMO_HORAS_DOBLES = 57;


        if ( (horasActualesTrabajadas >= 0) && (horasActualesTrabajadas <= HORAS_NORMALES_OBLIGATORIAS) ) {
            horasAPagar = horasActualesTrabajadas;
        }
        else if( (horasActualesTrabajadas > HORAS_NORMALES_OBLIGATORIAS) && (horasActualesTrabajadas <= MAXIMO_HORAS_DOBLES) ) {
            float horasDoblesTrabajadas = horasActualesTrabajadas - HORAS_NORMALES_OBLIGATORIAS;

            horasAPagar = HORAS_NORMALES_OBLIGATORIAS + (2 * horasDoblesTrabajadas);
        }
        else if ( horasActualesTrabajadas > MAXIMO_HORAS_DOBLES) {
            float horasTriplesTrabajadas = horasActualesTrabajadas - MAXIMO_HORAS_DOBLES;
            float horasDoblesTrabajadas = MAXIMO_HORAS_DOBLES - HORAS_NORMALES_OBLIGATORIAS;

            horasAPagar = HORAS_NORMALES_OBLIGATORIAS + (2 * horasDoblesTrabajadas) + (3 * horasTriplesTrabajadas);
        }

        return horasAPagar;
    }

    public float calcularHorasAPagarTurnoNocturno(float horas) {
        float horasAPagar = 100;

        return horasAPagar;
    }

    public float calcularHorasAPagarTurnoMixto(float horas) {
        float horasAPagar = 100;

        return horasAPagar;
    }

}
