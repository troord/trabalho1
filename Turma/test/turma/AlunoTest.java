/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedro.antonio.gomes
 */
public class AlunoTest {
    Aluno aluno;
    public AlunoTest() {
        aluno = new Aluno(12547, "Diogo");
    }

    /**
     * Test of getnMec method, of class Aluno.
     */
    @Test
    public void testGetnMec() {
        
    int expectednMec = 12547;
    assertEquals(expectednMec, aluno.getnMec());
    
    }

    
    
    @Test
    public void testGetNome() {
        
        String expectedNome = "Diogo";
        assertEquals(expectedNome, aluno.getNome());
        
    }

    /**
     * Test of getEstatuto method, of class Aluno.
     */
    @Test
    public void testGetEstatuto() {
        
        String expectedEstatuto = "Ordinário";
        assertEquals(expectedEstatuto, aluno.getEstatuto());
        
    }
    
}
