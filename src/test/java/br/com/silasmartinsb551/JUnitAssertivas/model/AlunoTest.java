 package br.com.silasmartinsb551.JUnitAssertivas.model;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;



public class AlunoTest {
	
	@Test
public void assertTest() {
	String nome1 = "casa";
	String nome2 = "casa";
	Aluno a1 =new Aluno ("maria", "maria@email.com");
	Aluno a2 =new Aluno ("maria", "maria@email.com");
	Aluno a3 =a1;
	Aluno a4 =null;
	
	Assert.assertTrue(4>3);
	Assert.assertTrue("tinha que dar TRUE!",4>3);
	Assert.assertTrue(4 >3);
	
	Assert.assertEquals(1,1);
	Assert.assertEquals(nome1, nome2);
	
	Assert.assertEquals(3.14, 3.14, 0.01);
	Assert.assertEquals(Math.PI, 3.140, 0.01);

	Assert.assertEquals(a1,a3);
	Assert.assertEquals(a1,a4);
	Assert.assertNotSame(a1, a3);
	Assert.assertNotEquals(a1, a2);
	Assert.assertNull(a4);
	Assert.assertNotNull(a1);
	
	Assert.assertThat(nome1, CoreMatchers.is("casa"));
	Assert.assertThat(a1,CoreMatchers.is(a3));
	
	}

	

}
