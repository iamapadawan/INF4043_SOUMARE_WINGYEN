import org.junit.Before;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import com.sun.xml.internal.ws.policy.AssertionSet;

import fr.esiea.unique.binome.name.LetterGameEngine.SharedBag;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
/*
 * Creation : 6 févr. 2017
 */

public class SharedBagTest{
    SharedBag lSharedBag = new SharedBag();
    
    @Before
    public void Setup(){
        //TODO see if correct Ahmed
        //check if the list of letter is initialised and empty
        Assertions.assertThat(lSharedBag.clearBag()).isTrue();       
    }
    
    @Test
    public void TestAddLetterInTheBag(){
        //We will try to add letter in the bag
        Assertions.assertThat(lSharedBag.addLetter(this.createListOfLetter()).isTrue();
    }
    private List <Character> createListOfLetter(){
        List<Character> lListOfLetter = new ArrayList<>();
        lListOfLetter.add("a");
        lListOfLetter.add("h");
        lListOfLetter.add("m");
        lListOfLetter.add("e");
        lListOfLetter.add("d");
        return lListOfLetter;
    }

}
