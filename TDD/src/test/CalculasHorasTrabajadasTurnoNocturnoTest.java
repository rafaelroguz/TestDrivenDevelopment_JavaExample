package test;

import main.CalculoHorasTrabajadas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculasHorasTrabajadasTurnoNocturnoTest {

    @Test
    public void TurnoDiurnoCeroHorasTrabajadasDebeDevolverCeroHorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 0;

        //Primer argumento - horas esperadas, segundo argumento - horas actuales trabajadas calculadas
        //Se esperan 0 horas a pagar y se trabajaron 0 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno1HoraTrabajadaDebeDevolver1HoraAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 1;

        //Se esperan 1 hora a pagar y se trabajo 1 hora
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno41HorasTrabajadasDebeDevolver41HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 41;

        //Se esperan 41 horas a pagar y se trabajaron 41 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno42HorasTrabajadasDebeDevolver42HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadas = 42;

        //Se esperan 42 horas a pagar y se trabajaron 42 horas
        assertEquals(horasTrabajadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadas));
    }

    @Test
    public void TurnoDiurno43HorasTrabajadasDebeDevolver44HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 44; //44 horas a pagar
        float horasTrabajadasActuales = 43; //1 hora doble

        //Se esperan 44 horas a pagar y se trabajaron 42 horas normales y 1 hora doble
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno50HorasTrabajadasDebeDevolver58HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 58; //58 horas a pagar
        float horasTrabajadasActuales = 50; //8 horas dobles

        //Se esperan 58 horas a pagar y se trabajaron 42 horas normales y 8 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno51HorasTrabajadasDebeDevolver60HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 60; //60 horas a pagar
        float horasTrabajadasActuales = 51; //9 horas dobles

        //Se esperan 60 horas a pagar y se trabajaron 42 horas normales y 9 horas dobles
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno52HorasTrabajadasDebeDevolver63HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 63; //63 horas a pagar
        float horasTrabajadasActuales = 52; //9 horas dobles, 1 hora triple

        //Se esperan 69 horas a pagar y se trabajaron 42 horas normales, 9 horas dobles y 1 hora triple
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadasActuales));
    }

    @Test
    public void TurnoDiurno54HorasTrabajadasDebeDevolver69HorasAPagar() {
        CalculoHorasTrabajadas calculoDeHoras = new CalculoHorasTrabajadas();
        float horasTrabajadasEsperadas = 69; //69 horas a pagar
        float horasTrabajadasActuales = 54; //9 horas dobles, 3 horas triples

        //Se esperan 69 horas a pagar y se trabajaron 42 horas normales, 9 horas dobles y 3 horas triples
        assertEquals(horasTrabajadasEsperadas, calculoDeHoras.calcularHorasAPagarTurnoNocturno(horasTrabajadasActuales));
    }

}
