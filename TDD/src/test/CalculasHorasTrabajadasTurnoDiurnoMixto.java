package test;

import main.CalculoHorasTrabajadas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculasHorasTrabajadasTurnoDiurnoMixto {

    @Test
    public void TurnoDiurnoCeroHorasTrabajadasDebeDevolverCeroHorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 0;

        //Primer argumento - horas esperadas, segundo argumento - horas actuales trabajadas calculadas
        //Se esperan 0 horas a pagar y se trabajaron 0 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno1HoraTrabajadaDebeDevolver1HoraAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 1;

        //Se esperan 1 hora a pagar y se trabajo 1 hora
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno44HorasTrabajadasDebeDevolver44HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 44;

        //Se esperan 44 horas a pagar y se trabajaron 44 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno45HorasTrabajadasDebeDevolver45HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 45;

        //Se esperan 45 horas a pagar y se trabajaron 45 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno46HorasTrabajadasDebeDevolver47HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 47; //47 horas a pagar
        float horasTrabajadasActuales = 46; //1 hora doble

        //Se esperan 47 horas a pagar y se trabajaron 45 horas normales y 1 hora doble
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno53HorasTrabajadasDebeDevolver61HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 61; //61 horas a pagar
        float horasTrabajadasActuales = 53; //8 horas dobles

        //Se esperan 61 horas a pagar y se trabajaron 45 horas normales y 8 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno54HorasTrabajadasDebeDevolver63HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 63; //63 horas a pagar
        float horasTrabajadasActuales = 54; //9 horas dobles

        //Se esperan 63 horas a pagar y se trabajaron 45 horas normales y 9 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno55HorasTrabajadasDebeDevolver66HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 66; //66 horas a pagar
        float horasTrabajadasActuales = 55; //9 horas dobles, 1 hora triple

        //Se esperan 66 horas a pagar y se trabajaron 45 horas normales, 9 horas dobles y 1 hora triple
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno58HorasTrabajadasDebeDevolver75HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 75; //72 horas a pagar
        float horasTrabajadasActuales = 58; //9 horas dobles, 3 horas triples

        //Se esperan 72 horas a pagar y se trabajaron 45 horas normales, 9 horas dobles y 3 horas triples
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoMixto(horasTrabajadasActuales));
    }

}
