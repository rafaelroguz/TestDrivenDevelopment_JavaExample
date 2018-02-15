package test;

import main.CalculoHorasTrabajadas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculasHorasTrabajadasTurnoDiurnoTest {

    @Test
    public void TurnoDiurnoCeroHorasTrabajadasDebeDevolverCeroHorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 0;

        //Primer argumento - horas esperadas, segundo argumento - horas actuales trabajadas calculadas
        //Se esperan 0 horas a pagar y se trabajaron 0 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno1HoraTrabajadaDebeDevolver1HoraAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 1;

        //Se esperan 1 hora a pagar y se trabajo 1 hora
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno47HorasTrabajadasDebeDevolver47HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 47;

        //Se esperan 47 horas a pagar y se trabajaron 47 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno48HorasTrabajadasDebeDevolver48HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 48;

        //Se esperan 48 horas a pagar y se trabajaron 48 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno49HorasTrabajadasDebeDevolver50HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 50; //50 horas a pagar
        float horasTrabajadasActuales = 49; //1 hora doble

        //Se esperan 50 horas a pagar y se trabajaron 48 horas normales y 1 hora doble
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno56HorasTrabajadasDebeDevolver64HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 64; //64 horas a pagar
        float horasTrabajadasActuales = 56; //8 horas dobles

        //Se esperan 64 horas a pagar y se trabajaron 48 horas normales y 8 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno57HorasTrabajadasDebeDevolver66HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 66; //66 horas a pagar
        float horasTrabajadasActuales = 57; //9 horas dobles

        //Se esperan 66 horas a pagar y se trabajaron 48 horas normales y 9 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno58HorasTrabajadasDebeDevolver69HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 69; //69 horas a pagar
        float horasTrabajadasActuales = 58; //9 horas dobles, 1 hora triple

        //Se esperan 69 horas a pagar y se trabajaron 48 horas normales, 9 horas dobles y 1 hora triple
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno60HorasTrabajadasDebeDevolver75HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 75; //75 horas a pagar
        float horasTrabajadasActuales = 60; //9 horas dobles, 3 horas triples

        //Se esperan 75 horas a pagar y se trabajaron 48 horas normales, 9 horas dobles y 3 horas triples
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoDiurno(horasTrabajadasActuales));
    }

}
