import java.util.ArrayList;

/**
 * Created by Artomov on 18.12.2014.
 *
 */

public class ArrayHelper {

    //local code review (vtegza): no need for comments here @ 1/11/2015
    //
    // resource for delegating:
    private final ArrayHelperResource resource;
    //
    //
    public ArrayHelper(ArrayHelperResource resource) {
        this.resource = resource;
    }
    //
    // delegate 'println':
    public void println(ArrayList phones) {
        resource.println(phones);
    }
    //
    // delegate 'merge':
    public ArrayList merge(ArrayList leftArray, ArrayList rightArray) {
        return resource.merge(leftArray, rightArray);
    }
}