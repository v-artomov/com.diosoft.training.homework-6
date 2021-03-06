import junit.framework.TestCase;

import java.util.ArrayList;

public class ArrayHelperTest extends TestCase {

    public void testPrintln() throws Exception {
        //
        // create first 6 phone models (leftArray):
        ArrayList leftArray = new ArrayList(6);
        leftArray.add(new Phone.Builder().vendor("LG").model("A100").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A101").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A102").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A103").screenSize(22).build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A104").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A105").build());
        //
        // create resource delegate:
        ArrayHelperResource resource = new ArrayHelperResource();
        //
        // result:
        //local code review (vtegza): you should create your resource with Mockito and pass it to testClass @ 1/11/2015
        //local code review (vtegza): describe mock behave with when @ 1/11/2015
        ArrayHelper AH = new ArrayHelper(resource);
        AH.println(leftArray);
        //local code review (vtegza): check interactions with mock @ 1/11/2015
    }

    public void testMerge() throws Exception {
        //
        // create first 6 phone models (leftArray):
        ArrayList leftArray = new ArrayList(6);
        leftArray.add(new Phone.Builder().vendor("LG").model("A100").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A101").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A102").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A103").screenSize(22).build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A104").build());
        leftArray.add(new Phone.Builder().vendor("LG").model("A105").build());
        //
        // create second 6 phone models (rightArray):
        ArrayList rightArray = new ArrayList(6);
        rightArray.add(new Phone.Builder().vendor("SONY").model("SE15").build());
        rightArray.add(new Phone.Builder().vendor("SONY").model("SE16").screenSize(17).build());
        rightArray.add(new Phone.Builder().vendor("SONY").model("SE17").build());
        rightArray.add(new Phone.Builder().vendor("LG").model("A103").screenSize(22).build()); // <-- DUPLICATE !
        rightArray.add(new Phone.Builder().vendor("APPLE").model("iPhone5").build());
        rightArray.add(new Phone.Builder().vendor("APPLE").model("iPhone6").build());
        //
        // create resource delegate:
        ArrayHelperResource resource = new ArrayHelperResource();
        //
        // result:
        //local code review (vtegza): you should create your resource with Mockito and pass it to testClass @ 1/11/2015
        //local code review (vtegza): describe mock behave with when @ 1/11/2015
        ArrayHelper AH = new ArrayHelper(resource);
        ArrayList merged = AH.merge(leftArray, rightArray);
        AH.println(merged);
        //local code review (vtegza): check interactions with mock @ for merge 1/11/2015
        //local code review (vtegza): check interactions with mock @ println 1/11/2015
    }
}