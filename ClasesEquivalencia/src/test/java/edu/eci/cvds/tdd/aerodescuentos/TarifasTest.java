package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.*;
import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;

public class TarifasTest {

    private CalculadorDescuentos calcularDescuentos = new CalculadorDescuentos();
    private double result;

    @Test
    public void edadNegativa() {
        
        result = calcularDescuentos.calculoTarifa(10,5,-1);
        //System.out.println(result);
        Assert.assertEquals(0,(long)result); //Deberia arrojar excepcion
    }
    
    @Test
    public void edadDeRecienNacido() {
        
        result = calcularDescuentos.calculoTarifa(22,18,0);
        DecimalFormat df = new DecimalFormat("#.00");
        String respuesta = df.format(result);
        

        Assert.assertEquals("20,90",respuesta);       

    }
    
    @Test
    public void edadPositivaConDiasDeAntelacion() {
        
        result = calcularDescuentos.calculoTarifa(80,22,1);
        DecimalFormat df = new DecimalFormat("#.00");
        String respuesta = df.format(result);
        

        Assert.assertEquals("64,00",respuesta);
    }
    
    @Test
    public void tarifaBaseNegativa() {
        
        result = calcularDescuentos.calculoTarifa(-1,12,19);

        Assert.assertEquals(0,(long)result); //Deberia arrojar excepcion
    }
    
    @Test
    public void tarifaBase0() {
        
        result = calcularDescuentos.calculoTarifa(0,10,2);

        Assert.assertEquals(0,(long)result);
    }
    
    @Test
    public void tarifaBasePositiva() {
        
        result = calcularDescuentos.calculoTarifa(1,9,25);

        Assert.assertEquals(1,(long)result);
    }
    
    @Test
    public void diasDeAntelacionNegativos() {
        
        result = calcularDescuentos.calculoTarifa(100,-1,23);

        Assert.assertEquals(100,(long)result); //Deberia arrojar excepcion 
    }
    
    @Test
    public void diasDeAntelacion0() {
        
        result = calcularDescuentos.calculoTarifa(90,0,19);

        Assert.assertEquals(90,(long)result);
    }

    @Test
    public void diasDeAntelacionPositivos() {
        
        result = calcularDescuentos.calculoTarifa(20,1,70);

        DecimalFormat df = new DecimalFormat("#.00");
        String respuesta = df.format(result);
        

        Assert.assertEquals("18,40",respuesta);
    }
    
    @Test
    public void edadNegativa_tarifaBaseNegativa_diasDeAntelacionNegativos() {
        
        result = calcularDescuentos.calculoTarifa(-1,-1,-1);

        Assert.assertEquals(0,(long)result);
    }
    
    @Test
    public void edadNegativa_tarifaBaseNegativa() {
        
        result = calcularDescuentos.calculoTarifa(-1,0,-1);

        Assert.assertEquals(0,(long)result);
    }
    
    @Test
    public void edadNegativa_tarifaBase0() {
        
        result = calcularDescuentos.calculoTarifa(0,0,-1);

        Assert.assertEquals(0,(long)result);
    }
    
    @Test
    public void edadNegativa_diasDeAntelacionInvalidos() {
        
        result = calcularDescuentos.calculoTarifa(0,-1,-1);

        Assert.assertEquals(0,(long)result);
    }
    
    @Test
    public void tarifaBaseNegativa_DiasDeAntelacionNegativos_EdadRecienNacido() {
        
        result = calcularDescuentos.calculoTarifa(-1,-1,0);

        Assert.assertEquals(0,(long)result);
    }
    // TODO Complete with more test cases
}