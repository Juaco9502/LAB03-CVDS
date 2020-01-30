package edu.eci.cvds.tdd.registry;

import edu.eci.cvds.tdd.registry.Gender;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Juan Camilo",1075292001,23,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateDeadPerson() {

    	Person person = new Person("Juan Camilo",1075292001,23,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);		
    }
    @Test
    public void validateUnderagePerson() {

    	Person person = new Person("Juan Camilo",1075292001,4,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);		
    }
    @Test
    public void validateInvalidAgePerson() {

    	Person person = new Person("Juan Camilo",1075292001,-2,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);		
    }
    @Test
    public void validateDuplicatePerson() {

    	Person person1 = new Person("Juan Camilo",1075292001,23,Gender.MALE,true);
	Person person2 = new Person("Juan Camilo",1075292001,23,Gender.MALE,true);

        RegisterResult result1 = registry.registerVoter(person1);
	RegisterResult result2 = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.DUPLICATED, result2);		
    }

    // TODO Complete with more test cases
}